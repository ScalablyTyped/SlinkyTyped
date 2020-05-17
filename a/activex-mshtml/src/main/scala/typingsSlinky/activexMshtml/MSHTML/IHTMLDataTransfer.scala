package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLDataTransfer extends js.Object {
  @JSName("MSHTML.IHTMLDataTransfer_typekey")
  var MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer = js.native
  var dropEffect: String = js.native
  var effectAllowed: String = js.native
  def clearData(format: String): Boolean = js.native
  def getData(format: String): js.Any = js.native
  def setData(format: String, data: js.Any): Boolean = js.native
}

object IHTMLDataTransfer {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer,
    clearData: String => Boolean,
    dropEffect: String,
    effectAllowed: String,
    getData: String => js.Any,
    setData: (String, js.Any) => Boolean
  ): IHTMLDataTransfer = {
    val __obj = js.Dynamic.literal(clearData = js.Any.fromFunction1(clearData), dropEffect = dropEffect.asInstanceOf[js.Any], effectAllowed = effectAllowed.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), setData = js.Any.fromFunction2(setData))
    __obj.updateDynamic("MSHTML.IHTMLDataTransfer_typekey")(MSHTMLDotIHTMLDataTransfer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDataTransfer]
  }
  @scala.inline
  implicit class IHTMLDataTransferOps[Self <: IHTMLDataTransfer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLDataTransfer_typekey(value: IHTMLDataTransfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLDataTransfer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearData(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDropEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectAllowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetData(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetData(value: (String, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadDialogProcParam extends js.Object {
  @JSName("MSHTML.ThreadDialogProcParam_typekey")
  var MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam = js.native
  val document: js.Any = js.native
  val moniker: js.Any = js.native
  val optionString: js.Any = js.native
  val parameters: js.Any = js.native
}

object ThreadDialogProcParam {
  @scala.inline
  def apply(
    MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam,
    document: js.Any,
    moniker: js.Any,
    optionString: js.Any,
    parameters: js.Any
  ): ThreadDialogProcParam = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], optionString = optionString.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ThreadDialogProcParam_typekey")(MSHTMLDotThreadDialogProcParam_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDialogProcParam]
  }
  @scala.inline
  implicit class ThreadDialogProcParamOps[Self <: ThreadDialogProcParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotThreadDialogProcParam_typekey(value: ThreadDialogProcParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ThreadDialogProcParam_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoniker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moniker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionString(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


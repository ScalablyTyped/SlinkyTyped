package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDialog extends js.Object {
  @JSName("MSHTML.HTMLDialog_typekey")
  var MSHTMLDotHTMLDialog_typekey: HTMLDialog = js.native
  val dialogArguments: js.Any = js.native
  var dialogHeight: js.Any = js.native
  var dialogLeft: js.Any = js.native
  var dialogTop: js.Any = js.native
  var dialogWidth: js.Any = js.native
  val menuArguments: js.Any = js.native
  var returnValue: js.Any = js.native
  def close(): Unit = js.native
}

object HTMLDialog {
  @scala.inline
  def apply(
    MSHTMLDotHTMLDialog_typekey: HTMLDialog,
    close: () => Unit,
    dialogArguments: js.Any,
    dialogHeight: js.Any,
    dialogLeft: js.Any,
    dialogTop: js.Any,
    dialogWidth: js.Any,
    menuArguments: js.Any,
    returnValue: js.Any
  ): HTMLDialog = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dialogArguments = dialogArguments.asInstanceOf[js.Any], dialogHeight = dialogHeight.asInstanceOf[js.Any], dialogLeft = dialogLeft.asInstanceOf[js.Any], dialogTop = dialogTop.asInstanceOf[js.Any], dialogWidth = dialogWidth.asInstanceOf[js.Any], menuArguments = menuArguments.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDialog_typekey")(MSHTMLDotHTMLDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDialog]
  }
  @scala.inline
  implicit class HTMLDialogOps[Self <: HTMLDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLDialog_typekey(value: HTMLDialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLDialog_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDialogArguments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogTop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuArguments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


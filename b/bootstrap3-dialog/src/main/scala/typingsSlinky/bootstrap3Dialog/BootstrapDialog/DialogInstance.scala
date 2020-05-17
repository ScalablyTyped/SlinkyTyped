package typingsSlinky.bootstrap3Dialog.BootstrapDialog

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogInstance extends js.Object {
  @JSName("$modal")
  var $modal: JQuery[HTMLElement] = js.native
  @JSName("$modalBody")
  var $modalBody: JQuery[HTMLElement] = js.native
  @JSName("$modalContent")
  var $modalContent: JQuery[HTMLElement] = js.native
  @JSName("$modalDialog")
  var $modalDialog: JQuery[HTMLElement] = js.native
  @JSName("$modalFooter")
  var $modalFooter: JQuery[HTMLElement] = js.native
  @JSName("$modalHeader")
  var $modalHeader: JQuery[HTMLElement] = js.native
  var opened: Boolean = js.native
  var options: DialogOptions = js.native
}

object DialogInstance {
  @scala.inline
  def apply(
    $modal: JQuery[HTMLElement],
    $modalBody: JQuery[HTMLElement],
    $modalContent: JQuery[HTMLElement],
    $modalDialog: JQuery[HTMLElement],
    $modalFooter: JQuery[HTMLElement],
    $modalHeader: JQuery[HTMLElement],
    opened: Boolean,
    options: DialogOptions
  ): DialogInstance = {
    val __obj = js.Dynamic.literal($modal = $modal.asInstanceOf[js.Any], $modalBody = $modalBody.asInstanceOf[js.Any], $modalContent = $modalContent.asInstanceOf[js.Any], $modalDialog = $modalDialog.asInstanceOf[js.Any], $modalFooter = $modalFooter.asInstanceOf[js.Any], $modalHeader = $modalHeader.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogInstance]
  }
  @scala.inline
  implicit class DialogInstanceOps[Self <: DialogInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$modal(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$modalBody(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$modalBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$modalContent(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$modalContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$modalDialog(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$modalDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$modalFooter(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$modalFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$modalHeader(value: JQuery[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$modalHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: DialogOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


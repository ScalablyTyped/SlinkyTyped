package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionItemEventArgs extends ProcessingModeEventArgs {
  val htmlElement: js.Object = js.native
  val htmlEvent: js.Object = js.native
  val item: BootstrapAccordionItem = js.native
}

object AccordionItemEventArgs {
  @scala.inline
  def apply(
    htmlElement: js.Object,
    htmlEvent: js.Object,
    item: BootstrapAccordionItem,
    processOnServer: Boolean,
    sender: Control
  ): AccordionItemEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionItemEventArgs]
  }
  @scala.inline
  implicit class AccordionItemEventArgsOps[Self <: AccordionItemEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlElement(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlEvent(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: BootstrapAccordionItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


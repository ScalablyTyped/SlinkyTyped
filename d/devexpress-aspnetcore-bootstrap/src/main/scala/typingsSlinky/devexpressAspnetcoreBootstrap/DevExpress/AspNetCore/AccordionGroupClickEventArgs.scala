package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionGroupClickEventArgs extends AccordionGroupCancelEventArgs {
  val htmlElement: js.Object = js.native
  val htmlEvent: js.Object = js.native
}

object AccordionGroupClickEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    group: BootstrapAccordionGroup,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: Boolean,
    sender: Control
  ): AccordionGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionGroupClickEventArgs]
  }
  @scala.inline
  implicit class AccordionGroupClickEventArgsOps[Self <: AccordionGroupClickEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}


package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on accordion groups.
  */
@js.native
trait BootstrapClientAccordionGroupCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the group object related to the event.
    */
  var group: BootstrapClientAccordionGroup = js.native
}

object BootstrapClientAccordionGroupCancelEventArgs {
  @scala.inline
  def apply(cancel: Boolean, group: BootstrapClientAccordionGroup, processOnServer: Boolean): BootstrapClientAccordionGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientAccordionGroupCancelEventArgs]
  }
  @scala.inline
  implicit class BootstrapClientAccordionGroupCancelEventArgsOps[Self <: BootstrapClientAccordionGroupCancelEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: BootstrapClientAccordionGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


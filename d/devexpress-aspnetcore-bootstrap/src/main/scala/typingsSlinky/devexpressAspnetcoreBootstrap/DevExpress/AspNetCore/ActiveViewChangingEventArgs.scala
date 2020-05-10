package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveViewChangingEventArgs extends EventArgs {
  var cancel: Boolean = js.native
  val newView: BootstrapSchedulerViewType = js.native
  val oldView: BootstrapSchedulerViewType = js.native
}

object ActiveViewChangingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    newView: BootstrapSchedulerViewType,
    oldView: BootstrapSchedulerViewType,
    sender: Control
  ): ActiveViewChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], newView = newView.asInstanceOf[js.Any], oldView = oldView.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveViewChangingEventArgs]
  }
  @scala.inline
  implicit class ActiveViewChangingEventArgsOps[Self <: ActiveViewChangingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewView(value: BootstrapSchedulerViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldView(value: BootstrapSchedulerViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


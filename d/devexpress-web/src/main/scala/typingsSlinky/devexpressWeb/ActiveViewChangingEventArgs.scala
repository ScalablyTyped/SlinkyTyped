package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side ASPxClientScheduler.ActiveViewChanging event.
  */
@js.native
trait ActiveViewChangingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the change of active view should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Gets the new value of the ASPxScheduler.ActiveView property.
    */
  var newView: ASPxSchedulerViewType = js.native
  /**
    * Gets the value of the ASPxScheduler.ActiveView property before modification.
    */
  var oldView: ASPxSchedulerViewType = js.native
}

object ActiveViewChangingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, newView: ASPxSchedulerViewType, oldView: ASPxSchedulerViewType): ActiveViewChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], newView = newView.asInstanceOf[js.Any], oldView = oldView.asInstanceOf[js.Any])
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
    def withNewView(value: ASPxSchedulerViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldView(value: ASPxSchedulerViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


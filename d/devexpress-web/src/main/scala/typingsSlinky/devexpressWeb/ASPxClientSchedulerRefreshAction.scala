package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds action types for the client-side ASPxClientScheduler.Refresh method.
  */
@js.native
trait ASPxClientSchedulerRefreshAction extends js.Object {
  /**
    * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its satellite View controls.
    */
  var ActiveViewTypeChanged: Double = js.native
  /**
    * Gets the value of the action parameter which initiates a simple reload of the control.
    */
  var None: Double = js.native
  /**
    * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its data-dependent satellites.
    */
  var VisibleIntervalChanged: Double = js.native
}

object ASPxClientSchedulerRefreshAction {
  @scala.inline
  def apply(ActiveViewTypeChanged: Double, None: Double, VisibleIntervalChanged: Double): ASPxClientSchedulerRefreshAction = {
    val __obj = js.Dynamic.literal(ActiveViewTypeChanged = ActiveViewTypeChanged.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], VisibleIntervalChanged = VisibleIntervalChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerRefreshAction]
  }
  @scala.inline
  implicit class ASPxClientSchedulerRefreshActionOps[Self <: ASPxClientSchedulerRefreshAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveViewTypeChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveViewTypeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("None")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleIntervalChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleIntervalChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


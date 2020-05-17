package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxSchedulerToolTipBase control.
  */
@js.native
trait ASPxClientToolTipBase extends js.Object {
  /**
    * Gets the tooltip position. An ASPxClientPoint object representing the tooltip position.
    * @param bounds An object that represents the tooltip bounds.
    */
  def CalculatePosition(bounds: js.Any): ASPxClientPoint = js.native
  /**
    * Returns the value that indicates whether or not the tooltip can be displayed.
    */
  def CanShowToolTip(): Boolean = js.native
  /**
    * Closes the tooltip.
    */
  def Close(): Unit = js.native
  /**
    * Returns the string representation of the specified interval. A string containing a textual representation of the interval.
    * @param interval An ASPxClientTimeInterval object to convert.
    */
  def ConvertIntervalToString(interval: ASPxClientTimeInterval): String = js.native
  /**
    * Ends updating the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def FinalizeUpdate(toolTipData: ASPxClientSchedulerToolTipData): Unit = js.native
  /**
    * Displays the Appointment Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowAppointmentMenu(eventObject: js.Any): Unit = js.native
  /**
    * Displays the View Menu at the position of the tooltip.
    * @param eventObject An object containing information about the event in which the menu is displayed.
    */
  def ShowViewMenu(eventObject: js.Any): Unit = js.native
  /**
    * Updates the tooltip content.
    * @param toolTipData An ASPxClientSchedulerToolTipData object providing data required to update the tooltip content.
    */
  def Update(toolTipData: ASPxClientSchedulerToolTipData): Unit = js.native
}

object ASPxClientToolTipBase {
  @scala.inline
  def apply(
    CalculatePosition: js.Any => ASPxClientPoint,
    CanShowToolTip: () => Boolean,
    Close: () => Unit,
    ConvertIntervalToString: ASPxClientTimeInterval => String,
    FinalizeUpdate: ASPxClientSchedulerToolTipData => Unit,
    ShowAppointmentMenu: js.Any => Unit,
    ShowViewMenu: js.Any => Unit,
    Update: ASPxClientSchedulerToolTipData => Unit
  ): ASPxClientToolTipBase = {
    val __obj = js.Dynamic.literal(CalculatePosition = js.Any.fromFunction1(CalculatePosition), CanShowToolTip = js.Any.fromFunction0(CanShowToolTip), Close = js.Any.fromFunction0(Close), ConvertIntervalToString = js.Any.fromFunction1(ConvertIntervalToString), FinalizeUpdate = js.Any.fromFunction1(FinalizeUpdate), ShowAppointmentMenu = js.Any.fromFunction1(ShowAppointmentMenu), ShowViewMenu = js.Any.fromFunction1(ShowViewMenu), Update = js.Any.fromFunction1(Update))
    __obj.asInstanceOf[ASPxClientToolTipBase]
  }
  @scala.inline
  implicit class ASPxClientToolTipBaseOps[Self <: ASPxClientToolTipBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculatePosition(value: js.Any => ASPxClientPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalculatePosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanShowToolTip(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanShowToolTip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConvertIntervalToString(value: ASPxClientTimeInterval => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConvertIntervalToString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinalizeUpdate(value: ASPxClientSchedulerToolTipData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalizeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowAppointmentMenu(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowAppointmentMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowViewMenu(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowViewMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ASPxClientSchedulerToolTipData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


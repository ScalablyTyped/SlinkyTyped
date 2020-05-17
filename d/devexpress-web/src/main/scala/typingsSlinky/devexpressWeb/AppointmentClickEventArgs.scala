package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentClick and the ASPxClientScheduler.AppointmentDoubleClick events.
  */
@js.native
trait AppointmentClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the client appointment ID for the appointment being clicked.
    */
  var appointmentId: String = js.native
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any = js.native
}

object AppointmentClickEventArgs {
  @scala.inline
  def apply(appointmentId: String, handled: Boolean, htmlElement: js.Any): AppointmentClickEventArgs = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentClickEventArgs]
  }
  @scala.inline
  implicit class AppointmentClickEventArgsOps[Self <: AppointmentClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


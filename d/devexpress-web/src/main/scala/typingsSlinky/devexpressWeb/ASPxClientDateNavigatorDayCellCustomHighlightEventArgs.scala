package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
@js.native
trait ASPxClientDateNavigatorDayCellCustomHighlightEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the processed appointments.
    */
  var appointments: js.Array[ASPxClientAppointment] = js.native
  /**
    * Provides access to the date object of the processed cell.
    */
  var date: js.Date = js.native
  /**
    * Gets the HTML element that the event was triggered on.
    */
  var htmlElement: js.Any = js.native
}

object ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  @scala.inline
  def apply(appointments: js.Array[ASPxClientAppointment], date: js.Date, htmlElement: js.Any): ASPxClientDateNavigatorDayCellCustomHighlightEventArgs = {
    val __obj = js.Dynamic.literal(appointments = appointments.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorDayCellCustomHighlightEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDateNavigatorDayCellCustomHighlightEventArgsOps[Self <: ASPxClientDateNavigatorDayCellCustomHighlightEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppointments(value: js.Array[ASPxClientAppointment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
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


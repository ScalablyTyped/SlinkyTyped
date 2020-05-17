package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
@JSGlobal("ASPxClientDateNavigatorDayCellCustomHighlightEventArgs")
@js.native
class ASPxClientDateNavigatorDayCellCustomHighlightEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDateNavigatorDayCellCustomHighlightEventArgs class.
    * @param htmlElement An object representing the HTML element.
    * @param date A DateTime object that represents the highlighted date.
    * @param appointments An array of ASPxClientAppointment objects that the highlighted day cell contains.
    */
  def this(
    htmlElement: js.Any,
    date: js.Date,
    appointments: js.Array[typingsSlinky.devexpressWeb.ASPxClientAppointment]
  ) = this()
}


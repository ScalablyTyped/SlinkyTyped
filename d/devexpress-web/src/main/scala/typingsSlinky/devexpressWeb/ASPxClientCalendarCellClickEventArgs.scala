package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateEdit.CalendarCellClick event.
  */
@JSGlobal("ASPxClientCalendarCellClickEventArgs")
@js.native
class ASPxClientCalendarCellClickEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCalendarCellClickEventArgs class.
    * @param date A DateTime object representing the clicked date cell.
    */
  def this(date: js.Date) = this()
  /**
    * Gets the date that relates to the processed calendar's cell click.
    */
  var date: js.Date = js.native
}


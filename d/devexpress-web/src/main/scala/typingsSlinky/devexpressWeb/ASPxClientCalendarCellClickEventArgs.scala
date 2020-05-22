package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateEdit.CalendarCellClick event.
  */
trait ASPxClientCalendarCellClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the date that relates to the processed calendar's cell click.
    */
  var date: js.Date
}

object ASPxClientCalendarCellClickEventArgs {
  @scala.inline
  def apply(date: js.Date): ASPxClientCalendarCellClickEventArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendarCellClickEventArgs]
  }
}


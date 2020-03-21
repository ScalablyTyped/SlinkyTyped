package typingsSlinky.officeUiFabricReact.calendarDayMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDayInfo extends js.Object {
  var date: String
  var isInBounds: Boolean
  var isInMonth: Boolean
  var isSelected: Boolean
  var isToday: Boolean
  var key: String
  var originalDate: js.Date
  def onSelected(ev: SyntheticEvent[Event_, HTMLElement]): Unit
}

object IDayInfo {
  @scala.inline
  def apply(
    date: String,
    isInBounds: Boolean,
    isInMonth: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    key: String,
    onSelected: SyntheticEvent[Event_, HTMLElement] => Unit,
    originalDate: js.Date
  ): IDayInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onSelected = js.Any.fromFunction1(onSelected), originalDate = originalDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDayInfo]
  }
}


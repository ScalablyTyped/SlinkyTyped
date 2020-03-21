package typingsSlinky.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<rc-picker.rc-picker/lib/interface.PanelMode, 'datetime' | 'decade'> */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcPicker.rcPickerStrings.month
  - typingsSlinky.rcPicker.rcPickerStrings.date
  - typingsSlinky.rcPicker.rcPickerStrings.year
  - typingsSlinky.rcPicker.rcPickerStrings.week
  - typingsSlinky.rcPicker.rcPickerStrings.time
*/
trait PickerMode extends js.Object

object PickerMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.rcPicker.rcPickerStrings.date = this.cast("date")
  @scala.inline
  def month: typingsSlinky.rcPicker.rcPickerStrings.month = this.cast("month")
  @scala.inline
  def time: typingsSlinky.rcPicker.rcPickerStrings.time = this.cast("time")
  @scala.inline
  def week: typingsSlinky.rcPicker.rcPickerStrings.week = this.cast("week")
  @scala.inline
  def year: typingsSlinky.rcPicker.rcPickerStrings.year = this.cast("year")
}


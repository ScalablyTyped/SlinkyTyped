package typingsSlinky.rcPicker.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcPicker.rcPickerStrings.time
  - typingsSlinky.rcPicker.rcPickerStrings.date
  - typingsSlinky.rcPicker.rcPickerStrings.week
  - typingsSlinky.rcPicker.rcPickerStrings.month
  - typingsSlinky.rcPicker.rcPickerStrings.year
  - typingsSlinky.rcPicker.rcPickerStrings.decade
*/
trait PanelMode extends js.Object

object PanelMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.rcPicker.rcPickerStrings.date = this.cast("date")
  @scala.inline
  def decade: typingsSlinky.rcPicker.rcPickerStrings.decade = this.cast("decade")
  @scala.inline
  def month: typingsSlinky.rcPicker.rcPickerStrings.month = this.cast("month")
  @scala.inline
  def time: typingsSlinky.rcPicker.rcPickerStrings.time = this.cast("time")
  @scala.inline
  def week: typingsSlinky.rcPicker.rcPickerStrings.week = this.cast("week")
  @scala.inline
  def year: typingsSlinky.rcPicker.rcPickerStrings.year = this.cast("year")
}


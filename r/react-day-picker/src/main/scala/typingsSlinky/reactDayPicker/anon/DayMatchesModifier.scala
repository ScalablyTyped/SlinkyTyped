package typingsSlinky.reactDayPicker.anon

import typingsSlinky.reactDayPicker.commonMod.Modifier
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayMatchesModifier extends js.Object {
  def dayMatchesModifier(day: js.Date): Boolean = js.native
  def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
  def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
  def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
}


package typingsSlinky.reactDayPicker.modifiersMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiersUtils extends js.Object {
  
  def dayMatchesModifier(day: js.Date): Boolean = js.native
  def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
  def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
  
  def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
}
@JSImport("react-day-picker/types/Modifiers", "ModifiersUtils")
@js.native
object ModifiersUtils extends js.Object {
  
  def dayMatchesModifier(day: js.Date): Boolean = js.native
  def dayMatchesModifier(day: js.Date, modifier: js.Array[Modifier]): Boolean = js.native
  def dayMatchesModifier(day: js.Date, modifier: Modifier): Boolean = js.native
  
  def getModifiersForDay(day: js.Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
}

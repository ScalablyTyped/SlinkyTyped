package typingsSlinky.isHotkey.mod

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-hotkey", "isHotkey")
@js.native
object isHotkey extends js.Object {
  
  def apply(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: String, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: js.Array[String], event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
}

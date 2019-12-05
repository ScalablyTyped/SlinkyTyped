package typingsSlinky.isDashHotkey.isDashHotkeyMod

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-hotkey", "isHotkey")
@js.native
object isHotkey extends js.Object {
  def apply(hotkey: String): Boolean = js.native
  def apply(hotkey: String, options: HotKeyOptions): Boolean = js.native
  def apply(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: typingsSlinky.std.KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: typingsSlinky.std.KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String]): Boolean = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions): Boolean = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: typingsSlinky.std.KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: typingsSlinky.std.KeyboardEvent, event: KeyboardEvent): Boolean = js.native
}


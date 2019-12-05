package typingsSlinky.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotkeysProviderChained extends js.Object {
  def add(
    combo: String,
    description: String,
    callback: js.Function2[
      /* event */ Event, 
      /* hotkeys */ typingsSlinky.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.Hotkey, 
      Unit
    ]
  ): typingsSlinky.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.HotkeysProviderChained = js.native
  def add(
    combo: js.Array[String],
    description: String,
    callback: js.Function2[
      /* event */ Event, 
      /* hotkeys */ typingsSlinky.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.Hotkey, 
      Unit
    ]
  ): typingsSlinky.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.HotkeysProviderChained = js.native
  def add(hotkeyObj: typingsSlinky.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.Hotkey): typingsSlinky.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.HotkeysProviderChained = js.native
}


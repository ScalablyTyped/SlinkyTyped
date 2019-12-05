package typingsSlinky.reactDashHotkeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHotkeysMod {
  import slinky.core.ReactComponentClass

  type ActionName = String
  type ApplicationKeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: std.Array<react-hotkeys.react-hotkeys.MouseTrapKeySequence>}
    */ typingsSlinky.reactDashHotkeys.reactDashHotkeysStrings.ApplicationKeyMap with js.Any
  type HotKeysEnabled = ReactComponentClass[HotKeysProps]
  type HotKeysIgnoreOverride = ReactComponentClass[HotKeysProps]
  type KeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeySequence}
    */ typingsSlinky.reactDashHotkeys.reactDashHotkeysStrings.KeyMap with js.Any
  type KeySequence = MouseTrapKeySequence | KeyMapOptions | (js.Array[KeyMapOptions | MouseTrapKeySequence])
  type ListOfKeys = String | js.Array[String]
  type MouseTrapKeySequence = String | js.Array[String]
}

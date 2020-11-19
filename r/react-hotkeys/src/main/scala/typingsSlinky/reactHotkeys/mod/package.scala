package typingsSlinky.reactHotkeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionName = java.lang.String
  
  type ApplicationKeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeyMapDisplayOptions}
    */ typingsSlinky.reactHotkeys.reactHotkeysStrings.ApplicationKeyMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type HotKeysEnabled = slinky.core.ReactComponentClass[typingsSlinky.reactHotkeys.mod.HotKeysProps]
  
  type HotKeysIgnoreOverride = slinky.core.ReactComponentClass[typingsSlinky.reactHotkeys.mod.HotKeysProps]
  
  type KeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeySequence}
    */ typingsSlinky.reactHotkeys.reactHotkeysStrings.KeyMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type KeyName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactHotkeys.mod.MouseTrapKeySequence
    - typingsSlinky.reactHotkeys.mod.KeyMapOptions
    - typingsSlinky.reactHotkeys.mod.ExtendedKeyMapOptions
    - js.Array[
  typingsSlinky.reactHotkeys.mod.KeyMapOptions | typingsSlinky.reactHotkeys.mod.MouseTrapKeySequence]
  */
  type KeySequence = typingsSlinky.reactHotkeys.mod._KeySequence | (js.Array[
    typingsSlinky.reactHotkeys.mod.KeyMapOptions | typingsSlinky.reactHotkeys.mod.MouseTrapKeySequence
  ]) | typingsSlinky.reactHotkeys.mod.MouseTrapKeySequence
  
  type ListOfKeys = java.lang.String | js.Array[java.lang.String]
  
  type MouseTrapKeySequence = java.lang.String | js.Array[java.lang.String]
  
  type ReactComponent = (slinky.core.ReactComponentClass[typingsSlinky.reactHotkeys.mod.ComponentProps | js.Object]) | java.lang.String
  
  type TabIndex = java.lang.String | scala.Double
  
  type cancelKeyCombinationListener = js.Function0[scala.Unit]
}

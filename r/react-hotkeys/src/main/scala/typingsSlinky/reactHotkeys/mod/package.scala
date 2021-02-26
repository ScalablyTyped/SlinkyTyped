package typingsSlinky.reactHotkeys

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def configure(options: typingsSlinky.reactHotkeys.mod.ConfigurationOptions): scala.Unit = typingsSlinky.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def deprecatedWithHotKeys(keyMap: org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactHotkeys.mod.KeySequence]): typingsSlinky.reactHotkeys.mod.HotKeys = typingsSlinky.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deprecatedWithHotKeys")(keyMap.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactHotkeys.mod.HotKeys]
  
  @scala.inline
  def getApplicationKeyMap(): typingsSlinky.reactHotkeys.mod.ApplicationKeyMap = typingsSlinky.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationKeyMap")().asInstanceOf[typingsSlinky.reactHotkeys.mod.ApplicationKeyMap]
  
  @scala.inline
  def recordKeyCombination(
    callbackFunction: js.Function1[/* keyCombination */ typingsSlinky.reactHotkeys.mod.KeyCombination, scala.Unit]
  ): typingsSlinky.reactHotkeys.mod.cancelKeyCombinationListener = typingsSlinky.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("recordKeyCombination")(callbackFunction.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactHotkeys.mod.cancelKeyCombinationListener]
  
  @scala.inline
  def withHotKeys(
    Component: slinky.core.ReactComponentClass[js.Object],
    hotKeysOptions: typingsSlinky.reactHotkeys.mod.HotKeysEnabledProps
  ): slinky.core.ReactComponentClass[typingsSlinky.reactHotkeys.mod.HotKeysProps] = (typingsSlinky.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withHotKeys")(Component.asInstanceOf[js.Any], hotKeysOptions.asInstanceOf[js.Any])).asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactHotkeys.mod.HotKeysProps]]
  
  @scala.inline
  def withIgnoreKeys(
    Component: slinky.core.ReactComponentClass[js.Object],
    hotKeysIgnoreOptions: typingsSlinky.reactHotkeys.mod.HotKeysOverrideProps
  ): typingsSlinky.reactHotkeys.mod.IgnoreKeys = (typingsSlinky.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withIgnoreKeys")(Component.asInstanceOf[js.Any], hotKeysIgnoreOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactHotkeys.mod.IgnoreKeys]
  
  @scala.inline
  def withObserveKeys(
    Component: slinky.core.ReactComponentClass[js.Object],
    hotKeysIgnoreOptions: typingsSlinky.reactHotkeys.mod.HotKeysOverrideProps
  ): typingsSlinky.reactHotkeys.mod.ObserveKeys = (typingsSlinky.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withObserveKeys")(Component.asInstanceOf[js.Any], hotKeysIgnoreOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactHotkeys.mod.ObserveKeys]
}

package typingsSlinky.reduxShortcuts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionBindings = typingsSlinky.redux.mod.ActionCreator[typingsSlinky.redux.mod.Action[js.Any]] | js.Array[typingsSlinky.redux.mod.ActionCreator[typingsSlinky.redux.mod.Action[js.Any]]]
  
  type BasicShortcutDefinition = js.Tuple2[
    typingsSlinky.reduxShortcuts.mod.KeyBindings, 
    typingsSlinky.reduxShortcuts.mod.ActionBindings
  ]
  
  type KeyBindings = java.lang.String | js.Array[java.lang.String]
  
  type Mousetrap_ = typingsSlinky.reduxShortcuts.mod.Mousetrap__
  
  type ShortcutDefinition = typingsSlinky.reduxShortcuts.mod.BasicShortcutDefinition | typingsSlinky.reduxShortcuts.mod.ShortcutDefinitionWithPreventDefault
  
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[
    typingsSlinky.reduxShortcuts.mod.KeyBindings, 
    typingsSlinky.reduxShortcuts.mod.ActionBindings, 
    scala.Boolean
  ]
}

package typingsSlinky.reduxShortcuts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicShortcutDefinition = js.Tuple2[
    typingsSlinky.reduxShortcuts.mod.KeyBindings, 
    typingsSlinky.reduxShortcuts.mod.ActionBindings
  ]
  type Mousetrap_ = typingsSlinky.reduxShortcuts.mod.Mousetrap__
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[
    typingsSlinky.reduxShortcuts.mod.KeyBindings, 
    typingsSlinky.reduxShortcuts.mod.ActionBindings, 
    scala.Boolean
  ]
}

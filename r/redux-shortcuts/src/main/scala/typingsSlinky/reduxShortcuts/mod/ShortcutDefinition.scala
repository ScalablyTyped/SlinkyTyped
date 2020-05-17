package typingsSlinky.reduxShortcuts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxShortcuts.mod.BasicShortcutDefinition
  - typingsSlinky.reduxShortcuts.mod.ShortcutDefinitionWithPreventDefault
*/
trait ShortcutDefinition extends js.Object

object ShortcutDefinition {
  @scala.inline
  implicit def apply(value: BasicShortcutDefinition): ShortcutDefinition = value.asInstanceOf[ShortcutDefinition]
  @scala.inline
  implicit def apply(value: ShortcutDefinitionWithPreventDefault): ShortcutDefinition = value.asInstanceOf[ShortcutDefinition]
}


package typingsSlinky.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactHotkeys.mod.MouseTrapKeySequence
  - typingsSlinky.reactHotkeys.mod.KeyMapOptions
  - typingsSlinky.reactHotkeys.mod.ExtendedKeyMapOptions
  - js.Array[
typingsSlinky.reactHotkeys.mod.KeyMapOptions | typingsSlinky.reactHotkeys.mod.MouseTrapKeySequence]
*/
trait KeySequence extends js.Object

object KeySequence {
  @scala.inline
  implicit def apply(value: js.Array[KeyMapOptions | MouseTrapKeySequence]): KeySequence = value.asInstanceOf[KeySequence]
  @scala.inline
  implicit def apply(value: ExtendedKeyMapOptions): KeySequence = value.asInstanceOf[KeySequence]
  @scala.inline
  implicit def apply(value: KeyMapOptions): KeySequence = value.asInstanceOf[KeySequence]
  @scala.inline
  implicit def apply(value: MouseTrapKeySequence): KeySequence = value.asInstanceOf[KeySequence]
}


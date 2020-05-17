package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.EscapeCharacterSet
  - typingsSlinky.regexpp.astMod.UnicodePropertyCharacterSet
  - typingsSlinky.regexpp.astMod.Character
  - typingsSlinky.regexpp.astMod.CharacterClassRange
*/
trait CharacterClassElement extends js.Object

object CharacterClassElement {
  @scala.inline
  implicit def apply(value: Character): CharacterClassElement = value.asInstanceOf[CharacterClassElement]
  @scala.inline
  implicit def apply(value: CharacterClassRange): CharacterClassElement = value.asInstanceOf[CharacterClassElement]
  @scala.inline
  implicit def apply(value: EscapeCharacterSet): CharacterClassElement = value.asInstanceOf[CharacterClassElement]
  @scala.inline
  implicit def apply(value: UnicodePropertyCharacterSet): CharacterClassElement = value.asInstanceOf[CharacterClassElement]
}


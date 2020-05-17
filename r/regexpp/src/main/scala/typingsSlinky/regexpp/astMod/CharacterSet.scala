package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.AnyCharacterSet
  - typingsSlinky.regexpp.astMod.EscapeCharacterSet
  - typingsSlinky.regexpp.astMod.UnicodePropertyCharacterSet
*/
trait CharacterSet
  extends LeafNode
     with QuantifiableElement

object CharacterSet {
  @scala.inline
  implicit def apply(value: AnyCharacterSet): CharacterSet = value.asInstanceOf[CharacterSet]
  @scala.inline
  implicit def apply(value: EscapeCharacterSet): CharacterSet = value.asInstanceOf[CharacterSet]
  @scala.inline
  implicit def apply(value: UnicodePropertyCharacterSet): CharacterSet = value.asInstanceOf[CharacterSet]
}


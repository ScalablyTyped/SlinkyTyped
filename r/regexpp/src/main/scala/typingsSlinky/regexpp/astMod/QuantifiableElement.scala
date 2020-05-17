package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.Group
  - typingsSlinky.regexpp.astMod.CapturingGroup
  - typingsSlinky.regexpp.astMod.CharacterClass
  - typingsSlinky.regexpp.astMod.CharacterSet
  - typingsSlinky.regexpp.astMod.Character
  - typingsSlinky.regexpp.astMod.Backreference
  - typingsSlinky.regexpp.astMod.LookaheadAssertion
*/
trait QuantifiableElement extends Element

object QuantifiableElement {
  @scala.inline
  implicit def apply(value: Backreference): QuantifiableElement = value.asInstanceOf[QuantifiableElement]
  @scala.inline
  implicit def apply(value: CapturingGroup): QuantifiableElement = value.asInstanceOf[QuantifiableElement]
  @scala.inline
  implicit def apply(value: Character): QuantifiableElement = value.asInstanceOf[QuantifiableElement]
  @scala.inline
  implicit def apply(value: CharacterClass): QuantifiableElement = value.asInstanceOf[QuantifiableElement]
  @scala.inline
  implicit def apply(value: CharacterSet): QuantifiableElement = value.asInstanceOf[QuantifiableElement]
  @scala.inline
  implicit def apply(value: Group): QuantifiableElement = value.asInstanceOf[QuantifiableElement]
  @scala.inline
  implicit def apply(value: LookaheadAssertion): QuantifiableElement = value.asInstanceOf[QuantifiableElement]
}


package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.Assertion
  - typingsSlinky.regexpp.astMod.Quantifier
  - typingsSlinky.regexpp.astMod.QuantifiableElement
*/
trait Element extends js.Object

object Element {
  @scala.inline
  implicit def apply(value: Assertion): Element = value.asInstanceOf[Element]
  @scala.inline
  implicit def apply(value: QuantifiableElement): Element = value.asInstanceOf[Element]
  @scala.inline
  implicit def apply(value: Quantifier): Element = value.asInstanceOf[Element]
}


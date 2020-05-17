package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.BoundaryAssertion
  - typingsSlinky.regexpp.astMod.LookaroundAssertion
*/
trait Assertion extends Element

object Assertion {
  @scala.inline
  implicit def apply(value: BoundaryAssertion): Assertion = value.asInstanceOf[Assertion]
  @scala.inline
  implicit def apply(value: LookaroundAssertion): Assertion = value.asInstanceOf[Assertion]
}


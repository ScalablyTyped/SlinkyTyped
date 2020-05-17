package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.LookaheadAssertion
  - typingsSlinky.regexpp.astMod.LookbehindAssertion
*/
trait LookaroundAssertion
  extends Assertion
     with BranchNode

object LookaroundAssertion {
  @scala.inline
  implicit def apply(value: LookaheadAssertion): LookaroundAssertion = value.asInstanceOf[LookaroundAssertion]
  @scala.inline
  implicit def apply(value: LookbehindAssertion): LookaroundAssertion = value.asInstanceOf[LookaroundAssertion]
}


package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.regexpp.astMod.EdgeAssertion
  - typingsSlinky.regexpp.astMod.WordBoundaryAssertion
*/
trait BoundaryAssertion
  extends Assertion
     with LeafNode

object BoundaryAssertion {
  @scala.inline
  implicit def apply(value: EdgeAssertion): BoundaryAssertion = value.asInstanceOf[BoundaryAssertion]
  @scala.inline
  implicit def apply(value: WordBoundaryAssertion): BoundaryAssertion = value.asInstanceOf[BoundaryAssertion]
}


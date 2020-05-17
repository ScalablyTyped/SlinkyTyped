package typingsSlinky.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.deepDiff.mod.PreFilterFunction
  - typingsSlinky.deepDiff.mod.PreFilterObject[LHS, RHS]
*/
trait PreFilter[LHS, RHS] extends js.Object

object PreFilter {
  @scala.inline
  implicit def apply[LHS, RHS](value: PreFilterFunction): PreFilter[LHS, RHS] = value.asInstanceOf[PreFilter[LHS, RHS]]
  @scala.inline
  implicit def apply[LHS, RHS](value: PreFilterObject[LHS, RHS]): PreFilter[LHS, RHS] = value.asInstanceOf[PreFilter[LHS, RHS]]
}


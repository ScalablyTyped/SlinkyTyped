package typingsSlinky.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("deep-diff", "orderIndependentDeepDiff")
@js.native
object orderIndependentDeepDiff extends js.Object {
  
  def apply[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    changes: js.Array[Diff_[LHS, RHS]],
    prefilter: PreFilter[LHS, RHS],
    path: js.Array[_],
    key: js.Any,
    stack: js.Array[_]
  ): Unit = js.native
}

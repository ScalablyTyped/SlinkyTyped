package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Intersection conditionally applied only when TParams is non-empty
// This is primarily to keep the signatures more intuitive.
/* Rewritten from type alias, can be one of: 
  - TTarget
  - js.Object with TTarget with TParams
*/
trait AugmentParams[TTarget, TParams] extends js.Object

object AugmentParams {
  @scala.inline
  implicit def apply[TTarget, TParams](value: js.Object with TTarget with TParams): AugmentParams[TTarget, TParams] = value.asInstanceOf[AugmentParams[TTarget, TParams]]
  @scala.inline
  implicit def apply[TTarget, TParams](value: TTarget): AugmentParams[TTarget, TParams] = value.asInstanceOf[AugmentParams[TTarget, TParams]]
}


package typingsSlinky.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.k6.httpMod.ArrayRefinedBatchRequest[RT]
  - typingsSlinky.k6.httpMod.ObjectRefinedBatchRequest[RT]
*/
trait RefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] extends js.Object

object RefinedBatchRequest {
  @scala.inline
  implicit def apply[RT](value: ArrayRefinedBatchRequest[RT]): RefinedBatchRequest[RT] = value.asInstanceOf[RefinedBatchRequest[RT]]
  @scala.inline
  implicit def apply[RT](value: ObjectRefinedBatchRequest[RT]): RefinedBatchRequest[RT] = value.asInstanceOf[RefinedBatchRequest[RT]]
  @scala.inline
  implicit def apply[RT](value: String): RefinedBatchRequest[RT] = value.asInstanceOf[RefinedBatchRequest[RT]]
}


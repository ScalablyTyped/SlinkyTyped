package typingsSlinky.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.k6.httpMod.ArrayBatchRequest
  - typingsSlinky.k6.httpMod.ObjectBatchRequest
*/
trait BatchRequest extends js.Object

object BatchRequest {
  @scala.inline
  implicit def apply(value: ArrayBatchRequest): BatchRequest = value.asInstanceOf[BatchRequest]
  @scala.inline
  implicit def apply(value: ObjectBatchRequest): BatchRequest = value.asInstanceOf[BatchRequest]
  @scala.inline
  implicit def apply(value: String): BatchRequest = value.asInstanceOf[BatchRequest]
}


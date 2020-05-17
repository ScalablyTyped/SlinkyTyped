package typingsSlinky.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.k6.httpMod.StructuredRequestBody
*/
trait RequestBody extends js.Object

object RequestBody {
  @scala.inline
  implicit def apply(value: String): RequestBody = value.asInstanceOf[RequestBody]
  @scala.inline
  implicit def apply(value: StructuredRequestBody): RequestBody = value.asInstanceOf[RequestBody]
}


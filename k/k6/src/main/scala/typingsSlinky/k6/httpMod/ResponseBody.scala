package typingsSlinky.k6.httpMod

import typingsSlinky.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.k6.mod.bytes
  - scala.Null
*/
trait ResponseBody extends js.Object

object ResponseBody {
  @scala.inline
  implicit def apply(value: Null): ResponseBody = value.asInstanceOf[ResponseBody]
  @scala.inline
  implicit def apply(value: String): ResponseBody = value.asInstanceOf[ResponseBody]
  @scala.inline
  implicit def apply(value: bytes): ResponseBody = value.asInstanceOf[ResponseBody]
}


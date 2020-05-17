package typingsSlinky.k6.httpMod

import typingsSlinky.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Null
  - typingsSlinky.k6.mod.bytes
*/
trait RefinedResponseBody[RT /* <: js.UndefOr[ResponseType] */] extends js.Object

object RefinedResponseBody {
  @scala.inline
  implicit def apply[RT](value: Null): RefinedResponseBody[RT] = value.asInstanceOf[RefinedResponseBody[RT]]
  @scala.inline
  implicit def apply[RT](value: String): RefinedResponseBody[RT] = value.asInstanceOf[RefinedResponseBody[RT]]
  @scala.inline
  implicit def apply[RT](value: bytes): RefinedResponseBody[RT] = value.asInstanceOf[RefinedResponseBody[RT]]
}


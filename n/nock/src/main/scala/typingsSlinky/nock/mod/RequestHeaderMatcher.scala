package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Function1[/ * fieldValue * / java.lang.String, scala.Boolean]
*/
trait RequestHeaderMatcher extends js.Object

object RequestHeaderMatcher {
  @scala.inline
  implicit def apply(value: js.Function1[/* fieldValue */ String, Boolean]): RequestHeaderMatcher = value.asInstanceOf[RequestHeaderMatcher]
  @scala.inline
  implicit def apply(value: js.RegExp): RequestHeaderMatcher = value.asInstanceOf[RequestHeaderMatcher]
  @scala.inline
  implicit def apply(value: String): RequestHeaderMatcher = value.asInstanceOf[RequestHeaderMatcher]
}


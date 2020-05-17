package typingsSlinky.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.nodeFetch.mod.URLLike
  - typingsSlinky.nodeFetch.mod.Request
*/
trait RequestInfo extends js.Object

object RequestInfo {
  @scala.inline
  implicit def apply(value: Request): RequestInfo = value.asInstanceOf[RequestInfo]
  @scala.inline
  implicit def apply(value: String): RequestInfo = value.asInstanceOf[RequestInfo]
  @scala.inline
  implicit def apply(value: URLLike): RequestInfo = value.asInstanceOf[RequestInfo]
}


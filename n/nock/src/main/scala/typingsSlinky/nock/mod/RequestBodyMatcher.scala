package typingsSlinky.nock.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.RegExp
  - typingsSlinky.nock.mod.DataMatcherArray
  - typingsSlinky.nock.mod.DataMatcherMap
  - js.Function1[/ * body * / js.Any, scala.Boolean]
*/
trait RequestBodyMatcher extends js.Object

object RequestBodyMatcher {
  @scala.inline
  implicit def apply(value: Buffer): RequestBodyMatcher = value.asInstanceOf[RequestBodyMatcher]
  @scala.inline
  implicit def apply(value: DataMatcherArray): RequestBodyMatcher = value.asInstanceOf[RequestBodyMatcher]
  @scala.inline
  implicit def apply(value: DataMatcherMap): RequestBodyMatcher = value.asInstanceOf[RequestBodyMatcher]
  @scala.inline
  implicit def apply(value: js.Function1[/* body */ js.Any, Boolean]): RequestBodyMatcher = value.asInstanceOf[RequestBodyMatcher]
  @scala.inline
  implicit def apply(value: js.RegExp): RequestBodyMatcher = value.asInstanceOf[RequestBodyMatcher]
  @scala.inline
  implicit def apply(value: String): RequestBodyMatcher = value.asInstanceOf[RequestBodyMatcher]
}


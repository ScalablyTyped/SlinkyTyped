package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nightwatch.mod.NightwatchTypedCallbackResult[T]
  - typingsSlinky.nightwatch.mod.NightwatchCallbackResultError
*/
trait NightwatchCallbackResult[T] extends js.Object

object NightwatchCallbackResult {
  @scala.inline
  implicit def apply[T](value: NightwatchCallbackResultError): NightwatchCallbackResult[T] = value.asInstanceOf[NightwatchCallbackResult[T]]
  @scala.inline
  implicit def apply[T](value: NightwatchTypedCallbackResult[T]): NightwatchCallbackResult[T] = value.asInstanceOf[NightwatchCallbackResult[T]]
}


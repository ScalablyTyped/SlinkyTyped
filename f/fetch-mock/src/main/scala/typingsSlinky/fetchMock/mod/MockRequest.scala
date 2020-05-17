package typingsSlinky.fetchMock.mod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Request
  - typingsSlinky.std.RequestInit
*/
trait MockRequest extends js.Object

object MockRequest {
  @scala.inline
  implicit def apply(value: Request): MockRequest = value.asInstanceOf[MockRequest]
  @scala.inline
  implicit def apply(value: RequestInit): MockRequest = value.asInstanceOf[MockRequest]
}


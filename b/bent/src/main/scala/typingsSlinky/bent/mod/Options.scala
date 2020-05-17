package typingsSlinky.bent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bent.mod.HttpMethod
  - typingsSlinky.bent.mod.StatusCode
  - typingsSlinky.bent.mod.Headers
  - typingsSlinky.bent.mod.BaseUrl
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: BaseUrl): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: Headers): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: HttpMethod): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: StatusCode): Options = value.asInstanceOf[Options]
}


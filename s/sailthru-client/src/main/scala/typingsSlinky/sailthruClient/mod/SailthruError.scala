package typingsSlinky.sailthruClient.mod

import typingsSlinky.sailthruClient.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sailthruClient.anon.Error
  - scala.Null
*/
trait SailthruError extends js.Object

object SailthruError {
  @scala.inline
  implicit def apply(value: Error): SailthruError = value.asInstanceOf[SailthruError]
  @scala.inline
  implicit def apply(value: Null): SailthruError = value.asInstanceOf[SailthruError]
}


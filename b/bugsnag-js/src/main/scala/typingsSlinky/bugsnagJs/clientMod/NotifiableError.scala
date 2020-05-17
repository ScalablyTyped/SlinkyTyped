package typingsSlinky.bugsnagJs.clientMod

import typingsSlinky.bugsnagJs.anon.ErrorClass
import typingsSlinky.bugsnagJs.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Error
  - typingsSlinky.bugsnagJs.anon.ErrorClass
  - typingsSlinky.bugsnagJs.anon.Message
  - js.Any
*/
trait NotifiableError extends js.Object

object NotifiableError {
  @scala.inline
  implicit def apply(value: js.Any): NotifiableError = value.asInstanceOf[NotifiableError]
  @scala.inline
  implicit def apply(value: js.Error): NotifiableError = value.asInstanceOf[NotifiableError]
  @scala.inline
  implicit def apply(value: ErrorClass): NotifiableError = value.asInstanceOf[NotifiableError]
  @scala.inline
  implicit def apply(value: Message): NotifiableError = value.asInstanceOf[NotifiableError]
}


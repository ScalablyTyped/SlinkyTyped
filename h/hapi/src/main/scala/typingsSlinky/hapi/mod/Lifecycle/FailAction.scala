package typingsSlinky.hapi.mod.Lifecycle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Various configuration options allows defining how errors are handled. For example, when invalid payload is received or malformed cookie, instead of returning an error, the framework can be
  * configured to perform another action. When supported the failAction option supports the following values:
  * * 'error' - return the error object as the response.
  * * 'log' - report the error but continue processing the request.
  * * 'ignore' - take no action and continue processing the request.
  * * a lifecycle method with the signature async function(request, h, err) where:
  * * * request - the request object.
  * * * h - the response toolkit.
  * * * err - the error object.
  * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-failaction-configuration)
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapi.hapiStrings.error
  - typingsSlinky.hapi.hapiStrings.log
  - typingsSlinky.hapi.hapiStrings.ignore
  - typingsSlinky.hapi.mod.Lifecycle.Method
*/
trait FailAction extends js.Object

object FailAction {
  @scala.inline
  def error: typingsSlinky.hapi.hapiStrings.error = "error".asInstanceOf[typingsSlinky.hapi.hapiStrings.error]
  @scala.inline
  def log: typingsSlinky.hapi.hapiStrings.log = "log".asInstanceOf[typingsSlinky.hapi.hapiStrings.log]
  @scala.inline
  def ignore: typingsSlinky.hapi.hapiStrings.ignore = "ignore".asInstanceOf[typingsSlinky.hapi.hapiStrings.ignore]
  @scala.inline
  implicit def apply(value: Method): FailAction = value.asInstanceOf[FailAction]
}


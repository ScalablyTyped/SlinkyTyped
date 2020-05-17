package typingsSlinky.hapiHapi.mod.Lifecycle

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
  - typingsSlinky.hapiHapi.hapiHapiStrings.error
  - typingsSlinky.hapiHapi.hapiHapiStrings.log
  - typingsSlinky.hapiHapi.hapiHapiStrings.ignore
  - typingsSlinky.hapiHapi.mod.Lifecycle.Method
*/
trait FailAction extends js.Object

object FailAction {
  @scala.inline
  def error: typingsSlinky.hapiHapi.hapiHapiStrings.error = "error".asInstanceOf[typingsSlinky.hapiHapi.hapiHapiStrings.error]
  @scala.inline
  def log: typingsSlinky.hapiHapi.hapiHapiStrings.log = "log".asInstanceOf[typingsSlinky.hapiHapi.hapiHapiStrings.log]
  @scala.inline
  def ignore: typingsSlinky.hapiHapi.hapiHapiStrings.ignore = "ignore".asInstanceOf[typingsSlinky.hapiHapi.hapiHapiStrings.ignore]
  @scala.inline
  implicit def apply(value: Method): FailAction = value.asInstanceOf[FailAction]
}


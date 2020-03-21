package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiHapi.hapiHapiStrings.required
  - typingsSlinky.hapiHapi.hapiHapiStrings.optional
  - typingsSlinky.hapiHapi.hapiHapiStrings.`try`
*/
trait AuthMode extends js.Object

object AuthMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typingsSlinky.hapiHapi.hapiHapiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typingsSlinky.hapiHapi.hapiHapiStrings.required = this.cast("required")
  @scala.inline
  def `try`: typingsSlinky.hapiHapi.hapiHapiStrings.`try` = this.cast("try")
}


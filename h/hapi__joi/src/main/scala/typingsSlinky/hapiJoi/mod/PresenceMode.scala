package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiJoi.hapiJoiStrings.optional
  - typingsSlinky.hapiJoi.hapiJoiStrings.required
  - typingsSlinky.hapiJoi.hapiJoiStrings.forbidden
*/
trait PresenceMode extends js.Object

object PresenceMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typingsSlinky.hapiJoi.hapiJoiStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def optional: typingsSlinky.hapiJoi.hapiJoiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typingsSlinky.hapiJoi.hapiJoiStrings.required = this.cast("required")
}


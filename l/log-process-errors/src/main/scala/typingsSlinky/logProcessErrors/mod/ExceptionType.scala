package typingsSlinky.logProcessErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.uncaughtException
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.unhandledRejection
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.rejectionHandled
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.multipleResolves
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.warning
*/
trait ExceptionType extends js.Object

object ExceptionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multipleResolves: typingsSlinky.logProcessErrors.logProcessErrorsStrings.multipleResolves = this.cast("multipleResolves")
  @scala.inline
  def rejectionHandled: typingsSlinky.logProcessErrors.logProcessErrorsStrings.rejectionHandled = this.cast("rejectionHandled")
  @scala.inline
  def uncaughtException: typingsSlinky.logProcessErrors.logProcessErrorsStrings.uncaughtException = this.cast("uncaughtException")
  @scala.inline
  def unhandledRejection: typingsSlinky.logProcessErrors.logProcessErrorsStrings.unhandledRejection = this.cast("unhandledRejection")
  @scala.inline
  def warning: typingsSlinky.logProcessErrors.logProcessErrorsStrings.warning = this.cast("warning")
}


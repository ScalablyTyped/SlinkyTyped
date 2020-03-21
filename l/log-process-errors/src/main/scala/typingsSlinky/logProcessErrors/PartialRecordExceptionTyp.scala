package typingsSlinky.logProcessErrors

import typingsSlinky.logProcessErrors.logProcessErrorsStrings.default
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.silent
import typingsSlinky.logProcessErrors.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<log-process-errors.log-process-errors.ExceptionType, log-process-errors.log-process-errors.LogLevel>> & {  default ? :(error : std.Error): 'silent' | 'default'} */
trait PartialRecordExceptionTyp extends js.Object {
  var default: js.UndefOr[
    js.Function1[
      /* error */ js.Error, 
      silent | typingsSlinky.logProcessErrors.logProcessErrorsStrings.default
    ]
  ] = js.undefined
  var multipleResolves: js.UndefOr[LogLevel] = js.undefined
  var rejectionHandled: js.UndefOr[LogLevel] = js.undefined
  var uncaughtException: js.UndefOr[LogLevel] = js.undefined
  var unhandledRejection: js.UndefOr[LogLevel] = js.undefined
  var warning: js.UndefOr[LogLevel] = js.undefined
}

object PartialRecordExceptionTyp {
  @scala.inline
  def apply(
    default: /* error */ js.Error => silent | default = null,
    multipleResolves: LogLevel = null,
    rejectionHandled: LogLevel = null,
    uncaughtException: LogLevel = null,
    unhandledRejection: LogLevel = null,
    warning: LogLevel = null
  ): PartialRecordExceptionTyp = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(js.Any.fromFunction1(default))
    if (multipleResolves != null) __obj.updateDynamic("multipleResolves")(multipleResolves.asInstanceOf[js.Any])
    if (rejectionHandled != null) __obj.updateDynamic("rejectionHandled")(rejectionHandled.asInstanceOf[js.Any])
    if (uncaughtException != null) __obj.updateDynamic("uncaughtException")(uncaughtException.asInstanceOf[js.Any])
    if (unhandledRejection != null) __obj.updateDynamic("unhandledRejection")(unhandledRejection.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordExceptionTyp]
  }
}


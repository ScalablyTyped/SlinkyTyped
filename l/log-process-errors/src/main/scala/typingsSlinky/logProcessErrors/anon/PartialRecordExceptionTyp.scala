package typingsSlinky.logProcessErrors.anon

import typingsSlinky.logProcessErrors.logProcessErrorsStrings.default
import typingsSlinky.logProcessErrors.logProcessErrorsStrings.silent
import typingsSlinky.logProcessErrors.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<log-process-errors.log-process-errors.ExceptionType, log-process-errors.log-process-errors.LogLevel>> & {  default ? :(error : std.Error): 'silent' | 'default'} */
@js.native
trait PartialRecordExceptionTyp extends js.Object {
  var default: js.UndefOr[
    js.Function1[
      /* error */ js.Error, 
      silent | typingsSlinky.logProcessErrors.logProcessErrorsStrings.default
    ]
  ] = js.native
  var multipleResolves: js.UndefOr[LogLevel] = js.native
  var rejectionHandled: js.UndefOr[LogLevel] = js.native
  var uncaughtException: js.UndefOr[LogLevel] = js.native
  var unhandledRejection: js.UndefOr[LogLevel] = js.native
  var warning: js.UndefOr[LogLevel] = js.native
}

object PartialRecordExceptionTyp {
  @scala.inline
  def apply(): PartialRecordExceptionTyp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordExceptionTyp]
  }
  @scala.inline
  implicit class PartialRecordExceptionTypOps[Self <: PartialRecordExceptionTyp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: /* error */ js.Error => silent | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleResolves(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleResolves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleResolves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleResolves")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectionHandled(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionHandled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectionHandled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionHandled")(js.undefined)
        ret
    }
    @scala.inline
    def withUncaughtException(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncaughtException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaughtException")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhandledRejection(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledRejection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnhandledRejection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledRejection")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}


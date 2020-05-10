package typingsSlinky.jestReporters.baseReporterMod

import typingsSlinky.jestReporters.typesMod.Context
import typingsSlinky.jestReporters.typesMod.Reporter
import typingsSlinky.jestReporters.typesMod.ReporterOnStartOptions
import typingsSlinky.jestReporters.typesMod.Test
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseReporter extends Reporter {
  var _error: js.UndefOr[js.Any] = js.native
  /* protected */ def _setError(error: js.Error): Unit = js.native
  def log(message: String): Unit = js.native
}

object BaseReporter {
  @scala.inline
  def apply(
    _setError: js.Error => Unit,
    getLastError: () => js.Error | Unit,
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit
  ): BaseReporter = {
    val __obj = js.Dynamic.literal(_setError = js.Any.fromFunction1(_setError), getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    __obj.asInstanceOf[BaseReporter]
  }
  @scala.inline
  implicit class BaseReporterOps[Self <: BaseReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_setError(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_error(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_error")(js.undefined)
        ret
    }
  }
  
}


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

trait BaseReporter extends Reporter {
  var _error: js.UndefOr[js.Any] = js.undefined
  /* protected */ def _setError(error: js.Error): Unit
  def log(message: String): Unit
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
    onTestStart: Test => js.Promise[Unit] | Unit,
    _error: js.Any = null
  ): BaseReporter = {
    val __obj = js.Dynamic.literal(_setError = js.Any.fromFunction1(_setError), getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseReporter]
  }
}


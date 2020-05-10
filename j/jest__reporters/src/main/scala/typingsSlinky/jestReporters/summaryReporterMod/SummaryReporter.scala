package typingsSlinky.jestReporters.summaryReporterMod

import typingsSlinky.jestReporters.baseReporterMod.BaseReporter
import typingsSlinky.jestReporters.typesMod.Context
import typingsSlinky.jestReporters.typesMod.ReporterOnStartOptions
import typingsSlinky.jestReporters.typesMod.Test
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryReporter extends BaseReporter {
  var _estimatedTime: js.Any = js.native
  var _getTestSummary: js.Any = js.native
  var _globalConfig: js.Any = js.native
  var _printSnapshotSummary: js.Any = js.native
  var _printSummary: js.Any = js.native
  var _write: js.Any = js.native
}

object SummaryReporter {
  @scala.inline
  def apply(
    _estimatedTime: js.Any,
    _getTestSummary: js.Any,
    _globalConfig: js.Any,
    _printSnapshotSummary: js.Any,
    _printSummary: js.Any,
    _setError: js.Error => Unit,
    _write: js.Any,
    getLastError: () => js.Error | Unit,
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit
  ): SummaryReporter = {
    val __obj = js.Dynamic.literal(_estimatedTime = _estimatedTime.asInstanceOf[js.Any], _getTestSummary = _getTestSummary.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _printSnapshotSummary = _printSnapshotSummary.asInstanceOf[js.Any], _printSummary = _printSummary.asInstanceOf[js.Any], _setError = js.Any.fromFunction1(_setError), _write = _write.asInstanceOf[js.Any], getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    __obj.asInstanceOf[SummaryReporter]
  }
  @scala.inline
  implicit class SummaryReporterOps[Self <: SummaryReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_estimatedTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_estimatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getTestSummary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getTestSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_globalConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_printSnapshotSummary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_printSnapshotSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_printSummary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_printSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_write(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_write")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


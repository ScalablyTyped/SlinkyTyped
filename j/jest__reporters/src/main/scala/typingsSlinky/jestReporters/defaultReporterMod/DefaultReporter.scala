package typingsSlinky.jestReporters.defaultReporterMod

import typingsSlinky.jestReporters.baseReporterMod.BaseReporter
import typingsSlinky.jestReporters.typesMod.ReporterOnStartOptions
import typingsSlinky.jestReporters.typesMod.Test
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultReporter extends BaseReporter {
  var _bufferedOutput: js.Any = js.native
  var _clear: js.Any = js.native
  var _clearStatus: js.Any = js.native
  var _err: js.Any = js.native
  var _globalConfig: GlobalConfig = js.native
  var _out: js.Any = js.native
  var _printStatus: js.Any = js.native
  var _status: js.Any = js.native
  var _wrapStdio: js.Any = js.native
  def forceFlushBufferedOutput(): Unit = js.native
  def onRunComplete(): Unit = js.native
  def printTestFileFailureMessage(_testPath: Path, _config: ProjectConfig, result: TestResult): Unit = js.native
  def printTestFileHeader(_testPath: Path, config: ProjectConfig, result: TestResult): Unit = js.native
  def testFinished(config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
}

object DefaultReporter {
  @scala.inline
  def apply(
    _bufferedOutput: js.Any,
    _clear: js.Any,
    _clearStatus: js.Any,
    _err: js.Any,
    _globalConfig: GlobalConfig,
    _out: js.Any,
    _printStatus: js.Any,
    _setError: js.Error => Unit,
    _status: js.Any,
    _wrapStdio: js.Any,
    forceFlushBufferedOutput: () => Unit,
    getLastError: () => js.Error | Unit,
    log: String => Unit,
    onRunComplete: () => Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit,
    printTestFileFailureMessage: (Path, ProjectConfig, TestResult) => Unit,
    printTestFileHeader: (Path, ProjectConfig, TestResult) => Unit,
    testFinished: (ProjectConfig, TestResult, AggregatedResult) => Unit
  ): DefaultReporter = {
    val __obj = js.Dynamic.literal(_bufferedOutput = _bufferedOutput.asInstanceOf[js.Any], _clear = _clear.asInstanceOf[js.Any], _clearStatus = _clearStatus.asInstanceOf[js.Any], _err = _err.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _out = _out.asInstanceOf[js.Any], _printStatus = _printStatus.asInstanceOf[js.Any], _setError = js.Any.fromFunction1(_setError), _status = _status.asInstanceOf[js.Any], _wrapStdio = _wrapStdio.asInstanceOf[js.Any], forceFlushBufferedOutput = js.Any.fromFunction0(forceFlushBufferedOutput), getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction0(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart), printTestFileFailureMessage = js.Any.fromFunction3(printTestFileFailureMessage), printTestFileHeader = js.Any.fromFunction3(printTestFileHeader), testFinished = js.Any.fromFunction3(testFinished))
    __obj.asInstanceOf[DefaultReporter]
  }
  @scala.inline
  implicit class DefaultReporterOps[Self <: DefaultReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_bufferedOutput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bufferedOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_clear(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_clearStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clearStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_err(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_globalConfig(value: GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_out(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_printStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_printStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_status(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_wrapStdio(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_wrapStdio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceFlushBufferedOutput(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFlushBufferedOutput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnRunComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRunComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintTestFileFailureMessage(value: (Path, ProjectConfig, TestResult) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTestFileFailureMessage")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPrintTestFileHeader(value: (Path, ProjectConfig, TestResult) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTestFileHeader")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTestFinished(value: (ProjectConfig, TestResult, AggregatedResult) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFinished")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}


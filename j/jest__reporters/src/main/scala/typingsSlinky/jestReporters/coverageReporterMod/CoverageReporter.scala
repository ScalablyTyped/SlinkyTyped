package typingsSlinky.jestReporters.coverageReporterMod

import typingsSlinky.istanbulLibCoverage.mod.CoverageMap
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
trait CoverageReporter extends BaseReporter {
  var _addUntestedFiles: js.Any = js.native
  var _checkThreshold: js.Any = js.native
  var _coverageMap: js.Any = js.native
  var _globalConfig: js.Any = js.native
  var _options: js.Any = js.native
  var _sourceMapStore: js.Any = js.native
  def getCoverageMap(): CoverageMap = js.native
}

object CoverageReporter {
  @scala.inline
  def apply(
    _addUntestedFiles: js.Any,
    _checkThreshold: js.Any,
    _coverageMap: js.Any,
    _globalConfig: js.Any,
    _options: js.Any,
    _setError: js.Error => Unit,
    _sourceMapStore: js.Any,
    getCoverageMap: () => CoverageMap,
    getLastError: () => js.Error | Unit,
    log: String => Unit,
    onRunComplete: (Set[Context], AggregatedResult) => js.Promise[Unit] | Unit,
    onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit,
    onTestResult: (Test, TestResult, AggregatedResult) => js.Promise[Unit] | Unit,
    onTestStart: Test => js.Promise[Unit] | Unit
  ): CoverageReporter = {
    val __obj = js.Dynamic.literal(_addUntestedFiles = _addUntestedFiles.asInstanceOf[js.Any], _checkThreshold = _checkThreshold.asInstanceOf[js.Any], _coverageMap = _coverageMap.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _setError = js.Any.fromFunction1(_setError), _sourceMapStore = _sourceMapStore.asInstanceOf[js.Any], getCoverageMap = js.Any.fromFunction0(getCoverageMap), getLastError = js.Any.fromFunction0(getLastError), log = js.Any.fromFunction1(log), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart), onTestResult = js.Any.fromFunction3(onTestResult), onTestStart = js.Any.fromFunction1(onTestStart))
    __obj.asInstanceOf[CoverageReporter]
  }
  @scala.inline
  implicit class CoverageReporterOps[Self <: CoverageReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_addUntestedFiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_addUntestedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_checkThreshold(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_checkThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_coverageMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_coverageMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_globalConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_options(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sourceMapStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sourceMapStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCoverageMap(value: () => CoverageMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoverageMap")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


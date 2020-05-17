package typingsSlinky.jestReporters.statusMod

import typingsSlinky.jestReporters.anon.Clear
import typingsSlinky.jestReporters.typesMod.ReporterOnStartOptions
import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var _aggregatedResults: js.UndefOr[js.Any] = js.native
  var _cache: js.Any = js.native
  var _callback: js.UndefOr[js.Any] = js.native
  var _currentTests: js.Any = js.native
  var _debouncedEmit: js.Any = js.native
  var _done: js.Any = js.native
  var _emit: js.Any = js.native
  var _emitScheduled: js.Any = js.native
  var _estimatedTime: js.Any = js.native
  var _interval: js.UndefOr[js.Any] = js.native
  var _showStatus: js.Any = js.native
  var _tick: js.Any = js.native
  def get(): Clear = js.native
  def onChange(callback: js.Function0[Unit]): Unit = js.native
  def runFinished(): Unit = js.native
  def runStarted(aggregatedResults: AggregatedResult, options: ReporterOnStartOptions): Unit = js.native
  def testFinished(_config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
  def testStarted(testPath: Path, config: ProjectConfig): Unit = js.native
}

object Status {
  @scala.inline
  def apply(
    _cache: js.Any,
    _currentTests: js.Any,
    _debouncedEmit: js.Any,
    _done: js.Any,
    _emit: js.Any,
    _emitScheduled: js.Any,
    _estimatedTime: js.Any,
    _showStatus: js.Any,
    _tick: js.Any,
    get: () => Clear,
    onChange: js.Function0[Unit] => Unit,
    runFinished: () => Unit,
    runStarted: (AggregatedResult, ReporterOnStartOptions) => Unit,
    testFinished: (ProjectConfig, TestResult, AggregatedResult) => Unit,
    testStarted: (Path, ProjectConfig) => Unit
  ): Status = {
    val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], _currentTests = _currentTests.asInstanceOf[js.Any], _debouncedEmit = _debouncedEmit.asInstanceOf[js.Any], _done = _done.asInstanceOf[js.Any], _emit = _emit.asInstanceOf[js.Any], _emitScheduled = _emitScheduled.asInstanceOf[js.Any], _estimatedTime = _estimatedTime.asInstanceOf[js.Any], _showStatus = _showStatus.asInstanceOf[js.Any], _tick = _tick.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), onChange = js.Any.fromFunction1(onChange), runFinished = js.Any.fromFunction0(runFinished), runStarted = js.Any.fromFunction2(runStarted), testFinished = js.Any.fromFunction3(testFinished), testStarted = js.Any.fromFunction2(testStarted))
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_cache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentTests(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_debouncedEmit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_debouncedEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_done(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_emit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_emit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_emitScheduled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_emitScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_estimatedTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_estimatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_showStatus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_showStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_tick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: () => Clear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunFinished(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runFinished")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRunStarted(value: (AggregatedResult, ReporterOnStartOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runStarted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTestFinished(value: (ProjectConfig, TestResult, AggregatedResult) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFinished")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTestStarted(value: (Path, ProjectConfig) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testStarted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_aggregatedResults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_aggregatedResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_aggregatedResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_aggregatedResults")(js.undefined)
        ret
    }
    @scala.inline
    def with_callback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_callback")(js.undefined)
        ret
    }
    @scala.inline
    def with_interval(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_interval")(js.undefined)
        ret
    }
  }
  
}


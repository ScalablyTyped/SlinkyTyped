package typingsSlinky.jestCore.snapshotInteractiveModeMod

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTestResult.typesMod.AssertionLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotInteractiveMode extends js.Object {
  var _clearTestSummary: js.Any = js.native
  var _countPaths: js.Any = js.native
  var _drawUIDone: js.Any = js.native
  var _drawUIDoneWithSkipped: js.Any = js.native
  var _drawUIOverlay: js.Any = js.native
  var _drawUIProgress: js.Any = js.native
  var _isActive: js.Any = js.native
  var _pipe: js.Any = js.native
  var _run: js.Any = js.native
  var _skippedNum: js.Any = js.native
  var _testAssertions: js.Any = js.native
  var _updateTestRunnerConfig: js.Any = js.native
  def abort(): Unit = js.native
  def getSkippedNum(): Double = js.native
  def isActive(): Boolean = js.native
  def put(key: String): Unit = js.native
  def restart(): Unit = js.native
  def run(
    failedSnapshotTestAssertions: js.Array[AssertionLocation],
    onConfigChange: js.Function2[/* assertion */ AssertionLocation | Null, /* shouldUpdateSnapshot */ Boolean, _]
  ): Unit = js.native
  def updateWithResults(results: AggregatedResult): Unit = js.native
}

object SnapshotInteractiveMode {
  @scala.inline
  def apply(
    _clearTestSummary: js.Any,
    _countPaths: js.Any,
    _drawUIDone: js.Any,
    _drawUIDoneWithSkipped: js.Any,
    _drawUIOverlay: js.Any,
    _drawUIProgress: js.Any,
    _isActive: js.Any,
    _pipe: js.Any,
    _run: js.Any,
    _skippedNum: js.Any,
    _testAssertions: js.Any,
    _updateTestRunnerConfig: js.Any,
    abort: () => Unit,
    getSkippedNum: () => Double,
    isActive: () => Boolean,
    put: String => Unit,
    restart: () => Unit,
    run: (js.Array[AssertionLocation], js.Function2[/* assertion */ AssertionLocation | Null, /* shouldUpdateSnapshot */ Boolean, _]) => Unit,
    updateWithResults: AggregatedResult => Unit
  ): SnapshotInteractiveMode = {
    val __obj = js.Dynamic.literal(_clearTestSummary = _clearTestSummary.asInstanceOf[js.Any], _countPaths = _countPaths.asInstanceOf[js.Any], _drawUIDone = _drawUIDone.asInstanceOf[js.Any], _drawUIDoneWithSkipped = _drawUIDoneWithSkipped.asInstanceOf[js.Any], _drawUIOverlay = _drawUIOverlay.asInstanceOf[js.Any], _drawUIProgress = _drawUIProgress.asInstanceOf[js.Any], _isActive = _isActive.asInstanceOf[js.Any], _pipe = _pipe.asInstanceOf[js.Any], _run = _run.asInstanceOf[js.Any], _skippedNum = _skippedNum.asInstanceOf[js.Any], _testAssertions = _testAssertions.asInstanceOf[js.Any], _updateTestRunnerConfig = _updateTestRunnerConfig.asInstanceOf[js.Any], abort = js.Any.fromFunction0(abort), getSkippedNum = js.Any.fromFunction0(getSkippedNum), isActive = js.Any.fromFunction0(isActive), put = js.Any.fromFunction1(put), restart = js.Any.fromFunction0(restart), run = js.Any.fromFunction2(run), updateWithResults = js.Any.fromFunction1(updateWithResults))
    __obj.asInstanceOf[SnapshotInteractiveMode]
  }
  @scala.inline
  implicit class SnapshotInteractiveModeOps[Self <: SnapshotInteractiveMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_clearTestSummary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clearTestSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_countPaths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_countPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_drawUIDone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_drawUIDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_drawUIDoneWithSkipped(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_drawUIDoneWithSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_drawUIOverlay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_drawUIOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_drawUIProgress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_drawUIProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_isActive(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pipe(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_run(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_skippedNum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_skippedNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_testAssertions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_testAssertions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_updateTestRunnerConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_updateTestRunnerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSkippedNum(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSkippedNum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPut(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRun(
      value: (js.Array[AssertionLocation], js.Function2[/* assertion */ AssertionLocation | Null, /* shouldUpdateSnapshot */ Boolean, _]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdateWithResults(value: AggregatedResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWithResults")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


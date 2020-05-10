package typingsSlinky.jestRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunner extends js.Object {
  var _context: js.Any = js.native
  var _createInBandTestRun: js.Any = js.native
  var _createParallelTestRun: js.Any = js.native
  var _globalConfig: js.Any = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: typingsSlinky.jestRunner.typesMod.OnTestStart,
    onResult: typingsSlinky.jestRunner.typesMod.OnTestSuccess,
    onFailure: typingsSlinky.jestRunner.typesMod.OnTestFailure,
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}

object TestRunner {
  @scala.inline
  def apply(
    _context: js.Any,
    _createInBandTestRun: js.Any,
    _createParallelTestRun: js.Any,
    _globalConfig: js.Any,
    runTests: (js.Array[typingsSlinky.jestRunner.typesMod.Test], typingsSlinky.jestRunner.typesMod.TestWatcher, typingsSlinky.jestRunner.typesMod.OnTestStart, typingsSlinky.jestRunner.typesMod.OnTestSuccess, typingsSlinky.jestRunner.typesMod.OnTestFailure, typingsSlinky.jestRunner.typesMod.TestRunnerOptions) => js.Promise[Unit]
  ): TestRunner = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _createInBandTestRun = _createInBandTestRun.asInstanceOf[js.Any], _createParallelTestRun = _createParallelTestRun.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], runTests = js.Any.fromFunction6(runTests))
    __obj.asInstanceOf[TestRunner]
  }
  @scala.inline
  implicit class TestRunnerOps[Self <: TestRunner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_context(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_createInBandTestRun(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_createInBandTestRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_createParallelTestRun(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_createParallelTestRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_globalConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunTests(
      value: (js.Array[typingsSlinky.jestRunner.typesMod.Test], typingsSlinky.jestRunner.typesMod.TestWatcher, typingsSlinky.jestRunner.typesMod.OnTestStart, typingsSlinky.jestRunner.typesMod.OnTestSuccess, typingsSlinky.jestRunner.typesMod.OnTestFailure, typingsSlinky.jestRunner.typesMod.TestRunnerOptions) => js.Promise[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTests")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}


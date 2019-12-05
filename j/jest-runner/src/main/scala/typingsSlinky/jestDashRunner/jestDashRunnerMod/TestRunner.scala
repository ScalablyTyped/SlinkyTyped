package typingsSlinky.jestDashRunner.jestDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunner extends js.Object {
  var _context: js.Any
  var _createInBandTestRun: js.Any
  var _createParallelTestRun: js.Any
  var _globalConfig: js.Any
  def runTests(
    tests: js.Array[typingsSlinky.jestDashRunner.buildTypesMod.Test],
    watcher: typingsSlinky.jestDashRunner.buildTypesMod.TestWatcher,
    onStart: typingsSlinky.jestDashRunner.buildTypesMod.OnTestStart,
    onResult: typingsSlinky.jestDashRunner.buildTypesMod.OnTestSuccess,
    onFailure: typingsSlinky.jestDashRunner.buildTypesMod.OnTestFailure,
    options: typingsSlinky.jestDashRunner.buildTypesMod.TestRunnerOptions
  ): js.Promise[Unit]
}

object TestRunner {
  @scala.inline
  def apply(
    _context: js.Any,
    _createInBandTestRun: js.Any,
    _createParallelTestRun: js.Any,
    _globalConfig: js.Any,
    runTests: (js.Array[typingsSlinky.jestDashRunner.buildTypesMod.Test], typingsSlinky.jestDashRunner.buildTypesMod.TestWatcher, typingsSlinky.jestDashRunner.buildTypesMod.OnTestStart, typingsSlinky.jestDashRunner.buildTypesMod.OnTestSuccess, typingsSlinky.jestDashRunner.buildTypesMod.OnTestFailure, typingsSlinky.jestDashRunner.buildTypesMod.TestRunnerOptions) => js.Promise[Unit]
  ): TestRunner = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _createInBandTestRun = _createInBandTestRun.asInstanceOf[js.Any], _createParallelTestRun = _createParallelTestRun.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], runTests = js.Any.fromFunction6(runTests))
  
    __obj.asInstanceOf[TestRunner]
  }
}


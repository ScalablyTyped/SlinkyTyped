package typingsSlinky.jestRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunner extends js.Object {
  var _context: js.Any
  var _createInBandTestRun: js.Any
  var _createParallelTestRun: js.Any
  var _globalConfig: js.Any
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: typingsSlinky.jestRunner.typesMod.OnTestStart,
    onResult: typingsSlinky.jestRunner.typesMod.OnTestSuccess,
    onFailure: typingsSlinky.jestRunner.typesMod.OnTestFailure,
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit]
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
}


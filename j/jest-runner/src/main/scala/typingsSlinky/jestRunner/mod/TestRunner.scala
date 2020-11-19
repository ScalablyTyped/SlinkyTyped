package typingsSlinky.jestRunner.mod

import typingsSlinky.emittery.mod.UnsubscribeFn
import typingsSlinky.jestRunner.jestRunnerStrings.`test-case-result`
import typingsSlinky.jestRunner.jestRunnerStrings.`test-file-failure`
import typingsSlinky.jestRunner.jestRunnerStrings.`test-file-start`
import typingsSlinky.jestRunner.jestRunnerStrings.`test-file-success`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRunner extends js.Object {
  
  val __PRIVATE_UNSTABLE_API_supportsEventEmitters__ : Boolean = js.native
  
  val _context: js.Any = js.native
  
  var _createInBandTestRun: js.Any = js.native
  
  var _createParallelTestRun: js.Any = js.native
  
  val _globalConfig: js.Any = js.native
  
  val eventEmitter: js.Any = js.native
  
  val isSerial: js.UndefOr[Boolean] = js.native
  
  def on[Name_1 /* <: scala.Nothing */](eventName: Name_1, listener: js.Function0[Unit]): UnsubscribeFn = js.native
  def on[Name /* <: `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result` */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: jest-runner.jest-runner/build/types.TestEvents[Name] */ /* eventData */ js.Any, 
      Unit
    ]
  ): UnsubscribeFn = js.native
  
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onFailure: js.UndefOr[scala.Nothing],
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onFailure: typingsSlinky.jestRunner.typesMod.OnTestFailure,
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: typingsSlinky.jestRunner.typesMod.OnTestSuccess,
    onFailure: js.UndefOr[scala.Nothing],
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: typingsSlinky.jestRunner.typesMod.OnTestSuccess,
    onFailure: typingsSlinky.jestRunner.typesMod.OnTestFailure,
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: typingsSlinky.jestRunner.typesMod.OnTestStart,
    onResult: js.UndefOr[scala.Nothing],
    onFailure: js.UndefOr[scala.Nothing],
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: typingsSlinky.jestRunner.typesMod.OnTestStart,
    onResult: js.UndefOr[scala.Nothing],
    onFailure: typingsSlinky.jestRunner.typesMod.OnTestFailure,
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: typingsSlinky.jestRunner.typesMod.OnTestStart,
    onResult: typingsSlinky.jestRunner.typesMod.OnTestSuccess,
    onFailure: js.UndefOr[scala.Nothing],
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: typingsSlinky.jestRunner.typesMod.OnTestStart,
    onResult: typingsSlinky.jestRunner.typesMod.OnTestSuccess,
    onFailure: typingsSlinky.jestRunner.typesMod.OnTestFailure,
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}

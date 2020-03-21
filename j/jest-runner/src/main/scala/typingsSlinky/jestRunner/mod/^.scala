package typingsSlinky.jestRunner.mod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner", JSImport.Namespace)
@js.native
class ^ protected () extends TestRunner {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, context: typingsSlinky.jestRunner.typesMod.TestRunnerContext) = this()
  /* CompleteClass */
  override var _context: js.Any = js.native
  /* CompleteClass */
  override var _createInBandTestRun: js.Any = js.native
  /* CompleteClass */
  override var _createParallelTestRun: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override def runTests(
    tests: js.Array[typingsSlinky.jestRunner.typesMod.Test],
    watcher: typingsSlinky.jestRunner.typesMod.TestWatcher,
    onStart: typingsSlinky.jestRunner.typesMod.OnTestStart,
    onResult: typingsSlinky.jestRunner.typesMod.OnTestSuccess,
    onFailure: typingsSlinky.jestRunner.typesMod.OnTestFailure,
    options: typingsSlinky.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}


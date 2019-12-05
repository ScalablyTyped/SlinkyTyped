package typingsSlinky.jestDashRunner.jestDashRunnerMod

import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner", JSImport.Namespace)
@js.native
class ^ protected () extends TestRunner {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, context: typingsSlinky.jestDashRunner.buildTypesMod.TestRunnerContext) = this()
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
    tests: js.Array[typingsSlinky.jestDashRunner.buildTypesMod.Test],
    watcher: typingsSlinky.jestDashRunner.buildTypesMod.TestWatcher,
    onStart: typingsSlinky.jestDashRunner.buildTypesMod.OnTestStart,
    onResult: typingsSlinky.jestDashRunner.buildTypesMod.OnTestSuccess,
    onFailure: typingsSlinky.jestDashRunner.buildTypesMod.OnTestFailure,
    options: typingsSlinky.jestDashRunner.buildTypesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}


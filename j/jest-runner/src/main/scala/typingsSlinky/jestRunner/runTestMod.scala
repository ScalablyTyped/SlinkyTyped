package typingsSlinky.jestRunner

import typingsSlinky.jestResolve.mod.^
import typingsSlinky.jestRunner.typesMod.TestRunnerContext
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner/build/runTest", JSImport.Namespace)
@js.native
object runTestMod extends js.Object {
  def default(path: Path, globalConfig: GlobalConfig, config: ProjectConfig, resolver: ^): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ^,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
}


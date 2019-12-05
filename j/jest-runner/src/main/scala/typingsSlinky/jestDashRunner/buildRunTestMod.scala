package typingsSlinky.jestDashRunner

import typingsSlinky.atJestTestDashResult.buildTypesMod.TestResult
import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
import typingsSlinky.jestDashResolve.jestDashResolveMod.^
import typingsSlinky.jestDashRunner.buildTypesMod.TestRunnerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner/build/runTest", JSImport.Namespace)
@js.native
object buildRunTestMod extends js.Object {
  def default(path: Path, globalConfig: GlobalConfig, config: ProjectConfig, resolver: ^): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ^,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
}


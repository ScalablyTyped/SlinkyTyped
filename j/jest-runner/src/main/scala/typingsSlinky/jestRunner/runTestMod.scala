package typingsSlinky.jestRunner

import typingsSlinky.jestResolve.mod.ResolverType
import typingsSlinky.jestRunner.jestRunnerStrings.`test-case-result`
import typingsSlinky.jestRunner.jestRunnerStrings.`test-file-failure`
import typingsSlinky.jestRunner.jestRunnerStrings.`test-file-start`
import typingsSlinky.jestRunner.jestRunnerStrings.`test-file-success`
import typingsSlinky.jestRunner.typesMod.TestFileEvent
import typingsSlinky.jestRunner.typesMod.TestRunnerContext
import typingsSlinky.jestTestResult.typesMod.TestResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-runner/build/runTest", JSImport.Namespace)
@js.native
object runTestMod extends js.Object {
  
  def default(path: Path, globalConfig: GlobalConfig, config: ProjectConfig, resolver: ResolverType): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ResolverType,
    context: js.UndefOr[scala.Nothing],
    sendMessageToJest: TestFileEvent[
      /* keyof jest-runner.jest-runner/build/types.TestEvents */ `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result`
    ]
  ): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ResolverType,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ResolverType,
    context: TestRunnerContext,
    sendMessageToJest: TestFileEvent[
      /* keyof jest-runner.jest-runner/build/types.TestEvents */ `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result`
    ]
  ): js.Promise[TestResult] = js.native
}

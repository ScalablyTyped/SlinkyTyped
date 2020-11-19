package typingsSlinky.jestRunner

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
  
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolverType */ js.Any
  ): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolverType */ js.Any,
    context: js.UndefOr[scala.Nothing],
    sendMessageToJest: TestFileEvent[
      /* keyof jest-runner.jest-runner/build/types.TestEvents */ `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result`
    ]
  ): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolverType */ js.Any,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolverType */ js.Any,
    context: TestRunnerContext,
    sendMessageToJest: TestFileEvent[
      /* keyof jest-runner.jest-runner/build/types.TestEvents */ `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result`
    ]
  ): js.Promise[TestResult] = js.native
}

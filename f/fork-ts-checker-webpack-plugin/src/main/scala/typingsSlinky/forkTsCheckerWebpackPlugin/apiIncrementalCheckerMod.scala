package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.compilerHostMod.CompilerHost
import typingsSlinky.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod.ApiIncrementalCheckerParams
import typingsSlinky.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod.IncrementalCheckerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/ApiIncrementalChecker", JSImport.Namespace)
@js.native
object apiIncrementalCheckerMod extends js.Object {
  @js.native
  class ApiIncrementalChecker protected () extends IncrementalCheckerInterface {
    def this(hasTypescriptContextProgramConfigFileCompilerOptionsCreateNormalizedMessageFromDiagnosticLinterConfigFileLinterAutoFixCreateNormalizedMessageFromRuleFailureEslinterCheckSyntacticErrorsResolveModuleNameResolveTypeReferenceDirective: ApiIncrementalCheckerParams) = this()
    val context: js.Any = js.native
    var createLinter: js.Any = js.native
    val createNormalizedMessageFromDiagnostic: js.Any = js.native
    val createNormalizedMessageFromRuleFailure: js.Any = js.native
    var currentEsLintErrors: js.Any = js.native
    var currentLintErrors: js.Any = js.native
    val eslinter: js.Any = js.native
    var getLinterConfig: js.Any = js.native
    val hasFixedConfig: js.Any = js.native
    var initLinterConfig: js.Any = js.native
    var lastRemovedFiles: js.Any = js.native
    var lastUpdatedFiles: js.Any = js.native
    val linterAutoFix: js.Any = js.native
    var linterConfig: js.UndefOr[js.Any] = js.native
    val linterConfigFile: js.Any = js.native
    var linterConfigs: js.Any = js.native
    var linterExclusions: js.Any = js.native
    val tsIncrementalCompiler: CompilerHost = js.native
    def isFileExcluded(filePath: String): Boolean = js.native
  }
  
}


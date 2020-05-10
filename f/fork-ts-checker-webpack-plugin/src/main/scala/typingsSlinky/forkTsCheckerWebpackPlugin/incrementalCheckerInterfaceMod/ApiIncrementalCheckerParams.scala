package typingsSlinky.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod

import typingsSlinky.forkTsCheckerWebpackPlugin.AnonGetFormattedLints
import typingsSlinky.forkTsCheckerWebpackPlugin.Typeofts
import typingsSlinky.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typingsSlinky.forkTsCheckerWebpackPlugin.resolutionMod.ResolveModuleName
import typingsSlinky.forkTsCheckerWebpackPlugin.resolutionMod.ResolveTypeReferenceDirective
import typingsSlinky.std.ReturnType
import typingsSlinky.tslint.mod.RuleFailure
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.ModuleResolutionHost
import typingsSlinky.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsSlinky.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiIncrementalCheckerParams extends js.Object {
  var checkSyntacticErrors: Boolean = js.native
  var compilerOptions: CompilerOptions = js.native
  var context: String = js.native
  var eslinter: js.UndefOr[ReturnType[js.Function1[/* eslintOptions */ js.Object, AnonGetFormattedLints]]] = js.native
  var linterAutoFix: Boolean = js.native
  var linterConfigFile: String | Boolean = js.native
  var programConfigFile: String = js.native
  var resolveModuleName: js.UndefOr[ResolveModuleName] = js.native
  var resolveTypeReferenceDirective: js.UndefOr[ResolveTypeReferenceDirective] = js.native
  var typescript: Typeofts = js.native
  def createNormalizedMessageFromDiagnostic(diagnostic: Diagnostic): NormalizedMessage = js.native
  def createNormalizedMessageFromRuleFailure(ruleFailure: RuleFailure): NormalizedMessage = js.native
}

object ApiIncrementalCheckerParams {
  @scala.inline
  def apply(
    checkSyntacticErrors: Boolean,
    compilerOptions: CompilerOptions,
    context: String,
    createNormalizedMessageFromDiagnostic: Diagnostic => NormalizedMessage,
    createNormalizedMessageFromRuleFailure: RuleFailure => NormalizedMessage,
    linterAutoFix: Boolean,
    linterConfigFile: String | Boolean,
    programConfigFile: String,
    typescript: Typeofts
  ): ApiIncrementalCheckerParams = {
    val __obj = js.Dynamic.literal(checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createNormalizedMessageFromDiagnostic = js.Any.fromFunction1(createNormalizedMessageFromDiagnostic), createNormalizedMessageFromRuleFailure = js.Any.fromFunction1(createNormalizedMessageFromRuleFailure), linterAutoFix = linterAutoFix.asInstanceOf[js.Any], linterConfigFile = linterConfigFile.asInstanceOf[js.Any], programConfigFile = programConfigFile.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiIncrementalCheckerParams]
  }
  @scala.inline
  implicit class ApiIncrementalCheckerParamsOps[Self <: ApiIncrementalCheckerParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckSyntacticErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSyntacticErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilerOptions(value: CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateNormalizedMessageFromDiagnostic(value: Diagnostic => NormalizedMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNormalizedMessageFromDiagnostic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateNormalizedMessageFromRuleFailure(value: RuleFailure => NormalizedMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNormalizedMessageFromRuleFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLinterAutoFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterAutoFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinterConfigFile(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linterConfigFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgramConfigFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programConfigFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescript(value: Typeofts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslinter(value: ReturnType[js.Function1[/* eslintOptions */ js.Object, AnonGetFormattedLints]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslinter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEslinter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslinter")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveModuleName(
      value: (/* typescript */ Typeofts, /* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedModuleWithFailedLookupLocations
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleName")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutResolveModuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveTypeReferenceDirective(
      value: (/* typescript */ Typeofts, /* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirective")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutResolveTypeReferenceDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirective")(js.undefined)
        ret
    }
  }
  
}


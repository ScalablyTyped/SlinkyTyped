package typingsSlinky.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  var allowJs: js.UndefOr[Boolean] = js.native
  var allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.native
  var allowUnreachableCode: js.UndefOr[Boolean] = js.native
  var allowUnusedLabels: js.UndefOr[Boolean] = js.native
  var alwaysStrict: js.UndefOr[Boolean] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var charset: js.UndefOr[String] = js.native
  var checkJs: js.UndefOr[Boolean] = js.native
  var composite: js.UndefOr[Boolean] = js.native
  var declaration: js.UndefOr[Boolean] = js.native
  var declarationDir: js.UndefOr[String] = js.native
  var declarationMap: js.UndefOr[Boolean] = js.native
  var disableSizeLimit: js.UndefOr[Boolean] = js.native
  var downlevelIteration: js.UndefOr[Boolean] = js.native
  var emitBOM: js.UndefOr[Boolean] = js.native
  var emitDeclarationOnly: js.UndefOr[Boolean] = js.native
  var emitDecoratorMetadata: js.UndefOr[Boolean] = js.native
  var esModuleInterop: js.UndefOr[Boolean] = js.native
  var experimentalDecorators: js.UndefOr[Boolean] = js.native
  var forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.native
  var importHelpers: js.UndefOr[Boolean] = js.native
  var inlineSourceMap: js.UndefOr[Boolean] = js.native
  var inlineSources: js.UndefOr[Boolean] = js.native
  var isolatedModules: js.UndefOr[Boolean] = js.native
  var jsx: js.UndefOr[JsxEmit] = js.native
  var jsxFactory: js.UndefOr[String] = js.native
  var keyofStringsOnly: js.UndefOr[Boolean] = js.native
  var lib: js.UndefOr[js.Array[String]] = js.native
  var locale: js.UndefOr[String] = js.native
  var mapRoot: js.UndefOr[String] = js.native
  var maxNodeModuleJsDepth: js.UndefOr[Double] = js.native
  var module: js.UndefOr[ModuleKind] = js.native
  var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.native
  var newLine: js.UndefOr[NewLineKind] = js.native
  var noEmit: js.UndefOr[Boolean] = js.native
  var noEmitHelpers: js.UndefOr[Boolean] = js.native
  var noEmitOnError: js.UndefOr[Boolean] = js.native
  var noErrorTruncation: js.UndefOr[Boolean] = js.native
  var noFallthroughCasesInSwitch: js.UndefOr[Boolean] = js.native
  var noImplicitAny: js.UndefOr[Boolean] = js.native
  var noImplicitReturns: js.UndefOr[Boolean] = js.native
  var noImplicitThis: js.UndefOr[Boolean] = js.native
  var noImplicitUseStrict: js.UndefOr[Boolean] = js.native
  var noLib: js.UndefOr[Boolean] = js.native
  var noResolve: js.UndefOr[Boolean] = js.native
  var noStrictGenericChecks: js.UndefOr[Boolean] = js.native
  var noUnusedLocals: js.UndefOr[Boolean] = js.native
  var noUnusedParameters: js.UndefOr[Boolean] = js.native
  var out: js.UndefOr[String] = js.native
  var outDir: js.UndefOr[String] = js.native
  var outFile: js.UndefOr[String] = js.native
  var paths: js.UndefOr[MapLike[js.Array[String]]] = js.native
  var preserveConstEnums: js.UndefOr[Boolean] = js.native
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
  var project: js.UndefOr[String] = js.native
  var reactNamespace: js.UndefOr[String] = js.native
  var removeComments: js.UndefOr[Boolean] = js.native
  var resolveJsonModule: js.UndefOr[Boolean] = js.native
  var rootDir: js.UndefOr[String] = js.native
  var rootDirs: js.UndefOr[js.Array[String]] = js.native
  var skipDefaultLibCheck: js.UndefOr[Boolean] = js.native
  var skipLibCheck: js.UndefOr[Boolean] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var sourceRoot: js.UndefOr[String] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var strictFunctionTypes: js.UndefOr[Boolean] = js.native
  var strictNullChecks: js.UndefOr[Boolean] = js.native
  var strictPropertyInitialization: js.UndefOr[Boolean] = js.native
  var suppressExcessPropertyErrors: js.UndefOr[Boolean] = js.native
  var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[ScriptTarget] = js.native
  var traceResolution: js.UndefOr[Boolean] = js.native
  /** Paths used to compute primary types search locations */
  var typeRoots: js.UndefOr[js.Array[String]] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
}

object CompilerOptions {
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  @scala.inline
  implicit class CompilerOptionsOps[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowJs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowJs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJs")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSyntheticDefaultImports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSyntheticDefaultImports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSyntheticDefaultImports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSyntheticDefaultImports")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnreachableCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnreachableCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnreachableCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnreachableCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUnusedLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnusedLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnusedLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnusedLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckJs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckJs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkJs")(js.undefined)
        ret
    }
    @scala.inline
    def withComposite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclarationDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarationDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationDir")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclarationMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarationMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSizeLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSizeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withDownlevelIteration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlevelIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownlevelIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlevelIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitBOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitBOM")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitDeclarationOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitDeclarationOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitDeclarationOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitDeclarationOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitDecoratorMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitDecoratorMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitDecoratorMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitDecoratorMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withEsModuleInterop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModuleInterop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsModuleInterop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("esModuleInterop")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentalDecorators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalDecorators")(js.undefined)
        ret
    }
    @scala.inline
    def withForceConsistentCasingInFileNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceConsistentCasingInFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceConsistentCasingInFileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceConsistentCasingInFileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withImportHelpers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importHelpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importHelpers")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineSourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineSources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineSources")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolatedModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolatedModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolatedModules")(js.undefined)
        ret
    }
    @scala.inline
    def withJsx(value: JsxEmit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsx")(js.undefined)
        ret
    }
    @scala.inline
    def withJsxFactory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsxFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsxFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyofStringsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyofStringsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyofStringsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyofStringsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withLib(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMapRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNodeModuleJsDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeModuleJsDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNodeModuleJsDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeModuleJsDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withModule(value: ModuleKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleResolution(value: ModuleResolutionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withNewLine(value: NewLineKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmit")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmitHelpers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitHelpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmitHelpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitHelpers")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEmitOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEmitOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmitOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withNoErrorTruncation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noErrorTruncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoErrorTruncation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noErrorTruncation")(js.undefined)
        ret
    }
    @scala.inline
    def withNoFallthroughCasesInSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFallthroughCasesInSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoFallthroughCasesInSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFallthroughCasesInSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withNoImplicitAny(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoImplicitAny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitAny")(js.undefined)
        ret
    }
    @scala.inline
    def withNoImplicitReturns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitReturns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoImplicitReturns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitReturns")(js.undefined)
        ret
    }
    @scala.inline
    def withNoImplicitThis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitThis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoImplicitThis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitThis")(js.undefined)
        ret
    }
    @scala.inline
    def withNoImplicitUseStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitUseStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoImplicitUseStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImplicitUseStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLib(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLib")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withNoStrictGenericChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStrictGenericChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoStrictGenericChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStrictGenericChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUnusedLocals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnusedLocals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUnusedLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnusedLocals")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUnusedParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnusedParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUnusedParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnusedParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withOutDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDir")(js.undefined)
        ret
    }
    @scala.inline
    def withOutFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: MapLike[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveConstEnums(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveConstEnums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveConstEnums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveConstEnums")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withReactNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeComments")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveJsonModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveJsonModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveJsonModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveJsonModule")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipDefaultLibCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDefaultLibCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipDefaultLibCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDefaultLibCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLibCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLibCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLibCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLibCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictFunctionTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictFunctionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictFunctionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictFunctionTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictNullChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNullChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictNullChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNullChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictPropertyInitialization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictPropertyInitialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictPropertyInitialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictPropertyInitialization")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressExcessPropertyErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressExcessPropertyErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressExcessPropertyErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressExcessPropertyErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressImplicitAnyIndexErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressImplicitAnyIndexErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressImplicitAnyIndexErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressImplicitAnyIndexErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: ScriptTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeRoots(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeRoots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeRoots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeRoots")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}


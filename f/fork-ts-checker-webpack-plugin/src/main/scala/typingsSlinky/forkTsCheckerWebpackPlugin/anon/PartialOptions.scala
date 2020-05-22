package typingsSlinky.forkTsCheckerWebpackPlugin.anon

import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.default
import typingsSlinky.forkTsCheckerWebpackPlugin.mod.Formatter
import typingsSlinky.forkTsCheckerWebpackPlugin.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin.Options> */
trait PartialOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var checkSyntacticErrors: js.UndefOr[Boolean] = js.undefined
  var colors: js.UndefOr[Boolean] = js.undefined
  var compilerOptions: js.UndefOr[js.Object] = js.undefined
  var eslint: js.UndefOr[Boolean] = js.undefined
  var eslintOptions: js.UndefOr[js.Object] = js.undefined
  var formatter: js.UndefOr[default | codeframe | Formatter] = js.undefined
  var formatterOptions: js.UndefOr[js.Any] = js.undefined
  var ignoreDiagnostics: js.UndefOr[js.Array[Double]] = js.undefined
  var ignoreLintWarnings: js.UndefOr[Boolean] = js.undefined
  var ignoreLints: js.UndefOr[js.Array[String]] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var measureCompilationTime: js.UndefOr[Boolean] = js.undefined
  var memoryLimit: js.UndefOr[Double] = js.undefined
  var reportFiles: js.UndefOr[js.Array[String]] = js.undefined
  var resolveModuleNameModule: js.UndefOr[String] = js.undefined
  var resolveTypeReferenceDirectiveModule: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var tsconfig: js.UndefOr[String] = js.undefined
  var tslint: js.UndefOr[String | `true`] = js.undefined
  var tslintAutoFix: js.UndefOr[Boolean] = js.undefined
  var typescript: js.UndefOr[String] = js.undefined
  var useTypescriptIncrementalApi: js.UndefOr[Boolean] = js.undefined
  var vue: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[String | js.Array[String]] = js.undefined
  var workers: js.UndefOr[Double] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    checkSyntacticErrors: js.UndefOr[Boolean] = js.undefined,
    colors: js.UndefOr[Boolean] = js.undefined,
    compilerOptions: js.Object = null,
    eslint: js.UndefOr[Boolean] = js.undefined,
    eslintOptions: js.Object = null,
    formatter: default | codeframe | Formatter = null,
    formatterOptions: js.Any = null,
    ignoreDiagnostics: js.Array[Double] = null,
    ignoreLintWarnings: js.UndefOr[Boolean] = js.undefined,
    ignoreLints: js.Array[String] = null,
    logger: Logger = null,
    measureCompilationTime: js.UndefOr[Boolean] = js.undefined,
    memoryLimit: js.UndefOr[Double] = js.undefined,
    reportFiles: js.Array[String] = null,
    resolveModuleNameModule: String = null,
    resolveTypeReferenceDirectiveModule: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    tsconfig: String = null,
    tslint: String | `true` = null,
    tslintAutoFix: js.UndefOr[Boolean] = js.undefined,
    typescript: String = null,
    useTypescriptIncrementalApi: js.UndefOr[Boolean] = js.undefined,
    vue: js.UndefOr[Boolean] = js.undefined,
    watch: String | js.Array[String] = null,
    workers: js.UndefOr[Double] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkSyntacticErrors)) __obj.updateDynamic("checkSyntacticErrors")(checkSyntacticErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(eslint)) __obj.updateDynamic("eslint")(eslint.get.asInstanceOf[js.Any])
    if (eslintOptions != null) __obj.updateDynamic("eslintOptions")(eslintOptions.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formatterOptions != null) __obj.updateDynamic("formatterOptions")(formatterOptions.asInstanceOf[js.Any])
    if (ignoreDiagnostics != null) __obj.updateDynamic("ignoreDiagnostics")(ignoreDiagnostics.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLintWarnings)) __obj.updateDynamic("ignoreLintWarnings")(ignoreLintWarnings.get.asInstanceOf[js.Any])
    if (ignoreLints != null) __obj.updateDynamic("ignoreLints")(ignoreLints.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(measureCompilationTime)) __obj.updateDynamic("measureCompilationTime")(measureCompilationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryLimit)) __obj.updateDynamic("memoryLimit")(memoryLimit.get.asInstanceOf[js.Any])
    if (reportFiles != null) __obj.updateDynamic("reportFiles")(reportFiles.asInstanceOf[js.Any])
    if (resolveModuleNameModule != null) __obj.updateDynamic("resolveModuleNameModule")(resolveModuleNameModule.asInstanceOf[js.Any])
    if (resolveTypeReferenceDirectiveModule != null) __obj.updateDynamic("resolveTypeReferenceDirectiveModule")(resolveTypeReferenceDirectiveModule.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (tsconfig != null) __obj.updateDynamic("tsconfig")(tsconfig.asInstanceOf[js.Any])
    if (tslint != null) __obj.updateDynamic("tslint")(tslint.asInstanceOf[js.Any])
    if (!js.isUndefined(tslintAutoFix)) __obj.updateDynamic("tslintAutoFix")(tslintAutoFix.get.asInstanceOf[js.Any])
    if (typescript != null) __obj.updateDynamic("typescript")(typescript.asInstanceOf[js.Any])
    if (!js.isUndefined(useTypescriptIncrementalApi)) __obj.updateDynamic("useTypescriptIncrementalApi")(useTypescriptIncrementalApi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vue)) __obj.updateDynamic("vue")(vue.get.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (!js.isUndefined(workers)) __obj.updateDynamic("workers")(workers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}


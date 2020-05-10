package typingsSlinky.forkTsCheckerWebpackPlugin.mod

import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.default
import typingsSlinky.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var async: Boolean = js.native
  var checkSyntacticErrors: Boolean = js.native
  var colors: Boolean = js.native
  var compilerOptions: js.Object = js.native
  var eslint: Boolean = js.native
  /** Options to supply to eslint https://eslint.org/docs/1.0.0/developer-guide/nodejs-api#cliengine */
  var eslintOptions: js.Object = js.native
  var formatter: default | codeframe | Formatter = js.native
  var formatterOptions: js.Any = js.native
  var ignoreDiagnostics: js.Array[Double] = js.native
  var ignoreLintWarnings: Boolean = js.native
  var ignoreLints: js.Array[String] = js.native
  var logger: Logger = js.native
  var measureCompilationTime: Boolean = js.native
  var memoryLimit: Double = js.native
  var reportFiles: js.Array[String] = js.native
  var resolveModuleNameModule: String = js.native
  var resolveTypeReferenceDirectiveModule: String = js.native
  var silent: Boolean = js.native
  var tsconfig: String = js.native
  var tslint: js.UndefOr[String | `true`] = js.native
  var tslintAutoFix: Boolean = js.native
  var typescript: String = js.native
  var useTypescriptIncrementalApi: Boolean = js.native
  var vue: Boolean = js.native
  var watch: String | js.Array[String] = js.native
  var workers: Double = js.native
}

object Options {
  @scala.inline
  def apply(
    async: Boolean,
    checkSyntacticErrors: Boolean,
    colors: Boolean,
    compilerOptions: js.Object,
    eslint: Boolean,
    eslintOptions: js.Object,
    formatter: default | codeframe | Formatter,
    formatterOptions: js.Any,
    ignoreDiagnostics: js.Array[Double],
    ignoreLintWarnings: Boolean,
    ignoreLints: js.Array[String],
    logger: Logger,
    measureCompilationTime: Boolean,
    memoryLimit: Double,
    reportFiles: js.Array[String],
    resolveModuleNameModule: String,
    resolveTypeReferenceDirectiveModule: String,
    silent: Boolean,
    tsconfig: String,
    tslintAutoFix: Boolean,
    typescript: String,
    useTypescriptIncrementalApi: Boolean,
    vue: Boolean,
    watch: String | js.Array[String],
    workers: Double
  ): Options = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], eslint = eslint.asInstanceOf[js.Any], eslintOptions = eslintOptions.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], ignoreDiagnostics = ignoreDiagnostics.asInstanceOf[js.Any], ignoreLintWarnings = ignoreLintWarnings.asInstanceOf[js.Any], ignoreLints = ignoreLints.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], measureCompilationTime = measureCompilationTime.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], reportFiles = reportFiles.asInstanceOf[js.Any], resolveModuleNameModule = resolveModuleNameModule.asInstanceOf[js.Any], resolveTypeReferenceDirectiveModule = resolveTypeReferenceDirectiveModule.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], tslintAutoFix = tslintAutoFix.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], useTypescriptIncrementalApi = useTypescriptIncrementalApi.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckSyntacticErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSyntacticErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilerOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEslintOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslintOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatterFunction2(value: (/* message */ NormalizedMessage, /* useColors */ Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormatter(value: default | codeframe | Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatterOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreDiagnostics(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreLintWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLintWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreLints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasureCompilationTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureCompilationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveModuleNameModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleNameModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveTypeReferenceDirectiveModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirectiveModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsconfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslintAutoFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslintAutoFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTypescriptIncrementalApi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTypescriptIncrementalApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTslint(value: String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTslint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslint")(js.undefined)
        ret
    }
  }
  
}


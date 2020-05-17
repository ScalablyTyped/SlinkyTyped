package typingsSlinky.forkTsCheckerWebpackPlugin.anon

import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.default
import typingsSlinky.forkTsCheckerWebpackPlugin.mod.Formatter
import typingsSlinky.forkTsCheckerWebpackPlugin.mod.Logger
import typingsSlinky.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin.Options> */
@js.native
trait PartialOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var checkSyntacticErrors: js.UndefOr[Boolean] = js.native
  var colors: js.UndefOr[Boolean] = js.native
  var compilerOptions: js.UndefOr[js.Object] = js.native
  var eslint: js.UndefOr[Boolean] = js.native
  var eslintOptions: js.UndefOr[js.Object] = js.native
  var formatter: js.UndefOr[default | codeframe | Formatter] = js.native
  var formatterOptions: js.UndefOr[js.Any] = js.native
  var ignoreDiagnostics: js.UndefOr[js.Array[Double]] = js.native
  var ignoreLintWarnings: js.UndefOr[Boolean] = js.native
  var ignoreLints: js.UndefOr[js.Array[String]] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var measureCompilationTime: js.UndefOr[Boolean] = js.native
  var memoryLimit: js.UndefOr[Double] = js.native
  var reportFiles: js.UndefOr[js.Array[String]] = js.native
  var resolveModuleNameModule: js.UndefOr[String] = js.native
  var resolveTypeReferenceDirectiveModule: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var tsconfig: js.UndefOr[String] = js.native
  var tslint: js.UndefOr[String | `true`] = js.native
  var tslintAutoFix: js.UndefOr[Boolean] = js.native
  var typescript: js.UndefOr[String] = js.native
  var useTypescriptIncrementalApi: js.UndefOr[Boolean] = js.native
  var vue: js.UndefOr[Boolean] = js.native
  var watch: js.UndefOr[String | js.Array[String]] = js.native
  var workers: js.UndefOr[Double] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckSyntacticErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSyntacticErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckSyntacticErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSyntacticErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCompilerOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEslint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEslint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslint")(js.undefined)
        ret
    }
    @scala.inline
    def withEslintOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslintOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEslintOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eslintOptions")(js.undefined)
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
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatterOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDiagnostics(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreLintWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLintWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreLintWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLintWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreLints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreLints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLints")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureCompilationTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureCompilationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureCompilationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureCompilationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withReportFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveModuleNameModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleNameModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveModuleNameModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleNameModule")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveTypeReferenceDirectiveModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirectiveModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveTypeReferenceDirectiveModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirectiveModule")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTsconfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsconfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsconfig")(js.undefined)
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
    @scala.inline
    def withTslintAutoFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslintAutoFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTslintAutoFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tslintAutoFix")(js.undefined)
        ret
    }
    @scala.inline
    def withTypescript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypescript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescript")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTypescriptIncrementalApi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTypescriptIncrementalApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTypescriptIncrementalApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTypescriptIncrementalApi")(js.undefined)
        ret
    }
    @scala.inline
    def withVue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vue")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(js.undefined)
        ret
    }
  }
  
}


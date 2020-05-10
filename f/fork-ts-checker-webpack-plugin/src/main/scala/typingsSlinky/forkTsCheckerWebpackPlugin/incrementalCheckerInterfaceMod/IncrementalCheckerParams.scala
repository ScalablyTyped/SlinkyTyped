package typingsSlinky.forkTsCheckerWebpackPlugin.incrementalCheckerInterfaceMod

import typingsSlinky.forkTsCheckerWebpackPlugin.Typeofts
import typingsSlinky.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typingsSlinky.tslint.mod.RuleFailure
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncrementalCheckerParams extends ApiIncrementalCheckerParams {
  var vue: Boolean = js.native
  var watchPaths: js.Array[String] = js.native
  var workDivision: Double = js.native
  var workNumber: Double = js.native
}

object IncrementalCheckerParams {
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
    typescript: Typeofts,
    vue: Boolean,
    watchPaths: js.Array[String],
    workDivision: Double,
    workNumber: Double
  ): IncrementalCheckerParams = {
    val __obj = js.Dynamic.literal(checkSyntacticErrors = checkSyntacticErrors.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createNormalizedMessageFromDiagnostic = js.Any.fromFunction1(createNormalizedMessageFromDiagnostic), createNormalizedMessageFromRuleFailure = js.Any.fromFunction1(createNormalizedMessageFromRuleFailure), linterAutoFix = linterAutoFix.asInstanceOf[js.Any], linterConfigFile = linterConfigFile.asInstanceOf[js.Any], programConfigFile = programConfigFile.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], vue = vue.asInstanceOf[js.Any], watchPaths = watchPaths.asInstanceOf[js.Any], workDivision = workDivision.asInstanceOf[js.Any], workNumber = workNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementalCheckerParams]
  }
  @scala.inline
  implicit class IncrementalCheckerParamsOps[Self <: IncrementalCheckerParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkDivision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workDivision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.gulpTypescript.reporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationResult extends js.Object {
  var declarationErrors: Double = js.native
  var emitErrors: Double = js.native
  var emitSkipped: Boolean = js.native
  var globalErrors: Double = js.native
  var noEmit: Boolean = js.native
  var optionsErrors: Double = js.native
  var semanticErrors: Double = js.native
  var syntaxErrors: Double = js.native
  /**
    * Only used when using isolatedModules.
    */
  var transpileErrors: Double = js.native
}

object CompilationResult {
  @scala.inline
  def apply(
    declarationErrors: Double,
    emitErrors: Double,
    emitSkipped: Boolean,
    globalErrors: Double,
    noEmit: Boolean,
    optionsErrors: Double,
    semanticErrors: Double,
    syntaxErrors: Double,
    transpileErrors: Double
  ): CompilationResult = {
    val __obj = js.Dynamic.literal(declarationErrors = declarationErrors.asInstanceOf[js.Any], emitErrors = emitErrors.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any], globalErrors = globalErrors.asInstanceOf[js.Any], noEmit = noEmit.asInstanceOf[js.Any], optionsErrors = optionsErrors.asInstanceOf[js.Any], semanticErrors = semanticErrors.asInstanceOf[js.Any], syntaxErrors = syntaxErrors.asInstanceOf[js.Any], transpileErrors = transpileErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationResult]
  }
  @scala.inline
  implicit class CompilationResultOps[Self <: CompilationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarationErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmitSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoEmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyntaxErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntaxErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranspileErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


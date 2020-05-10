package typingsSlinky.grammarkdown.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerOptions extends js.Object {
  var diagnostics: js.UndefOr[Boolean] = js.native
  var emitLinks: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[EmitFormat] = js.native
  var newLine: js.UndefOr[NewLineKind] = js.native
  var noChecks: js.UndefOr[Boolean] = js.native
  var noEmit: js.UndefOr[Boolean] = js.native
  var noEmitOnError: js.UndefOr[Boolean] = js.native
  var noStrictParametricProductions: js.UndefOr[Boolean] = js.native
  var out: js.UndefOr[String] = js.native
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
    def withDiagnostics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: EmitFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
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
    def withNoChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noChecks")(js.undefined)
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
    def withNoStrictParametricProductions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStrictParametricProductions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoStrictParametricProductions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStrictParametricProductions")(js.undefined)
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
  }
  
}


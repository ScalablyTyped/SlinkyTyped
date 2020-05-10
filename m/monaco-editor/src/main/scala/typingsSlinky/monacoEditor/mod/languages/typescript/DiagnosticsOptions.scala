package typingsSlinky.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticsOptions extends js.Object {
  var noSemanticValidation: js.UndefOr[Boolean] = js.native
  var noSyntaxValidation: js.UndefOr[Boolean] = js.native
}

object DiagnosticsOptions {
  @scala.inline
  def apply(): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticsOptions]
  }
  @scala.inline
  implicit class DiagnosticsOptionsOps[Self <: DiagnosticsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoSemanticValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSemanticValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSemanticValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSemanticValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSyntaxValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSyntaxValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSyntaxValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSyntaxValidation")(js.undefined)
        ret
    }
  }
  
}


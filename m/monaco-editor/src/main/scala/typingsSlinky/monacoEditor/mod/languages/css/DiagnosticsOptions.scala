package typingsSlinky.monacoEditor.mod.languages.css

import typingsSlinky.monacoEditor.anon.ArgumentsInColorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnosticsOptions extends js.Object {
  val lint: js.UndefOr[ArgumentsInColorFunction] = js.native
  val validate: js.UndefOr[Boolean] = js.native
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
    def withLint(value: ArgumentsInColorFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lint")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}


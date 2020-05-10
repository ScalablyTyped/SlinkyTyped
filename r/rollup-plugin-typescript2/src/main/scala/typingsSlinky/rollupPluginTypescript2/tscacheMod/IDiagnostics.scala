package typingsSlinky.rollupPluginTypescript2.tscacheMod

import typingsSlinky.typescript.mod.DiagnosticCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiagnostics extends js.Object {
  var category: DiagnosticCategory = js.native
  var code: Double = js.native
  var fileLine: js.UndefOr[String] = js.native
  var flatMessage: String = js.native
  var formatted: String = js.native
  var `type`: String = js.native
}

object IDiagnostics {
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, flatMessage: String, formatted: String, `type`: String): IDiagnostics = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], flatMessage = flatMessage.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiagnostics]
  }
  @scala.inline
  implicit class IDiagnosticsOps[Self <: IDiagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: DiagnosticCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlatMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLine")(js.undefined)
        ret
    }
  }
  
}


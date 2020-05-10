package typingsSlinky.openfin.crashReporterOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrashReporterOption extends js.Object {
  var diagnosticMode: Boolean = js.native
  var isRunning: js.UndefOr[Boolean] = js.native
}

object CrashReporterOption {
  @scala.inline
  def apply(diagnosticMode: Boolean): CrashReporterOption = {
    val __obj = js.Dynamic.literal(diagnosticMode = diagnosticMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrashReporterOption]
  }
  @scala.inline
  implicit class CrashReporterOptionOps[Self <: CrashReporterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagnosticMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.undefined)
        ret
    }
  }
  
}


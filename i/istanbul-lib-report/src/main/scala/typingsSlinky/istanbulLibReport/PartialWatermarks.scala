package typingsSlinky.istanbulLibReport

import typingsSlinky.istanbulLibReport.mod.Watermark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.Watermarks> */
@js.native
trait PartialWatermarks extends js.Object {
  var branches: js.UndefOr[Watermark] = js.native
  var functions: js.UndefOr[Watermark] = js.native
  var lines: js.UndefOr[Watermark] = js.native
  var statements: js.UndefOr[Watermark] = js.native
}

object PartialWatermarks {
  @scala.inline
  def apply(): PartialWatermarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWatermarks]
  }
  @scala.inline
  implicit class PartialWatermarksOps[Self <: PartialWatermarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranches(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctions(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withStatements(value: Watermark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(js.undefined)
        ret
    }
  }
  
}


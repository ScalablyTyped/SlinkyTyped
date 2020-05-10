package typingsSlinky.gulpIstanbul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageOptions extends js.Object {
  var branches: js.UndefOr[Double] = js.native
  var functions: js.UndefOr[Double] = js.native
  var lines: js.UndefOr[Double] = js.native
  var statements: js.UndefOr[Double] = js.native
}

object CoverageOptions {
  @scala.inline
  def apply(): CoverageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageOptions]
  }
  @scala.inline
  implicit class CoverageOptionsOps[Self <: CoverageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranches(value: Double): Self = {
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
    def withFunctions(value: Double): Self = {
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
    def withLines(value: Double): Self = {
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
    def withStatements(value: Double): Self = {
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


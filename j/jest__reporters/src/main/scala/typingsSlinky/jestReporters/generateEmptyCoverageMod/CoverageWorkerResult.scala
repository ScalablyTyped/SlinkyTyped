package typingsSlinky.jestReporters.generateEmptyCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageWorkerResult extends js.Object {
  var coverage: js.Any = js.native
  var sourceMapPath: js.UndefOr[String | Null] = js.native
}

object CoverageWorkerResult {
  @scala.inline
  def apply(coverage: js.Any): CoverageWorkerResult = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageWorkerResult]
  }
  @scala.inline
  implicit class CoverageWorkerResultOps[Self <: CoverageWorkerResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPath")(null)
        ret
    }
  }
  
}


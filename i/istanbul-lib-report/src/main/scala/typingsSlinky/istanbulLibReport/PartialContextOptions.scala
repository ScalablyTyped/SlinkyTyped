package typingsSlinky.istanbulLibReport

import typingsSlinky.istanbulLibCoverage.mod.CoverageMap
import typingsSlinky.istanbulLibReport.mod.Summarizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ContextOptions> */
@js.native
trait PartialContextOptions extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap] = js.native
  var defaultSummarizer: js.UndefOr[Summarizers] = js.native
  var dir: js.UndefOr[String] = js.native
  var sourceFinder: js.UndefOr[js.Function1[/* filepath */ String, String]] = js.native
  var watermarks: js.UndefOr[PartialWatermarks] = js.native
}

object PartialContextOptions {
  @scala.inline
  def apply(): PartialContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialContextOptions]
  }
  @scala.inline
  implicit class PartialContextOptionsOps[Self <: PartialContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageMap(value: CoverageMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSummarizer(value: Summarizers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSummarizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSummarizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSummarizer")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFinder(value: /* filepath */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFinder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSourceFinder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFinder")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermarks(value: PartialWatermarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarks")(js.undefined)
        ret
    }
  }
  
}


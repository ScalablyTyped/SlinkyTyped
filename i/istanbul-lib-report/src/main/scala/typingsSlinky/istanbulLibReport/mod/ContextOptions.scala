package typingsSlinky.istanbulLibReport.mod

import typingsSlinky.istanbulLibCoverage.mod.CoverageMap
import typingsSlinky.istanbulLibReport.PartialWatermarks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextOptions extends js.Object {
  var coverageMap: CoverageMap = js.native
  var defaultSummarizer: Summarizers = js.native
  var dir: String = js.native
  var watermarks: PartialWatermarks = js.native
  def sourceFinder(filepath: String): String = js.native
}

object ContextOptions {
  @scala.inline
  def apply(
    coverageMap: CoverageMap,
    defaultSummarizer: Summarizers,
    dir: String,
    sourceFinder: String => String,
    watermarks: PartialWatermarks
  ): ContextOptions = {
    val __obj = js.Dynamic.literal(coverageMap = coverageMap.asInstanceOf[js.Any], defaultSummarizer = defaultSummarizer.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder), watermarks = watermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
  @scala.inline
  implicit class ContextOptionsOps[Self <: ContextOptions] (val x: Self) extends AnyVal {
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
    def withDefaultSummarizer(value: Summarizers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSummarizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFinder(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFinder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatermarks(value: PartialWatermarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


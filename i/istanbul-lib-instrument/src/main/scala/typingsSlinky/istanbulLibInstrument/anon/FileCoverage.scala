package typingsSlinky.istanbulLibInstrument.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCoverage extends js.Object {
  var fileCoverage: typingsSlinky.istanbulLibCoverage.mod.FileCoverage = js.native
  var sourceMappingURL: String = js.native
}

object FileCoverage {
  @scala.inline
  def apply(fileCoverage: typingsSlinky.istanbulLibCoverage.mod.FileCoverage, sourceMappingURL: String): FileCoverage = {
    val __obj = js.Dynamic.literal(fileCoverage = fileCoverage.asInstanceOf[js.Any], sourceMappingURL = sourceMappingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCoverage]
  }
  @scala.inline
  implicit class FileCoverageOps[Self <: FileCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileCoverage(value: typingsSlinky.istanbulLibCoverage.mod.FileCoverage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMappingURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMappingURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


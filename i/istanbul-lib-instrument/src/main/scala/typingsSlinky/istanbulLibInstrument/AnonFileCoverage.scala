package typingsSlinky.istanbulLibInstrument

import typingsSlinky.istanbulLibCoverage.mod.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileCoverage extends js.Object {
  var fileCoverage: FileCoverage = js.native
  var sourceMappingURL: String = js.native
}

object AnonFileCoverage {
  @scala.inline
  def apply(fileCoverage: FileCoverage, sourceMappingURL: String): AnonFileCoverage = {
    val __obj = js.Dynamic.literal(fileCoverage = fileCoverage.asInstanceOf[js.Any], sourceMappingURL = sourceMappingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileCoverage]
  }
  @scala.inline
  implicit class AnonFileCoverageOps[Self <: AnonFileCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileCoverage(value: FileCoverage): Self = {
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


package typingsSlinky.istanbulLibInstrument.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialCoverage extends js.Object {
  var coverageData: js.Any = js.native
  var gcv: js.Any = js.native
  var hash: String = js.native
  var path: String = js.native
}

object InitialCoverage {
  @scala.inline
  def apply(coverageData: js.Any, gcv: js.Any, hash: String, path: String): InitialCoverage = {
    val __obj = js.Dynamic.literal(coverageData = coverageData.asInstanceOf[js.Any], gcv = gcv.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialCoverage]
  }
  @scala.inline
  implicit class InitialCoverageOps[Self <: InitialCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGcv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


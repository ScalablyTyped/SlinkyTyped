package typingsSlinky.gulpIstanbul.mod

import typingsSlinky.gulpIstanbul.AnonEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdOptions extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.native
  var thresholds: js.UndefOr[AnonEach] = js.native
}

object ThresholdOptions {
  @scala.inline
  def apply(): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdOptions]
  }
  @scala.inline
  implicit class ThresholdOptionsOps[Self <: ThresholdOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholds(value: AnonEach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.jestReporters.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryOptions extends js.Object {
  var estimatedTime: js.UndefOr[Double] = js.native
  var roundTime: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SummaryOptions {
  @scala.inline
  def apply(): SummaryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryOptions]
  }
  @scala.inline
  implicit class SummaryOptionsOps[Self <: SummaryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


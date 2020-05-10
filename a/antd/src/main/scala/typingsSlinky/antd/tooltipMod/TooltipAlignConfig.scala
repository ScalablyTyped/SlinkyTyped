package typingsSlinky.antd.tooltipMod

import typingsSlinky.antd.AnonAdjustY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipAlignConfig extends js.Object {
  var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  var overflow: js.UndefOr[AnonAdjustY] = js.native
  var points: js.UndefOr[js.Tuple2[String, String]] = js.native
  var targetOffset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
  var useCssBottom: js.UndefOr[Boolean] = js.native
  var useCssRight: js.UndefOr[Boolean] = js.native
  var useCssTransform: js.UndefOr[Boolean] = js.native
}

object TooltipAlignConfig {
  @scala.inline
  def apply(): TooltipAlignConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipAlignConfig]
  }
  @scala.inline
  implicit class TooltipAlignConfigOps[Self <: TooltipAlignConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: js.Tuple2[Double | String, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: AnonAdjustY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetOffset(value: js.Tuple2[Double | String, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCssBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCssBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCssRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCssRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssRight")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCssTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCssTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCssTransform")(js.undefined)
        ret
    }
  }
  
}


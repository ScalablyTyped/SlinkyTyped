package typingsSlinky.reactBootstrap.tooltipMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps
  extends AllHTMLAttributes[Tooltip]
     with ClassAttributes[Tooltip] {
  // Optional
  var arrowOffsetLeft: js.UndefOr[Double | String] = js.native
  var arrowOffsetTop: js.UndefOr[Double | String] = js.native
  var bsClass: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var placement: js.UndefOr[String] = js.native
  var positionLeft: js.UndefOr[Double] = js.native
  var positionTop: js.UndefOr[Double] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowOffsetLeft(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowOffsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowOffsetLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowOffsetTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowOffsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowOffsetTop")(js.undefined)
        ret
    }
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBsSize(value: Sizes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBsStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTop")(js.undefined)
        ret
    }
  }
  
}


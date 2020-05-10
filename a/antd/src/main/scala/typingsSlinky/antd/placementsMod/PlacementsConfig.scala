package typingsSlinky.antd.placementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementsConfig extends js.Object {
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
  var arrowWidth: js.UndefOr[Double] = js.native
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
  var horizontalArrowShift: js.UndefOr[Double] = js.native
  var verticalArrowShift: js.UndefOr[Double] = js.native
}

object PlacementsConfig {
  @scala.inline
  def apply(): PlacementsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsConfig]
  }
  @scala.inline
  implicit class PlacementsConfigOps[Self <: PlacementsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowPointAtCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPointAtCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowPointAtCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowPointAtCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjustOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalArrowShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalArrowShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalArrowShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalArrowShift")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalArrowShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrowShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalArrowShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrowShift")(js.undefined)
        ret
    }
  }
  
}


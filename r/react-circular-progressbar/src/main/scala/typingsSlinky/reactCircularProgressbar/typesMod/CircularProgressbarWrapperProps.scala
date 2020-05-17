package typingsSlinky.reactCircularProgressbar.typesMod

import typingsSlinky.reactCircularProgressbar.anon.Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularProgressbarWrapperProps extends js.Object {
  var background: js.UndefOr[Boolean] = js.native
  var backgroundPadding: js.UndefOr[Double] = js.native
  var circleRatio: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[Background] = js.native
  var counterClockwise: js.UndefOr[Boolean] = js.native
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var styles: js.UndefOr[CircularProgressbarStyles] = js.native
  var text: js.UndefOr[String] = js.native
  var value: Double = js.native
}

object CircularProgressbarWrapperProps {
  @scala.inline
  def apply(value: Double): CircularProgressbarWrapperProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressbarWrapperProps]
  }
  @scala.inline
  implicit class CircularProgressbarWrapperPropsOps[Self <: CircularProgressbarWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCounterClockwise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterClockwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterClockwise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterClockwise")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: CircularProgressbarStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}


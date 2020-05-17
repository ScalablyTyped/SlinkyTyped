package typingsSlinky.reactCircularProgressbar.typesMod

import typingsSlinky.reactCircularProgressbar.anon.Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularProgressbarDefaultProps extends js.Object {
  var background: Boolean = js.native
  var backgroundPadding: Double = js.native
  var circleRatio: Double = js.native
  var className: String = js.native
  var classes: Background = js.native
  var counterClockwise: Boolean = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var strokeWidth: Double = js.native
  var styles: CircularProgressbarStyles = js.native
  var text: String = js.native
}

object CircularProgressbarDefaultProps {
  @scala.inline
  def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: Background,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String
  ): CircularProgressbarDefaultProps = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressbarDefaultProps]
  }
  @scala.inline
  implicit class CircularProgressbarDefaultPropsOps[Self <: CircularProgressbarDefaultProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircleRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounterClockwise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterClockwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: CircularProgressbarStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


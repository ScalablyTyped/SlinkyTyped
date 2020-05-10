package typingsSlinky.amcharts.gaugeBandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaugeBand extends js.Object {
  /**
    * Opacity of band fill. Will use axis.bandAlpha if not set any.
    */
  var alpha: Double = js.native
  /**
    * When rolled-over, band will display balloon if you set some text for this property.
    */
  var balloonText: String = js.native
  /**
    * Color of a band.
    */
  var color: String = js.native
  /**
    * End value of a fill.
    */
  var endValue: Double = js.native
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  var gradientRatio: js.Array[Double] = js.native
  /**
    * Unique id of a band.
    */
  var id: String = js.native
  /**
    * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
    * Set 0 if you want the band to be drawn to the axis center.
    */
  var innerRadius: js.Any = js.native
  /**
    * Band radius. If not set any, the band will start with the axis outline.
    */
  var radius: js.Any = js.native
  /**
    * Start value of a fill.
    */
  var startValue: Double = js.native
  /**
    * Gauge band can be clickable and can lead to some page.
    */
  var url: String = js.native
  /**
    * Sets end value for the band.
    */
  def setEndValue(value: Double): Unit = js.native
  /**
    * Sets start value for the band.
    */
  def setStartValue(value: Double): Unit = js.native
}

object GaugeBand {
  @scala.inline
  def apply(
    alpha: Double,
    balloonText: String,
    color: String,
    endValue: Double,
    gradientRatio: js.Array[Double],
    id: String,
    innerRadius: js.Any,
    radius: js.Any,
    setEndValue: Double => Unit,
    setStartValue: Double => Unit,
    startValue: Double,
    url: String
  ): GaugeBand = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], gradientRatio = gradientRatio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setEndValue = js.Any.fromFunction1(setEndValue), setStartValue = js.Any.fromFunction1(setStartValue), startValue = startValue.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeBand]
  }
  @scala.inline
  implicit class GaugeBandOps[Self <: GaugeBand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalloonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientRatio(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRadius(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetEndValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStartValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.amcharts.amBalloonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmBalloon extends js.Object {
  /**
    * If this is set to true, border color instead of background color will be changed
    * when user rolls-over the slice, graph, etc.
    */
  var adjustBorderColor: Boolean = js.native
  /**
    * Balloon border opacity. Value range is 0 - 1.
    * @default 1
    */
  var borderAlpha: Double = js.native
  /**
    * Balloon border color. #FFFFFF
    */
  var borderColor: String = js.native
  /**
    * Balloon border thickness.
    * @default 2
    */
  var borderThickness: Double = js.native
  /**
    * Color of text in the balloon. #FFFFFF
    */
  var color: String = js.native
  /**
    * Balloon corner radius.
    * @default 6
    */
  var cornerRadius: Double = js.native
  /**
    * Balloon background opacity.
    * @default 1
    */
  var fillAlpha: Double = js.native
  /**
    * Balloon background color. Usually balloon background color is set by the chart.
    * Only if "adjustBorderColor" is "true" this color will be used.
    * @default "#CC0000"
    */
  var fillColor: String = js.native
  /**
    * Size of text in the balloon. Chart's fontSize is used by default.
    */
  var fontSize: String = js.native
  /**
    * Horizontal padding of the balloon.
    * @default 8
    */
  var horizontalPadding: Double = js.native
  /**
    * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
    * @default 10
    */
  var pointerWidth: Double = js.native
  /**
    * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used.
    * If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false
    */
  var showBullet: Boolean = js.native
  /**
    * Text alignment, possible values "left", "middle" and "right" middle
    */
  var textAlign: String = js.native
  /**
    * Color of the text shadow. #000000
    */
  var textShadowColor: String = js.native
  /**
    * Vertical padding of the balloon.
    * @default 5
    */
  var verticalPadding: Double = js.native
  /**
    * Hides balloon.
    */
  def hide(): Unit = js.native
  /**
    * Defines a square within which the balloon should appear.
    * Bounds are set by chart class, you don't need to call this method yourself.
    */
  def setBounds(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /**
    * Sets coordinates the balloon should point to.
    */
  def setPosition(x: Double, y: Double): Unit = js.native
  /**
    * Specifies the text which should be displayed.
    */
  def show(value: String): Unit = js.native
}

object AmBalloon {
  @scala.inline
  def apply(
    adjustBorderColor: Boolean,
    borderAlpha: Double,
    borderColor: String,
    borderThickness: Double,
    color: String,
    cornerRadius: Double,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    hide: () => Unit,
    horizontalPadding: Double,
    pointerWidth: Double,
    setBounds: (Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double) => Unit,
    show: String => Unit,
    showBullet: Boolean,
    textAlign: String,
    textShadowColor: String,
    verticalPadding: Double
  ): AmBalloon = {
    val __obj = js.Dynamic.literal(adjustBorderColor = adjustBorderColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderThickness = borderThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalPadding = horizontalPadding.asInstanceOf[js.Any], pointerWidth = pointerWidth.asInstanceOf[js.Any], setBounds = js.Any.fromFunction4(setBounds), setPosition = js.Any.fromFunction2(setPosition), show = js.Any.fromFunction1(show), showBullet = showBullet.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textShadowColor = textShadowColor.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmBalloon]
  }
  @scala.inline
  implicit class AmBalloonOps[Self <: AmBalloon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustBorderColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHorizontalPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetBounds(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShow(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowBullet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBullet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


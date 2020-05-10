package typingsSlinky.jqueryKnob.JQueryKnob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryKnobOptions extends js.Object {
  /**
  		 * arc size in degrees | default=360
  		 */
  var angleArc: js.UndefOr[Double] = js.native
  /**
  		 * starting angle in degrees | default=0
  		 */
  var angleOffset: js.UndefOr[Double] = js.native
  /**
  		 * background color
  		 */
  var bgColor: js.UndefOr[String] = js.native
  /**
  		 * triggered on [esc] keydown
  		 */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * executed at each change of the value
  		 */
  var change: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
  		 * display mode "cursor", cursor size could be changed passing a
  		 * numeric value to the option, default width is used when passing
  		 * boolean value "true" | default=gauge
  		 */
  var cursor: js.UndefOr[String | Boolean] = js.native
  /**
  		 * default=true | false=hide input
  		 */
  var displayInput: js.UndefOr[Boolean] = js.native
  /**
  		 * default=false | true=displays the previous value with transparency
  		 */
  var displayPrevious: js.UndefOr[Boolean] = js.native
  /**
  		 * when drawing the canvas
  		 */
  var draw: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * foreground color
  		 */
  var fgColor: js.UndefOr[String] = js.native
  /**
  		 * font family
  		 */
  var font: js.UndefOr[String] = js.native
  /**
  		 * font weight
  		 */
  var fontWeight: js.UndefOr[String] = js.native
  /**
  		 * allows to format output (add unit %, ms...)
  		 */
  var format: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
  		 * dial height
  		 */
  var height: js.UndefOr[Double] = js.native
  /**
  		 * input value (number) color
  		 */
  var inputColor: js.UndefOr[String] = js.native
  /**
  		 * gauge stroke endings | default=butt, round=rounded line endings
  		 */
  var lineCap: js.UndefOr[String] = js.native
  /**
  		 * max value | default=100
  		 */
  var max: js.UndefOr[Double] = js.native
  /**
  		 * min value | default=0
  		 */
  var min: js.UndefOr[Double] = js.native
  /**
  		 * disable input and events | default=false
  		 */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
  		 * executed on release
  		 */
  var release: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
  		 * direction of progression | default=clockwise
  		 */
  var rotation: js.UndefOr[String] = js.native
  /**
  		 * step size | default=1
  		 */
  var step: js.UndefOr[Double] = js.native
  /**
  		 * stop at min & max on keydown/mousewheel | default=true
  		 */
  var stopper: js.UndefOr[Boolean] = js.native
  /**
  		 * gauge thickness
  		 */
  var thickness: js.UndefOr[Double] = js.native
  /**
  		 * dial width
  		 */
  var width: js.UndefOr[Double] = js.native
}

object JQueryKnobOptions {
  @scala.inline
  def apply(): JQueryKnobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryKnobOptions]
  }
  @scala.inline
  implicit class JQueryKnobOptionsOps[Self <: JQueryKnobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleArc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleArc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleArc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleArc")(js.undefined)
        ret
    }
    @scala.inline
    def withAngleOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInput")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayPrevious(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.undefined)
        ret
    }
    @scala.inline
    def withFgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInputColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRelease(value: /* value */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStopper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopper")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
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


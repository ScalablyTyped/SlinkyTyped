package typingsSlinky.canvasGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearGaugeOptions extends GenericOptions {
  var barBeginCircle: js.UndefOr[Double] = js.native
  var barLength: js.UndefOr[Double] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var colorBarEnd: js.UndefOr[String] = js.native
  var colorBarProgressEnd: js.UndefOr[String] = js.native
  var needleSide: js.UndefOr[String] = js.native
  var numberSide: js.UndefOr[String] = js.native
  var tickSide: js.UndefOr[String] = js.native
  var ticksPadding: js.UndefOr[Double] = js.native
  var ticksWidth: js.UndefOr[Double] = js.native
  var ticksWidthMinor: js.UndefOr[Double] = js.native
}

object LinearGaugeOptions {
  @scala.inline
  def apply(renderTo: RenderTarget): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeOptions]
  }
  @scala.inline
  implicit class LinearGaugeOptionsOps[Self <: LinearGaugeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarBeginCircle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBeginCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarBeginCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barBeginCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withBarLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barLength")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBarEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBarEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColorBarProgressEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarProgressEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBarProgressEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBarProgressEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleSide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleSide")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberSide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSide")(js.undefined)
        ret
    }
    @scala.inline
    def withTickSide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickSide")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksWidthMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksWidthMinor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksWidthMinor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksWidthMinor")(js.undefined)
        ret
    }
  }
  
}


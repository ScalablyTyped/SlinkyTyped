package typingsSlinky.c3.anon

import typingsSlinky.c3.c3Strings.pow10
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  /**
    * Set the color interpolator for stanford color scale. This option is a
    * `d3.interpolate*` object or any function you definethat receives a
    * value between `0` and `1`, and returns a color as string.
    */
  var colors: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  /** Show lines anywhere in the chart. */
  var lines: js.UndefOr[js.Array[Class]] = js.native
  /**
    * Set the padding for the Stanford color scale.
    */
  var padding: js.UndefOr[typingsSlinky.c3.mod.Padding] = js.native
  /** Add regions to the chart. */
  var regions: js.UndefOr[js.Array[Opacity]] = js.native
  /**
    * Set formatter for stanford color scale axis tick text.
    * This option accepts the string 'pow10', a d3.format object and any function you define.
    * Defauls to `d3.format("d")`.
    */
  var scaleFormat: js.UndefOr[pow10 | (js.Function1[/* arg0 */ Double, String])] = js.native
  /** Change the maximum value of the stanford color scale. */
  var scaleMax: js.UndefOr[Double] = js.native
  /** Change the minimum value of the stanford color scale. */
  var scaleMin: js.UndefOr[Double] = js.native
  /**
    * Set the values for stanford color scale axis tick text. This option accepts a function that returns an array of numbers.
    */
  var scaleValues: js.UndefOr[js.Function2[/* minValue */ Double, /* maxValue */ Double, js.Array[Double]]] = js.native
  /**
    * Change the width of the stanford color scale.
    * Defaults to `20`.
    */
  var scaleWidth: js.UndefOr[scala.Nothing] = js.native
  /** Show text anywhere inside the chart. */
  var texts: js.UndefOr[js.Array[Content]] = js.native
}

object Colors {
  @scala.inline
  def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: /* value */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: js.Array[Class]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: typingsSlinky.c3.mod.Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[Opacity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFormatFunction1(value: /* arg0 */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScaleFormat(value: pow10 | (js.Function1[/* arg0 */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMax")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMin")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleValues(value: (/* minValue */ Double, /* maxValue */ Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleValues")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutScaleValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: js.Array[Content]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
  }
  
}


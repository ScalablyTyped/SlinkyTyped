package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.MaxNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XTickConfiguration extends TickConfiguration {
  /**
    * Centerise ticks on category axis
    */
  var centered: js.UndefOr[Boolean] = js.native
  /**
    * Setting for culling ticks.
    * If `true` is set, the ticks will be culled, then only limitted tick text will be shown.
    * This option does not hide the tick lines. If `false` is set, all of ticks will be shown.
    */
  var culling: js.UndefOr[Boolean | MaxNumber] = js.native
  /**
    * Fit x axis ticks.
    * If `true` set, the ticks will be positioned nicely. If `false` set, the ticks will be positioned
    * according to x value of the data points.
    */
  var fit: js.UndefOr[Boolean] = js.native
  /**
    * A function to format x-axis tick values. A format string is also supported for timeseries data.
    */
  var format: js.UndefOr[String | (js.Function1[/* x */ Double | js.Date, String | Double])] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var multilineMax: js.UndefOr[Double] = js.native
  /**
    * Set width of x axis tick.
    */
  var width: js.UndefOr[Double] = js.native
}

object XTickConfiguration {
  @scala.inline
  def apply(): XTickConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XTickConfiguration]
  }
  @scala.inline
  implicit class XTickConfigurationOps[Self <: XTickConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(js.undefined)
        ret
    }
    @scala.inline
    def withCulling(value: Boolean | MaxNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culling")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* x */ Double | js.Date => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: String | (js.Function1[/* x */ Double | js.Date, String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withMultilineMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multilineMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultilineMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multilineMax")(js.undefined)
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


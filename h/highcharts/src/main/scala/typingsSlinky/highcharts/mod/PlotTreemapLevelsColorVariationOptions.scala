package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.brightness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapLevelsColorVariationOptions extends js.Object {
  /**
    * (Highcharts) The key of a color variation. Currently supports
    * `brightness` only.
    */
  var key: js.UndefOr[brightness] = js.native
  /**
    * (Highcharts) The ending value of a color variation. The last sibling will
    * receive this value.
    */
  var to: js.UndefOr[Double] = js.native
}

object PlotTreemapLevelsColorVariationOptions {
  @scala.inline
  def apply(): PlotTreemapLevelsColorVariationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapLevelsColorVariationOptions]
  }
  @scala.inline
  implicit class PlotTreemapLevelsColorVariationOptionsOps[Self <: PlotTreemapLevelsColorVariationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: brightness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}


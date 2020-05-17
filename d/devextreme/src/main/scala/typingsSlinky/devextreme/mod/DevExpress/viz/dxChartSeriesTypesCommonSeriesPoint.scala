package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ColorVisible
import typingsSlinky.devextreme.anon.HeightUrl
import typingsSlinky.devextreme.anon.Size
import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.cross
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import typingsSlinky.devextreme.devextremeStrings.polygon
import typingsSlinky.devextreme.devextremeStrings.square
import typingsSlinky.devextreme.devextremeStrings.triangleDown
import typingsSlinky.devextreme.devextremeStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures series points in scatter, line- and area-like series. */
@js.native
trait dxChartSeriesTypesCommonSeriesPoint extends js.Object {
  /** Configures the appearance of the series point border in scatter, line- and area-like series. */
  var border: js.UndefOr[ColorVisible] = js.native
  /** Colors the series points. */
  var color: js.UndefOr[String] = js.native
  /** Specifies series elements to be highlighted when a user pauses on a series point. */
  var hoverMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.native
  /** Configures the appearance adopted by a series point when a user pauses on it. */
  var hoverStyle: js.UndefOr[Size] = js.native
  /** Substitutes the standard point symbols with an image. */
  var image: js.UndefOr[String | HeightUrl] = js.native
  /** Specifies series elements to be highlighted when a user selects a series point. */
  var selectionMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.native
  /** Configures the appearance of a selected series point. */
  var selectionStyle: js.UndefOr[Size] = js.native
  /** Specifies the diameter of series points in pixels. */
  var size: js.UndefOr[Double] = js.native
  /** Specifies which symbol should represent series points in scatter, line- and area-like series. */
  var symbol: js.UndefOr[circle | cross | polygon | square | triangleDown | triangleUp] = js.native
  /** Makes the series points visible. */
  var visible: js.UndefOr[Boolean] = js.native
}

object dxChartSeriesTypesCommonSeriesPoint {
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesPoint]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesPointOps[Self <: dxChartSeriesTypesCommonSeriesPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ColorVisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMode(value: allArgumentPoints | allSeriesPoints | none | onlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverStyle(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String | HeightUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: allArgumentPoints | allSeriesPoints | none | onlyPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStyle(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: circle | cross | polygon | square | triangleDown | triangleUp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}


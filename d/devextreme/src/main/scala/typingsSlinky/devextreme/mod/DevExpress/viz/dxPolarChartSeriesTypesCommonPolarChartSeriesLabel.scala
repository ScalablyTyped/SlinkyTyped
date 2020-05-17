package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.ColorDashStyle
import typingsSlinky.devextreme.anon.ColorVisible
import typingsSlinky.devextreme.devextremeStrings.inside
import typingsSlinky.devextreme.devextremeStrings.outside
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartSeriesTypesCommonPolarChartSeriesLabel extends js.Object {
  /** Formats the point argument before it is displayed in the point label. To format the point value, use the format option. */
  var argumentFormat: js.UndefOr[format] = js.native
  /** Colors the point labels' background. The default color is inherited from the points. */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies border options for point labels. */
  var border: js.UndefOr[ColorDashStyle] = js.native
  /** Specifies connector options for series point labels. */
  var connector: js.UndefOr[ColorVisible] = js.native
  /** Specifies a callback function that returns the text to be displayed by point labels. */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.native
  /** Specifies font options for the text displayed in point labels. */
  var font: js.UndefOr[Font] = js.native
  /** Formats a value before it is displayed in a point label. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  /** Specifies a label position in bar-like series. */
  var position: js.UndefOr[inside | outside] = js.native
  /** Specifies the angle used to rotate point labels from their initial position. */
  var rotationAngle: js.UndefOr[Double] = js.native
  /** Specifies whether or not to show a label when the point has a zero value. */
  var showForZeroValues: js.UndefOr[Boolean] = js.native
  /** Specifies the visibility of point labels. */
  var visible: js.UndefOr[Boolean] = js.native
}

object dxPolarChartSeriesTypesCommonPolarChartSeriesLabel {
  @scala.inline
  def apply(): dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel]
  }
  @scala.inline
  implicit class dxPolarChartSeriesTypesCommonPolarChartSeriesLabelOps[Self <: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArgumentFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: ColorDashStyle): Self = {
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
    def withConnector(value: ColorVisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* pointInfo */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
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
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
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
    def withPosition(value: inside | outside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowForZeroValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForZeroValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowForZeroValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForZeroValues")(js.undefined)
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


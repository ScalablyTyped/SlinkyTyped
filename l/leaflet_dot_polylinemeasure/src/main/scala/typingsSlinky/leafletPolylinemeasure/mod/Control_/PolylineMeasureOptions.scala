package typingsSlinky.leafletPolylinemeasure.mod.Control_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineMeasureOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var clearControlClasses: js.UndefOr[js.Array[_]] = js.native
  var clearControlLabel: js.UndefOr[String] = js.native
  var clearControlTitle: js.UndefOr[String] = js.native
  var clearMeasurementsOnStop: js.UndefOr[Boolean] = js.native
  var currentCircle: js.UndefOr[js.Any] = js.native
  var cursor: js.UndefOr[String] = js.native
  var endCircle: js.UndefOr[js.Any] = js.native
  var fixedLine: js.UndefOr[js.Any] = js.native
  var intermedCircle: js.UndefOr[js.Any] = js.native
  var measureControlClasses: js.UndefOr[js.Array[_]] = js.native
  var measureControlLabel: js.UndefOr[String] = js.native
  var measureControlTitleOff: js.UndefOr[String] = js.native
  var measureControlTitleOn: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var showMeasurementsClearControl: js.UndefOr[Boolean] = js.native
  var showUnitControl: js.UndefOr[Boolean] = js.native
  var startCircle: js.UndefOr[js.Any] = js.native
  var tempLine: js.UndefOr[js.Any] = js.native
  var unit: js.UndefOr[String] = js.native
}

object PolylineMeasureOptions {
  @scala.inline
  def apply(): PolylineMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineMeasureOptions]
  }
  @scala.inline
  implicit class PolylineMeasureOptionsOps[Self <: PolylineMeasureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClearControlClasses(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearControlClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearControlClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearControlClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withClearControlLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearControlLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearControlLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearControlLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withClearControlTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearControlTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearControlTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearControlTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withClearMeasurementsOnStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMeasurementsOnStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearMeasurementsOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMeasurementsOnStop")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentCircle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
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
    def withEndCircle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIntermedCircle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermedCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntermedCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermedCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureControlClasses(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureControlClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureControlLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureControlLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureControlTitleOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlTitleOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureControlTitleOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlTitleOff")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureControlTitleOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlTitleOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureControlTitleOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureControlTitleOn")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
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
    def withShowMeasurementsClearControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeasurementsClearControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeasurementsClearControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeasurementsClearControl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowUnitControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUnitControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowUnitControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUnitControl")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCircle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withTempLine(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempLine")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartAxis extends Entity {
  // Represents the formatting of a chart object, which includes line and font formatting. Read-only.
  var format: js.UndefOr[WorkbookChartAxisFormat] = js.native
  // Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
  var majorGridlines: js.UndefOr[WorkbookChartGridlines] = js.native
  /**
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string. The returned
    * value is always a number.
    */
  var majorUnit: js.UndefOr[js.Any] = js.native
  /**
    * Represents the maximum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis
    * values). The returned value is always a number.
    */
  var maximum: js.UndefOr[js.Any] = js.native
  /**
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis
    * values). The returned value is always a number.
    */
  var minimum: js.UndefOr[js.Any] = js.native
  // Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
  var minorGridlines: js.UndefOr[WorkbookChartGridlines] = js.native
  /**
    * Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic
    * axis values). The returned value is always a number.
    */
  var minorUnit: js.UndefOr[js.Any] = js.native
  // Represents the axis title. Read-only.
  var title: js.UndefOr[WorkbookChartAxisTitle] = js.native
}

object WorkbookChartAxis {
  @scala.inline
  def apply(): WorkbookChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxis]
  }
  @scala.inline
  implicit class WorkbookChartAxisOps[Self <: WorkbookChartAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: WorkbookChartAxisFormat): Self = {
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
    def withMajorGridlines(value: WorkbookChartGridlines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorUnit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridlines(value: WorkbookChartGridlines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorUnit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: WorkbookChartAxisTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}


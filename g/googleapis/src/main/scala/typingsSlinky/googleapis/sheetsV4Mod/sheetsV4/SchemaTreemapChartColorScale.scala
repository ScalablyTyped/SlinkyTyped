package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color scale for a treemap chart.
  */
@js.native
trait SchemaTreemapChartColorScale extends js.Object {
  /**
    * The background color for cells with a color value greater than or equal
    * to maxValue. Defaults to #109618 if not specified.
    */
  var maxValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells with a color value at the midpoint between
    * minValue and maxValue. Defaults to #efe6dc if not specified.
    */
  var midValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells with a color value less than or equal to
    * minValue. Defaults to #dc3912 if not specified.
    */
  var minValueColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The background color for cells that have no color data associated with
    * them. Defaults to #000000 if not specified.
    */
  var noDataColor: js.UndefOr[SchemaColor] = js.native
}

object SchemaTreemapChartColorScale {
  @scala.inline
  def apply(): SchemaTreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTreemapChartColorScale]
  }
  @scala.inline
  implicit class SchemaTreemapChartColorScaleOps[Self <: SchemaTreemapChartColorScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxValueColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMidValueColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValueColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValueColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValueColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataColor")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicerSpec extends js.Object {
  /**
    * True if the filter should apply to pivot tables.
    * If not set, default to `True`.
    */
  var applyToPivotTables: js.UndefOr[Boolean] = js.native
  /** The background color of the slicer. */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * The background color of the slicer.
    * If background_color is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The column index in the data table on which the filter is applied to. */
  var columnIndex: js.UndefOr[Double] = js.native
  /** The data range of the slicer. */
  var dataRange: js.UndefOr[GridRange] = js.native
  /** The filtering criteria of the slicer. */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.native
  /**
    * The horizontal alignment of title in the slicer.
    * If unspecified, defaults to `LEFT`
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
  /** The text format of title in the slicer. */
  var textFormat: js.UndefOr[TextFormat] = js.native
  /** The title of the slicer. */
  var title: js.UndefOr[String] = js.native
}

object SlicerSpec {
  @scala.inline
  def apply(): SlicerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerSpec]
  }
  @scala.inline
  implicit class SlicerSpecOps[Self <: SlicerSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyToPivotTables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToPivotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyToPivotTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToPivotTables")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
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
    def withBackgroundColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterCriteria(value: FilterCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormat(value: TextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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


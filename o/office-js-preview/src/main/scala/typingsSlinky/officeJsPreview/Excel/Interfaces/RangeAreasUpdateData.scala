package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeAreas object, for use in `rangeAreas.set({ ... })`. */
@js.native
trait RangeAreasUpdateData extends js.Object {
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationUpdateData] = js.native
  /**
    *
    * Returns a rangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatUpdateData] = js.native
  /**
    *
    * Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[String] = js.native
}

object RangeAreasUpdateData {
  @scala.inline
  def apply(): RangeAreasUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasUpdateData]
  }
  @scala.inline
  implicit class RangeAreasUpdateDataOps[Self <: RangeAreasUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataValidation(value: DataValidationUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: RangeFormatUpdateData): Self = {
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
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}


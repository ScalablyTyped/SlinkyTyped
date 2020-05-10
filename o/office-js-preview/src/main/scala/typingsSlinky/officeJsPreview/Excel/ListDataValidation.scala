package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the List data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ListDataValidation extends js.Object {
  /**
    *
    * Displays the list in cell drop down or not, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var inCellDropDown: Boolean = js.native
  /**
    *
    * Source of the list for data validation
    When setting the value, it can be passed in as a Excel Range object, or a string that contains comma separated number, boolean or date.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: String | Range = js.native
}

object ListDataValidation {
  @scala.inline
  def apply(inCellDropDown: Boolean, source: String | Range): ListDataValidation = {
    val __obj = js.Dynamic.literal(inCellDropDown = inCellDropDown.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataValidation]
  }
  @scala.inline
  implicit class ListDataValidationOps[Self <: ListDataValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInCellDropDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCellDropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String | Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


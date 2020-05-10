package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Boolean
import typingsSlinky.officeJs.officeJsStrings.Double
import typingsSlinky.officeJs.officeJsStrings.Empty
import typingsSlinky.officeJs.officeJsStrings.Error
import typingsSlinky.officeJs.officeJsStrings.Integer
import typingsSlinky.officeJs.officeJsStrings.RichValue
import typingsSlinky.officeJs.officeJsStrings.String
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provide information about the detail of WorksheetChangedEvent/TableChangedEvent
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChangedEventDetail extends js.Object {
  /**
    *
    * Represents the value after changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueAfter: js.Any = js.native
  /**
    *
    * Represents the value before changed. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueBefore: js.Any = js.native
  /**
    *
    * Represents the type of value after changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue = js.native
  /**
    *
    * Represents the type of value before changed
    *
    * [Api set: ExcelApi 1.9]
    */
  var valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue = js.native
}

object ChangedEventDetail {
  @scala.inline
  def apply(
    valueAfter: js.Any,
    valueBefore: js.Any,
    valueTypeAfter: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue,
    valueTypeBefore: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue
  ): ChangedEventDetail = {
    val __obj = js.Dynamic.literal(valueAfter = valueAfter.asInstanceOf[js.Any], valueBefore = valueBefore.asInstanceOf[js.Any], valueTypeAfter = valueTypeAfter.asInstanceOf[js.Any], valueTypeBefore = valueTypeBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedEventDetail]
  }
  @scala.inline
  implicit class ChangedEventDetailOps[Self <: ChangedEventDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueAfter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueTypeAfter(value: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTypeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueTypeBefore(value: RangeValueType | Unknown_ | Empty | String | Integer | Double | Boolean | Error | RichValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTypeBefore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


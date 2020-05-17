package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * information about a cell positioned within the result area of a DataPilot table.
  *
  * {@link DataPilotTableResultData} contains information about a particular cell positioned within the result area of a DataPilot table.
  * @see com.sun.star.sheet.DataPilotTablePositionData
  * @see com.sun.star.sheet.DataPilotTablePositionType
  * @see com.sun.star.sheet.DataPilotFieldFilter
  * @see com.sun.star.sheet.DataResult
  * @since OOo 3.0
  */
@js.native
trait DataPilotTableResultData extends js.Object {
  /**
    * This is a 0-based index that specifies which data field the data displayed in the cell is for; the value of 0 means the cell is for the first data
    * field, 1 for the second, and so on.
    */
  var DataFieldIndex: Double = js.native
  /**
    * This is a set of filter criteria that can be used to re-create those data rows that contribute to the value shown in the cell.
    * @see com.sun.star.sheet.DataPilotFieldFilter
    */
  var FieldFilters: SafeArray[DataPilotFieldFilter] = js.native
  /**
    * more information about the result contained in the {@link DataResult} type.
    * @see com.sun.star.sheet.DataResult
    */
  var Result: DataResult = js.native
}

object DataPilotTableResultData {
  @scala.inline
  def apply(DataFieldIndex: Double, FieldFilters: SafeArray[DataPilotFieldFilter], Result: DataResult): DataPilotTableResultData = {
    val __obj = js.Dynamic.literal(DataFieldIndex = DataFieldIndex.asInstanceOf[js.Any], FieldFilters = FieldFilters.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotTableResultData]
  }
  @scala.inline
  implicit class DataPilotTableResultDataOps[Self <: DataPilotTableResultData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFieldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFieldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldFilters(value: SafeArray[DataPilotFieldFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: DataResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


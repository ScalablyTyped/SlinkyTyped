package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes how to sort a single {@link DataPilotField} */
@js.native
trait DataPilotFieldSortInfo extends js.Object {
  /** contains the data field to sort by if the Mode is DATA */
  var Field: String = js.native
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var IsAscending: Boolean = js.native
  /**
    * contains the sort mode
    * @see com.sun.star.sheet.DataPilotFieldSortMode
    */
  var Mode: Double = js.native
}

object DataPilotFieldSortInfo {
  @scala.inline
  def apply(Field: String, IsAscending: Boolean, Mode: Double): DataPilotFieldSortInfo = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], IsAscending = IsAscending.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldSortInfo]
  }
  @scala.inline
  implicit class DataPilotFieldSortInfoOps[Self <: DataPilotFieldSortInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


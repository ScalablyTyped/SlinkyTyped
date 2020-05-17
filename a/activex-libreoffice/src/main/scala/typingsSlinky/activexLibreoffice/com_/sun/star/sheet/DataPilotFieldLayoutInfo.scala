package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the layout information of a {@link DataPilotField} . */
@js.native
trait DataPilotFieldLayoutInfo extends js.Object {
  /** If `TRUE` , an empty row is inserted in the {@link DataPilotTable} result table after the data (including the subtotals) for each item of the field. */
  var AddEmptyLines: Boolean = js.native
  /**
    * specifies the layout mode.
    * @see com.sun.star.sheet.DataPilotFieldLayoutMode
    */
  var LayoutMode: Double = js.native
}

object DataPilotFieldLayoutInfo {
  @scala.inline
  def apply(AddEmptyLines: Boolean, LayoutMode: Double): DataPilotFieldLayoutInfo = {
    val __obj = js.Dynamic.literal(AddEmptyLines = AddEmptyLines.asInstanceOf[js.Any], LayoutMode = LayoutMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldLayoutInfo]
  }
  @scala.inline
  implicit class DataPilotFieldLayoutInfoOps[Self <: DataPilotFieldLayoutInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEmptyLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddEmptyLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.phosphorDatagrid.datamodelMod.DataModel

import typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`cells-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when cells are changed in-place.
  */
@js.native
trait ICellsChangedArgs extends ChangedArgs {
  /**
    * The column index of the first modified cell.
    */
  val columnIndex: Double = js.native
  /**
    * The number of columns in the modified cell range.
    */
  val columnSpan: Double = js.native
  /**
    * The region which contains the modified cells.
    */
  val region: CellRegion = js.native
  /**
    * The row index of the first modified cell.
    */
  val rowIndex: Double = js.native
  /**
    * The number of rows in the modified cell range.
    */
  val rowSpan: Double = js.native
  /**
    * The discriminated type of the args object.
    */
  val `type`: `cells-changed` = js.native
}

object ICellsChangedArgs {
  @scala.inline
  def apply(
    columnIndex: Double,
    columnSpan: Double,
    region: CellRegion,
    rowIndex: Double,
    rowSpan: Double,
    `type`: `cells-changed`
  ): ICellsChangedArgs = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellsChangedArgs]
  }
  @scala.inline
  implicit class ICellsChangedArgsOps[Self <: ICellsChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: CellRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `cells-changed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer

import typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.CellRegion
import typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the configuration data for a cell.
  */
@js.native
trait ICellConfig extends js.Object {
  /**
    * The column index of the cell.
    */
  val column: Double = js.native
  /**
    * The height of the cell rectangle, in viewport pixels.
    */
  val height: Double = js.native
  /**
    * The metadata for the column.
    */
  val metadata: Metadata = js.native
  /**
    * The region for the cell.
    */
  val region: CellRegion = js.native
  /**
    * The row index of the cell.
    */
  val row: Double = js.native
  /**
    * The data value for the cell.
    */
  val value: js.Any = js.native
  /**
    * The width of the cell rectangle, in viewport pixels.
    */
  val width: Double = js.native
  /**
    * The X position of the cell rectangle, in viewport coordinates.
    */
  val x: Double = js.native
  /**
    * The Y position of the cell rectangle, in viewport coordinates.
    */
  val y: Double = js.native
}

object ICellConfig {
  @scala.inline
  def apply(
    column: Double,
    height: Double,
    metadata: Metadata,
    region: CellRegion,
    row: Double,
    value: js.Any,
    width: Double,
    x: Double,
    y: Double
  ): ICellConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellConfig]
  }
  @scala.inline
  implicit class ICellConfigOps[Self <: ICellConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: CellRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.phosphorDatagrid.cellrendererMod.CellRenderer

import typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.CellRegion
import typingsSlinky.phosphorDatagrid.datamodelMod.DataModel.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the configuration data for a column.
  */
@js.native
trait IColumnConfig extends js.Object {
  /**
    * The column index.
    */
  val column: Double = js.native
  /**
    * The metadata for the column.
    */
  val metadata: Metadata = js.native
  /**
    * The region for the column.
    */
  val region: CellRegion = js.native
  /**
    * The width of the column, in viewport pixels.
    */
  val width: Double = js.native
  /**
    * The X position of the column, in viewport coordinates.
    */
  val x: Double = js.native
}

object IColumnConfig {
  @scala.inline
  def apply(column: Double, metadata: Metadata, region: CellRegion, width: Double, x: Double): IColumnConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnConfig]
  }
  @scala.inline
  implicit class IColumnConfigOps[Self <: IColumnConfig] (val x: Self) extends AnyVal {
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
  }
  
}


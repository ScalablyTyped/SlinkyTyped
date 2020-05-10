package typingsSlinky.qlikVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQRow extends js.Object {
  /**
    * All cells, in the order they are defined in the properties.
    */
  var cells: js.Array[_] = js.native
  /**
    * Dimension cells.
    */
  var dimensions: js.Array[IQDimensionCell] = js.native
  /**
    * Measure cells.
    */
  var measures: js.Array[IQMeasureCell] = js.native
}

object IQRow {
  @scala.inline
  def apply(cells: js.Array[_], dimensions: js.Array[IQDimensionCell], measures: js.Array[IQMeasureCell]): IQRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQRow]
  }
  @scala.inline
  implicit class IQRowOps[Self <: IQRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: js.Array[IQDimensionCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasures(value: js.Array[IQMeasureCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


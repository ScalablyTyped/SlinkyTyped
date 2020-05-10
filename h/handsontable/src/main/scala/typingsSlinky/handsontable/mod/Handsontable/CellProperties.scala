package typingsSlinky.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rendered cell object with computed properties.
  */
@js.native
trait CellProperties extends CellMeta {
  var col: Double = js.native
  var instance: typingsSlinky.handsontable.mod.Handsontable = js.native
  var prop: String | Double = js.native
  var row: Double = js.native
  var visualCol: Double = js.native
  var visualRow: Double = js.native
}

object CellProperties {
  @scala.inline
  def apply(
    col: Double,
    instance: typingsSlinky.handsontable.mod.Handsontable,
    prop: String | Double,
    row: Double,
    visualCol: Double,
    visualRow: Double
  ): CellProperties = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], visualCol = visualCol.asInstanceOf[js.Any], visualRow = visualRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProperties]
  }
  @scala.inline
  implicit class CellPropertiesOps[Self <: CellProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: typingsSlinky.handsontable.mod.Handsontable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProp(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


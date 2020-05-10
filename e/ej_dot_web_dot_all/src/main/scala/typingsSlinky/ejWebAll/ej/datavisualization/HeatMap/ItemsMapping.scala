package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsMapping extends js.Object {
  /** Specifies the property and display value of the column.
    * @Default {null}
    */
  var column: js.UndefOr[ItemsMappingColumn] = js.native
  /** Specifies the property and display value of the collection of column.
    * @Default {[]}
    */
  var columnMapping: js.UndefOr[js.Array[_]] = js.native
  /** Column settings for the individual heat map column.
    * @Default {null}
    */
  var columnStyle: js.UndefOr[ItemsMappingColumnStyle] = js.native
  /** Specifies the property and display value of the header.
    * @Default {null}
    */
  var headerMapping: js.UndefOr[ItemsMappingHeaderMapping] = js.native
  /** Specifies the row property and display value of the heat map.
    * @Default {null}
    */
  var row: js.UndefOr[ItemsMappingRow] = js.native
  /** Specifies the property and display value of the column value.
    * @Default {null}
    */
  var value: js.UndefOr[ItemsMappingValue] = js.native
}

object ItemsMapping {
  @scala.inline
  def apply(): ItemsMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsMapping]
  }
  @scala.inline
  implicit class ItemsMappingOps[Self <: ItemsMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: ItemsMappingColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnMapping(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnStyle(value: ItemsMappingColumnStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderMapping(value: ItemsMappingHeaderMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: ItemsMappingRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ItemsMappingValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}


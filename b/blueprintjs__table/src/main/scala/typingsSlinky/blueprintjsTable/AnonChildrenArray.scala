package typingsSlinky.blueprintjsTable

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildrenArray extends js.Object {
  var childrenArray: js.Array[ReactElement] = js.native
  var columnIdToIndex: StringDictionary[Double] = js.native
  var columnWidths: js.Array[Double] = js.native
  var focusedCell: IFocusedCellCoordinates = js.native
  var numFrozenColumnsClamped: Double = js.native
  var numFrozenRowsClamped: Double = js.native
  var rowHeights: js.Array[Double] = js.native
  var selectedRegions: js.Array[IRegion] = js.native
}

object AnonChildrenArray {
  @scala.inline
  def apply(
    childrenArray: js.Array[ReactElement],
    columnIdToIndex: StringDictionary[Double],
    columnWidths: js.Array[Double],
    focusedCell: IFocusedCellCoordinates,
    numFrozenColumnsClamped: Double,
    numFrozenRowsClamped: Double,
    rowHeights: js.Array[Double],
    selectedRegions: js.Array[IRegion]
  ): AnonChildrenArray = {
    val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], focusedCell = focusedCell.asInstanceOf[js.Any], numFrozenColumnsClamped = numFrozenColumnsClamped.asInstanceOf[js.Any], numFrozenRowsClamped = numFrozenRowsClamped.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenArray]
  }
  @scala.inline
  implicit class AnonChildrenArrayOps[Self <: AnonChildrenArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenArray(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIdToIndex(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIdToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedCell(value: IFocusedCellCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumFrozenColumnsClamped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenColumnsClamped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumFrozenRowsClamped(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFrozenRowsClamped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeights(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedRegions(value: js.Array[IRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRegions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


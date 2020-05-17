package typingsSlinky.reactVirtualized.esGridMod

import typingsSlinky.reactVirtualized.anon.ContainerSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSizeAndPositionManager extends js.Object {
  def areOffsetsAdjusted(): Boolean = js.native
  def configure(hasCellCountEstimatedCellSize: ConfigureParams): Unit = js.native
  def getCellCount(): Double = js.native
  def getEstimatedCellSize(): Double = js.native
  def getLastMeasuredIndex(): Double = js.native
  def getOffsetAdjustment(hasContainerSizeOffset: ContainerSizeAndOffset): Double = js.native
  /**
    * This method returns the size and position for the cell at the specified index.
    * It just-in-time calculates (or used cached values) for cells leading up to the index.
    */
  def getSizeAndPositionOfCell(index: Double): SizeAndPositionData = js.native
  def getSizeAndPositionOfLastMeasuredCell(): SizeAndPositionData = js.native
  /**
    * Total size of all cells being measured.
    * This value will be completedly estimated initially.
    * As cells as measured the estimate will be updated.
    */
  def getTotalSize(): Double = js.native
  /**
    * Determines a new offset that ensures a certain cell is visible, given the current offset.
    * If the cell is already visible then the current offset will be returned.
    * If the current offset is too great or small, it will be adjusted just enough to ensure the specified index is visible.
    *
    * @param align Desired alignment within container; one of "auto" (default), "start", or "end"
    * @param containerSize Size (width or height) of the container viewport
    * @param currentOffset Container's current (x or y) offset
    * @param totalSize Total size (width or height) of all cells
    * @return Offset to use to ensure the specified cell is visible
    */
  def getUpdatedOffsetForIndex(params: ContainerSize): Double = js.native
  def getVisibleCellRange(params: GetVisibleCellRangeParams): VisibleCellRange = js.native
  /**
    * Clear all cached values for cells after the specified index.
    * This method should be called for any cell that has changed its size.
    * It will not immediately perform any calculations; they'll be performed the next time getSizeAndPositionOfCell() is called.
    */
  def resetCell(index: Double): Unit = js.native
}

object CellSizeAndPositionManager {
  @scala.inline
  def apply(
    areOffsetsAdjusted: () => Boolean,
    configure: ConfigureParams => Unit,
    getCellCount: () => Double,
    getEstimatedCellSize: () => Double,
    getLastMeasuredIndex: () => Double,
    getOffsetAdjustment: ContainerSizeAndOffset => Double,
    getSizeAndPositionOfCell: Double => SizeAndPositionData,
    getSizeAndPositionOfLastMeasuredCell: () => SizeAndPositionData,
    getTotalSize: () => Double,
    getUpdatedOffsetForIndex: ContainerSize => Double,
    getVisibleCellRange: GetVisibleCellRangeParams => VisibleCellRange,
    resetCell: Double => Unit
  ): CellSizeAndPositionManager = {
    val __obj = js.Dynamic.literal(areOffsetsAdjusted = js.Any.fromFunction0(areOffsetsAdjusted), configure = js.Any.fromFunction1(configure), getCellCount = js.Any.fromFunction0(getCellCount), getEstimatedCellSize = js.Any.fromFunction0(getEstimatedCellSize), getLastMeasuredIndex = js.Any.fromFunction0(getLastMeasuredIndex), getOffsetAdjustment = js.Any.fromFunction1(getOffsetAdjustment), getSizeAndPositionOfCell = js.Any.fromFunction1(getSizeAndPositionOfCell), getSizeAndPositionOfLastMeasuredCell = js.Any.fromFunction0(getSizeAndPositionOfLastMeasuredCell), getTotalSize = js.Any.fromFunction0(getTotalSize), getUpdatedOffsetForIndex = js.Any.fromFunction1(getUpdatedOffsetForIndex), getVisibleCellRange = js.Any.fromFunction1(getVisibleCellRange), resetCell = js.Any.fromFunction1(resetCell))
    __obj.asInstanceOf[CellSizeAndPositionManager]
  }
  @scala.inline
  implicit class CellSizeAndPositionManagerOps[Self <: CellSizeAndPositionManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreOffsetsAdjusted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areOffsetsAdjusted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConfigure(value: ConfigureParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCellCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEstimatedCellSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEstimatedCellSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastMeasuredIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastMeasuredIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOffsetAdjustment(value: ContainerSizeAndOffset => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetAdjustment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSizeAndPositionOfCell(value: Double => SizeAndPositionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeAndPositionOfCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSizeAndPositionOfLastMeasuredCell(value: () => SizeAndPositionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSizeAndPositionOfLastMeasuredCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTotalSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUpdatedOffsetForIndex(value: ContainerSize => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdatedOffsetForIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVisibleCellRange(value: GetVisibleCellRangeParams => VisibleCellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleCellRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetCell(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCell")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import typingsSlinky.handsontable.mod.Handsontable.plugins.MergeCells
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutofillCalculations extends js.Object {
  var currentFillData: js.Object = js.native
  var mergedCellsCollection: MergedCellsCollection = js.native
  var plugin: MergeCells = js.native
  def correctSelectionAreaSize(selectionArea: js.Array[Double]): Unit = js.native
  def dragAreaOverlapsCollections(baseArea: js.Array[Double], fullArea: js.Array[Double], direction: String): Boolean = js.native
  def getDirection(selectionArea: js.Array[Double], finalArea: js.Array[Double]): String = js.native
  def recreateAfterDataPopulation(changes: js.Array[_]): Unit = js.native
  def snapDragArea(
    baseArea: js.Array[Double],
    dragArea: js.Array[Double],
    dragDirection: String,
    foundMergedCells: js.Array[MergedCellCoords]
  ): js.Array[Double] = js.native
}

object AutofillCalculations {
  @scala.inline
  def apply(
    correctSelectionAreaSize: js.Array[Double] => Unit,
    currentFillData: js.Object,
    dragAreaOverlapsCollections: (js.Array[Double], js.Array[Double], String) => Boolean,
    getDirection: (js.Array[Double], js.Array[Double]) => String,
    mergedCellsCollection: MergedCellsCollection,
    plugin: MergeCells,
    recreateAfterDataPopulation: js.Array[_] => Unit,
    snapDragArea: (js.Array[Double], js.Array[Double], String, js.Array[MergedCellCoords]) => js.Array[Double]
  ): AutofillCalculations = {
    val __obj = js.Dynamic.literal(correctSelectionAreaSize = js.Any.fromFunction1(correctSelectionAreaSize), currentFillData = currentFillData.asInstanceOf[js.Any], dragAreaOverlapsCollections = js.Any.fromFunction3(dragAreaOverlapsCollections), getDirection = js.Any.fromFunction2(getDirection), mergedCellsCollection = mergedCellsCollection.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], recreateAfterDataPopulation = js.Any.fromFunction1(recreateAfterDataPopulation), snapDragArea = js.Any.fromFunction4(snapDragArea))
    __obj.asInstanceOf[AutofillCalculations]
  }
  @scala.inline
  implicit class AutofillCalculationsOps[Self <: AutofillCalculations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrectSelectionAreaSize(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctSelectionAreaSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentFillData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFillData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragAreaOverlapsCollections(value: (js.Array[Double], js.Array[Double], String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAreaOverlapsCollections")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetDirection(value: (js.Array[Double], js.Array[Double]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMergedCellsCollection(value: MergedCellsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedCellsCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: MergeCells): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecreateAfterDataPopulation(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreateAfterDataPopulation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSnapDragArea(
      value: (js.Array[Double], js.Array[Double], String, js.Array[MergedCellCoords]) => js.Array[Double]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDragArea")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}


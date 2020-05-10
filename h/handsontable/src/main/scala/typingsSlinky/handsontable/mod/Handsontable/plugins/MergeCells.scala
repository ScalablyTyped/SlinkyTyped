package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.AutofillCalculations
import typingsSlinky.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.MergedCellsCollection
import typingsSlinky.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.SelectionCalculations
import typingsSlinky.handsontable.mod.Handsontable.wot.CellRange
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeCells extends Base {
  var autofillCalculations: AutofillCalculations = js.native
  var mergedCellsCollection: MergedCellsCollection = js.native
  var selectionCalculations: SelectionCalculations = js.native
  def clearCollections(): Unit = js.native
  def merge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit = js.native
  def mergeSelection(cellRange: CellRange): Unit = js.native
  def unmerge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit = js.native
}

object MergeCells {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    autofillCalculations: AutofillCalculations,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearCollections: () => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    merge: (Double, Double, Double, Double) => Unit,
    mergeSelection: CellRange => Unit,
    mergedCellsCollection: MergedCellsCollection,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    selectionCalculations: SelectionCalculations,
    t: RecordTranslator,
    unmerge: (Double, Double, Double, Double) => Unit,
    updatePlugin: () => Unit
  ): MergeCells = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autofillCalculations = autofillCalculations.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearCollections = js.Any.fromFunction0(clearCollections), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], merge = js.Any.fromFunction4(merge), mergeSelection = js.Any.fromFunction1(mergeSelection), mergedCellsCollection = mergedCellsCollection.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), selectionCalculations = selectionCalculations.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], unmerge = js.Any.fromFunction4(unmerge), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[MergeCells]
  }
  @scala.inline
  implicit class MergeCellsOps[Self <: MergeCells] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutofillCalculations(value: AutofillCalculations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofillCalculations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearCollections(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCollections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMerge(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMergeSelection(value: CellRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMergedCellsCollection(value: MergedCellsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedCellsCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionCalculations(value: SelectionCalculations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionCalculations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmerge(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmerge")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}


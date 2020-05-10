package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formulas extends Base {
  var dataProvider: DataProvider = js.native
  var eventManager: EventManager = js.native
  var sheet: Sheet = js.native
  var undoRedoSnapshot: UndoRedoSnapshot = js.native
  def getCellValue(row: Double, column: Double): js.Any = js.native
  def getVariable(name: String): js.Any = js.native
  def hasComputedCellValue(row: Double, column: Double): Boolean = js.native
  def recalculate(): Unit = js.native
  def recalculateFull(): Unit = js.native
  def recalculateOptimized(): Unit = js.native
  def setVariable(name: String, value: js.Any): Unit = js.native
}

object Formulas {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    dataProvider: DataProvider,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    getCellValue: (Double, Double) => js.Any,
    getVariable: String => js.Any,
    hasComputedCellValue: (Double, Double) => Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    recalculate: () => Unit,
    recalculateFull: () => Unit,
    recalculateOptimized: () => Unit,
    removeHooks: String => Unit,
    setVariable: (String, js.Any) => Unit,
    sheet: Sheet,
    t: RecordTranslator,
    undoRedoSnapshot: UndoRedoSnapshot,
    updatePlugin: () => Unit
  ): Formulas = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), dataProvider = dataProvider.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getCellValue = js.Any.fromFunction2(getCellValue), getVariable = js.Any.fromFunction1(getVariable), hasComputedCellValue = js.Any.fromFunction2(hasComputedCellValue), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], recalculate = js.Any.fromFunction0(recalculate), recalculateFull = js.Any.fromFunction0(recalculateFull), recalculateOptimized = js.Any.fromFunction0(recalculateOptimized), removeHooks = js.Any.fromFunction1(removeHooks), setVariable = js.Any.fromFunction2(setVariable), sheet = sheet.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], undoRedoSnapshot = undoRedoSnapshot.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[Formulas]
  }
  @scala.inline
  implicit class FormulasOps[Self <: Formulas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataProvider(value: DataProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCellValue(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetVariable(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasComputedCellValue(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasComputedCellValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRecalculate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecalculateFull(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculateFull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecalculateOptimized(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculateOptimized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetVariable(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVariable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSheet(value: Sheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndoRedoSnapshot(value: UndoRedoSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoRedoSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


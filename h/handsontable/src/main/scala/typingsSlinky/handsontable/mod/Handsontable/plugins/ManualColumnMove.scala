package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod.Handsontable.plugins.moveUI.BacklightUI
import typingsSlinky.handsontable.mod.Handsontable.plugins.moveUI.GuidelineUI
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualColumnMove extends Base {
  var backlight: BacklightUI = js.native
  var columnsMapper: MoveColumnsMapper = js.native
  var eventManager: EventManager = js.native
  var guideline: GuidelineUI = js.native
  var removedColumns: js.Array[_] = js.native
  def moveColumn(column: Double, target: Double): Unit = js.native
  def moveColumns(columns: js.Array[Double], target: Double): Unit = js.native
  def persistentStateLoad(): Unit = js.native
  def persistentStateSave(): Unit = js.native
}

object ManualColumnMove {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    backlight: BacklightUI,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    columnsMapper: MoveColumnsMapper,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    guideline: GuidelineUI,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    moveColumn: (Double, Double) => Unit,
    moveColumns: (js.Array[Double], Double) => Unit,
    persistentStateLoad: () => Unit,
    persistentStateSave: () => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removedColumns: js.Array[_],
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ManualColumnMove = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), columnsMapper = columnsMapper.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], guideline = guideline.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], moveColumn = js.Any.fromFunction2(moveColumn), moveColumns = js.Any.fromFunction2(moveColumns), persistentStateLoad = js.Any.fromFunction0(persistentStateLoad), persistentStateSave = js.Any.fromFunction0(persistentStateSave), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), removedColumns = removedColumns.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualColumnMove]
  }
  @scala.inline
  implicit class ManualColumnMoveOps[Self <: ManualColumnMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacklight(value: BacklightUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsMapper(value: MoveColumnsMapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsMapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuideline(value: GuidelineUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guideline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveColumn(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveColumn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveColumns(value: (js.Array[Double], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveColumns")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPersistentStateLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPersistentStateSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentStateSave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemovedColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedColumns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


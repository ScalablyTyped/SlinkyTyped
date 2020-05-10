package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod.Handsontable.wot.CellCoords
import typingsSlinky.handsontable.mod.Handsontable.wot.CellRange
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleSelectionHandles extends Base {
  var dragged: js.Array[_] = js.native
  var eventManager: EventManager = js.native
  var lastSetCell: HTMLElement | Unit = js.native
  def getCurrentRangeCoords(
    selectedRange: CellRange,
    currentTouch: CellCoords,
    touchStartDirection: String,
    currentDirection: String,
    draggedHandle: String
  ): js.Object = js.native
  def isDragged(): Boolean = js.native
}

object MultipleSelectionHandles {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    dragged: js.Array[_],
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    getCurrentRangeCoords: (CellRange, CellCoords, String, String, String) => js.Object,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isDragged: () => Boolean,
    isPluginsReady: Boolean,
    lastSetCell: HTMLElement | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): MultipleSelectionHandles = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), dragged = dragged.asInstanceOf[js.Any], enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getCurrentRangeCoords = js.Any.fromFunction5(getCurrentRangeCoords), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isDragged = js.Any.fromFunction0(isDragged), isPluginsReady = isPluginsReady.asInstanceOf[js.Any], lastSetCell = lastSetCell.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[MultipleSelectionHandles]
  }
  @scala.inline
  implicit class MultipleSelectionHandlesOps[Self <: MultipleSelectionHandles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragged(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCurrentRangeCoords(value: (CellRange, CellCoords, String, String, String) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentRangeCoords")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withIsDragged(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastSetCellHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSetCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSetCell(value: HTMLElement | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSetCell")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


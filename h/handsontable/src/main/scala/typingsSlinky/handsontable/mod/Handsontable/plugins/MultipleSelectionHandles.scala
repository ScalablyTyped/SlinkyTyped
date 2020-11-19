package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod.Handsontable.wot.CellCoords
import typingsSlinky.handsontable.mod.Handsontable.wot.CellRange
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleSelectionHandles extends Base {
  
  var dragged: js.Array[_] = js.native
  
  var eventManager: EventManager = js.native
  
  def getCurrentRangeCoords(
    selectedRange: CellRange,
    currentTouch: CellCoords,
    touchStartDirection: String,
    currentDirection: String,
    draggedHandle: String
  ): js.Object = js.native
  
  def isDragged(): Boolean = js.native
  
  var lastSetCell: HTMLElement | Unit = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDraggedVarargs(value: js.Any*): Self = this.set("dragged", js.Array(value :_*))
    
    @scala.inline
    def setDragged(value: js.Array[_]): Self = this.set("dragged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentRangeCoords(value: (CellRange, CellCoords, String, String, String) => js.Object): Self = this.set("getCurrentRangeCoords", js.Any.fromFunction5(value))
    
    @scala.inline
    def setIsDragged(value: () => Boolean): Self = this.set("isDragged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastSetCellHTMLElement(value: HTMLElement): Self = this.set("lastSetCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSetCell(value: HTMLElement | Unit): Self = this.set("lastSetCell", value.asInstanceOf[js.Any])
  }
}

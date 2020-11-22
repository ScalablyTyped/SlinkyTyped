package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autofill extends Base {
  
  var addingStarted: Boolean = js.native
  
  var autoInsertRow: Boolean = js.native
  
  var directions: js.Array[String] = js.native
  
  var eventManager: EventManager = js.native
  
  var handleDraggedCells: Double = js.native
  
  var mouseDownOnCellCorner: Boolean = js.native
  
  var mouseDragOutside: Boolean = js.native
}
object Autofill {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    addingStarted: Boolean,
    autoInsertRow: Boolean,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    directions: js.Array[String],
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    handleDraggedCells: Double,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    mouseDownOnCellCorner: Boolean,
    mouseDragOutside: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    updatePlugin: () => Unit
  ): Autofill = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), addingStarted = addingStarted.asInstanceOf[js.Any], autoInsertRow = autoInsertRow.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), directions = directions.asInstanceOf[js.Any], disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], handleDraggedCells = handleDraggedCells.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], mouseDownOnCellCorner = mouseDownOnCellCorner.asInstanceOf[js.Any], mouseDragOutside = mouseDragOutside.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[Autofill]
  }
  
  @scala.inline
  implicit class AutofillOps[Self <: Autofill] (val x: Self) extends AnyVal {
    
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
    def setAddingStarted(value: Boolean): Self = this.set("addingStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInsertRow(value: Boolean): Self = this.set("autoInsertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsVarargs(value: String*): Self = this.set("directions", js.Array(value :_*))
    
    @scala.inline
    def setDirections(value: js.Array[String]): Self = this.set("directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleDraggedCells(value: Double): Self = this.set("handleDraggedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseDownOnCellCorner(value: Boolean): Self = this.set("mouseDownOnCellCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseDragOutside(value: Boolean): Self = this.set("mouseDragOutside", value.asInstanceOf[js.Any])
  }
}

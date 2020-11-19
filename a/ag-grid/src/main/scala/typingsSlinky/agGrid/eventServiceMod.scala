package typingsSlinky.agGrid

import typingsSlinky.agGrid.eventsMod.AgEvent
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.iEventEmitterMod.IEventEmitter
import typingsSlinky.agGrid.loggerMod.LoggerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/eventService", JSImport.Namespace)
@js.native
object eventServiceMod extends js.Object {
  
  @js.native
  class EventService () extends IEventEmitter {
    
    def addGlobalListener(listener: js.Function): Unit = js.native
    def addGlobalListener(listener: js.Function, async: Boolean): Unit = js.native
    
    def addModalPriorityEventListener(eventType: String, listener: js.Function): Unit = js.native
    def addModalPriorityEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
    
    var allAsyncListeners: js.Any = js.native
    
    var allSyncListeners: js.Any = js.native
    
    var asyncFunctionsQueue: js.Any = js.native
    
    /* private */ def dispatchAsync(func: js.Any): js.Any = js.native
    
    def dispatchEvent(event: AgEvent): Unit = js.native
    
    /* private */ def dispatchToListeners(event: js.Any, async: js.Any): js.Any = js.native
    
    /* private */ def flushAsyncQueue(): js.Any = js.native
    
    /* private */ def getListenerList(eventType: js.Any, async: js.Any): js.Any = js.native
    
    var globalAsyncListeners: js.Any = js.native
    
    var globalSyncListeners: js.Any = js.native
    
    var logger: js.Any = js.native
    
    def removeGlobalListener(listener: js.Function): Unit = js.native
    def removeGlobalListener(listener: js.Function, async: Boolean): Unit = js.native
    
    var scheduled: js.Any = js.native
    
    def setBeans(loggerFactory: LoggerFactory, gridOptionsWrapper: GridOptionsWrapper): Unit = js.native
    def setBeans(
      loggerFactory: LoggerFactory,
      gridOptionsWrapper: GridOptionsWrapper,
      globalEventListener: js.Function
    ): Unit = js.native
  }
  /* static members */
  @js.native
  object EventService extends js.Object {
    
    var PRIORITY: js.Any = js.native
  }
}

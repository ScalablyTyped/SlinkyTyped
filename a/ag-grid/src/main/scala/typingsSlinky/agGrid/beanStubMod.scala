package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.agGrid.eventsMod.AgEvent
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.iEventEmitterMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beanStubMod {
  
  @JSImport("ag-grid/dist/lib/context/beanStub", "BeanStub")
  @js.native
  class BeanStub () extends IEventEmitter {
    
    def addDestroyFunc(func: js.Function0[Unit]): Unit = js.native
    
    def addDestroyableEventListener(eElement: HTMLElement, event: String, listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def addDestroyableEventListener(eElement: Window, event: String, listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def addDestroyableEventListener(
      eElement: GridOptionsWrapper,
      event: String,
      listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    def addDestroyableEventListener(
      eElement: IEventEmitter,
      event: String,
      listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var destroyFunctions: js.Any = js.native
    
    var destroyed: js.Any = js.native
    
    def dispatchEvent[T /* <: AgEvent */](event: T): Unit = js.native
    
    def dispatchEventAsync(event: AgEvent): Unit = js.native
    
    def isAlive(): Boolean = js.native
    
    var localEventService: js.Any = js.native
  }
  /* static members */
  object BeanStub {
    
    @JSImport("ag-grid/dist/lib/context/beanStub", "BeanStub")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/context/beanStub", "BeanStub.EVENT_DESTROYED")
    @js.native
    def EVENT_DESTROYED: String = js.native
    @scala.inline
    def EVENT_DESTROYED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DESTROYED")(x.asInstanceOf[js.Any])
  }
}

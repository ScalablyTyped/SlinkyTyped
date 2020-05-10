package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.eventsMod.AgEvent
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.iEventEmitterMod.IEventEmitter
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/context/beanStub", JSImport.Namespace)
@js.native
object beanStubMod extends js.Object {
  @js.native
  class BeanStub () extends IEventEmitter {
    var destroyFunctions: js.Any = js.native
    var destroyed: js.Any = js.native
    var localEventService: js.Any = js.native
    def addDestroyFunc(func: js.Function0[Unit]): Unit = js.native
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
    def addDestroyableEventListener(eElement: HTMLElement, event: String, listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def addDestroyableEventListener(eElement: Window_, event: String, listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]): Unit = js.native
    def destroy(): Unit = js.native
    def dispatchEvent[T /* <: AgEvent */](event: T): Unit = js.native
    def dispatchEventAsync(event: AgEvent): Unit = js.native
    def isAlive(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object BeanStub extends js.Object {
    var EVENT_DESTROYED: String = js.native
  }
  
}


package typingsSlinky.mendixmodelsdk

import typingsSlinky.eventsource.mod.^
import typingsSlinky.mendixmodelsdk.anon.HandleError
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typingsSlinky.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent
import typingsSlinky.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workingCopyEventReceiverMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/working-copy-events/WorkingCopyEventReceiver", "WorkingCopyEventReceiver")
  @js.native
  class WorkingCopyEventReceiver protected () extends StObject {
    def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
    
    var buildResultEventEmitter: js.Any = js.native
    
    var client: js.Any = js.native
    
    var errorHandler: js.Any = js.native
    
    var eventSource: ^ | Null = js.native
    
    def isRunning: Boolean = js.native
    
    def onBuildResultEvent(callback: js.Function1[/* buildResultEvent */ IBuildResultEvent, Unit]): Unit = js.native
    
    def onWorkingCopyDataEvent(callback: js.Function1[/* workingCopyDataEvent */ IWorkingCopyDataEvent, Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    var workingCopyDataEventEmitter: js.Any = js.native
    
    var workingCopyId: js.Any = js.native
  }
}

package typingsSlinky.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerErrorReportedEvent extends StObject {
  
  var errorMessage: ServiceWorkerErrorMessage = js.native
}
object WorkerErrorReportedEvent {
  
  @scala.inline
  def apply(errorMessage: ServiceWorkerErrorMessage): WorkerErrorReportedEvent = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerErrorReportedEvent]
  }
  
  @scala.inline
  implicit class WorkerErrorReportedEventMutableBuilder[Self <: WorkerErrorReportedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: ServiceWorkerErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}

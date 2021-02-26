package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerShutdownNotice extends StObject {
  
  /**
    * The reason for the worker shutdown. Current possible values are: "UNKNOWN": shutdown reason is unknown. "PREEMPTION": shutdown reason is preemption. Other possible reasons may be
    * added in the future.
    */
  var reason: js.UndefOr[String] = js.native
}
object WorkerShutdownNotice {
  
  @scala.inline
  def apply(): WorkerShutdownNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerShutdownNotice]
  }
  
  @scala.inline
  implicit class WorkerShutdownNoticeMutableBuilder[Self <: WorkerShutdownNotice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}

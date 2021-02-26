package typingsSlinky.devtoolsProtocol.mod.Protocol.ServiceWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopWorkerRequest extends StObject {
  
  var versionId: String = js.native
}
object StopWorkerRequest {
  
  @scala.inline
  def apply(versionId: String): StopWorkerRequest = {
    val __obj = js.Dynamic.literal(versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkerRequest]
  }
  
  @scala.inline
  implicit class StopWorkerRequestMutableBuilder[Self <: StopWorkerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}

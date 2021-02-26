package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/service-worker-info
  /**
    * The virtual ID of the process that this service worker is running in.  This is
    * not an OS level PID.  This aligns with the ID set used for
    * `webContents.getProcessId()`.
    */
  var renderProcessId: Double = js.native
  
  /**
    * The base URL that this service worker is active for.
    */
  var scope: String = js.native
  
  /**
    * The full URL to the script that this service worker runs
    */
  var scriptUrl: String = js.native
}
object ServiceWorkerInfo {
  
  @scala.inline
  def apply(renderProcessId: Double, scope: String, scriptUrl: String): ServiceWorkerInfo = {
    val __obj = js.Dynamic.literal(renderProcessId = renderProcessId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], scriptUrl = scriptUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerInfo]
  }
  
  @scala.inline
  implicit class ServiceWorkerInfoMutableBuilder[Self <: ServiceWorkerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderProcessId(value: Double): Self = StObject.set(x, "renderProcessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUrl(value: String): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.maximMazurokGapiClientAlertcenter

import typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.AlertsResource
import typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.V1beta1Resource
import typingsSlinky.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.alertcenter
import typingsSlinky.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.v1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load G Suite Alert Center API v1beta1 */
      def load(name: alertcenter, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: alertcenter, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object alertcenter extends js.Object {
        
        val alerts: AlertsResource = js.native
        
        val v1beta1: V1beta1Resource = js.native
      }
    }
  }
}

package typingsSlinky.maximMazurokGapiClientServicemanagement

import typingsSlinky.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement.OperationsResource
import typingsSlinky.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement.ServicesResource
import typingsSlinky.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.servicemanagement
import typingsSlinky.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.v1
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
      
      /** Load Service Management API v1 */
      def load(name: servicemanagement, version: v1): js.Thenable[Unit] = js.native
      def load(name: servicemanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object servicemanagement extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val services: ServicesResource = js.native
      }
    }
  }
}

package typingsSlinky.gapiClientServicemanagement

import typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement.OperationsResource
import typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement.ServicesResource
import typingsSlinky.gapiClientServicemanagement.gapiClientServicemanagementStrings.servicemanagement
import typingsSlinky.gapiClientServicemanagement.gapiClientServicemanagementStrings.v1
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
      
      /** Load Google Service Management API v1 */
      def load(name: servicemanagement, version: v1): js.Thenable[Unit] = js.native
      def load(name: servicemanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val operations: OperationsResource = js.native
      
      val services: ServicesResource = js.native
    }
  }
}

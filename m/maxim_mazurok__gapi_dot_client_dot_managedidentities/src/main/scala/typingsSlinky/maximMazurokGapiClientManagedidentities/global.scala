package typingsSlinky.maximMazurokGapiClientManagedidentities

import typingsSlinky.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities.ProjectsResource
import typingsSlinky.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.managedidentities
import typingsSlinky.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.v1
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
      
      /** Load Managed Service for Microsoft Active Directory API v1 */
      def load(name: managedidentities, version: v1): js.Thenable[Unit] = js.native
      def load(name: managedidentities, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object managedidentities extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

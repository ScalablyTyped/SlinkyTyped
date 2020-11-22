package typingsSlinky.maximMazurokGapiClientAccessapproval

import typingsSlinky.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval.FoldersResource
import typingsSlinky.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval.OrganizationsResource
import typingsSlinky.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval.ProjectsResource
import typingsSlinky.maximMazurokGapiClientAccessapproval.maximMazurokGapiClientAccessapprovalStrings.accessapproval
import typingsSlinky.maximMazurokGapiClientAccessapproval.maximMazurokGapiClientAccessapprovalStrings.v1
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
      
      /** Load Access Approval API v1 */
      def load(name: accessapproval, version: v1): js.Thenable[Unit] = js.native
      def load(name: accessapproval, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object accessapproval extends js.Object {
        
        val folders: FoldersResource = js.native
        
        val organizations: OrganizationsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

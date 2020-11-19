package typingsSlinky.gapiClientCloudresourcemanager

import typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.FoldersResource
import typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.LiensResource
import typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.OperationsResource
import typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.OrganizationsResource
import typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager.ProjectsResource
import typingsSlinky.gapiClientCloudresourcemanager.gapiClientCloudresourcemanagerStrings.cloudresourcemanager
import typingsSlinky.gapiClientCloudresourcemanager.gapiClientCloudresourcemanagerStrings.v1
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
      
      val folders: FoldersResource = js.native
      
      val liens: LiensResource = js.native
      
      /** Load Google Cloud Resource Manager API v1 */
      def load(name: cloudresourcemanager, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudresourcemanager, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val operations: OperationsResource = js.native
      
      val organizations: OrganizationsResource = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}

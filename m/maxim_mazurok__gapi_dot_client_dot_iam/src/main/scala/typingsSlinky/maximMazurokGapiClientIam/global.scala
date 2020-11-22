package typingsSlinky.maximMazurokGapiClientIam

import typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam.IamPoliciesResource
import typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam.OrganizationsResource
import typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam.PermissionsResource
import typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam.ProjectsResource
import typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam.RolesResource
import typingsSlinky.maximMazurokGapiClientIam.maximMazurokGapiClientIamStrings.iam
import typingsSlinky.maximMazurokGapiClientIam.maximMazurokGapiClientIamStrings.v1
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
      
      /** Load Identity and Access Management (IAM) API v1 */
      def load(name: iam, version: v1): js.Thenable[Unit] = js.native
      def load(name: iam, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object iam extends js.Object {
        
        val iamPolicies: IamPoliciesResource = js.native
        
        val organizations: OrganizationsResource = js.native
        
        val permissions: PermissionsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val roles: RolesResource = js.native
      }
    }
  }
}

package typingsSlinky.maximMazurokGapiClientSecretmanager

import typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager.ProjectsResource
import typingsSlinky.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.secretmanager
import typingsSlinky.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.v1
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
      
      /** Load Secret Manager API v1 */
      def load(name: secretmanager, version: v1): js.Thenable[Unit] = js.native
      def load(name: secretmanager, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object secretmanager extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

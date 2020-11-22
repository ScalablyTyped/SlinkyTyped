package typingsSlinky.maximMazurokGapiClientSourcerepo

import typingsSlinky.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo.ProjectsResource
import typingsSlinky.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.sourcerepo
import typingsSlinky.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.v1
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
      
      /** Load Cloud Source Repositories API v1 */
      def load(name: sourcerepo, version: v1): js.Thenable[Unit] = js.native
      def load(name: sourcerepo, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object sourcerepo extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

package typingsSlinky.maximMazurokGapiClientDatastore

import typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore.ProjectsResource
import typingsSlinky.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.datastore
import typingsSlinky.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.v1
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
      
      /** Load Cloud Datastore API v1 */
      def load(name: datastore, version: v1): js.Thenable[Unit] = js.native
      def load(name: datastore, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object datastore extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

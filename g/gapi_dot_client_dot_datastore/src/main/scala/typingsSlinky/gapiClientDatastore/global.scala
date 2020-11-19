package typingsSlinky.gapiClientDatastore

import typingsSlinky.gapiClientDatastore.gapi.client.datastore.ProjectsResource
import typingsSlinky.gapiClientDatastore.gapiClientDatastoreStrings.datastore
import typingsSlinky.gapiClientDatastore.gapiClientDatastoreStrings.v1
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
      
      /** Load Google Cloud Datastore API v1 */
      def load(name: datastore, version: v1): js.Thenable[Unit] = js.native
      def load(name: datastore, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}

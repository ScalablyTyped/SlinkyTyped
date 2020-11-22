package typingsSlinky.maximMazurokGapiClientGroupsmigration

import typingsSlinky.maximMazurokGapiClientGroupsmigration.gapi.client.groupsmigration.ArchiveResource
import typingsSlinky.maximMazurokGapiClientGroupsmigration.maximMazurokGapiClientGroupsmigrationStrings.groupsmigration
import typingsSlinky.maximMazurokGapiClientGroupsmigration.maximMazurokGapiClientGroupsmigrationStrings.v1
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
      
      /** Load Groups Migration API v1 */
      def load(name: groupsmigration, version: v1): js.Thenable[Unit] = js.native
      def load(name: groupsmigration, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object groupsmigration extends js.Object {
        
        val archive: ArchiveResource = js.native
      }
    }
  }
}

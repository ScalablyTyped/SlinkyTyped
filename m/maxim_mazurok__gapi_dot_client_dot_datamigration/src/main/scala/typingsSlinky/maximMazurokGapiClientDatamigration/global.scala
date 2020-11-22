package typingsSlinky.maximMazurokGapiClientDatamigration

import typingsSlinky.maximMazurokGapiClientDatamigration.gapi.client.datamigration.ProjectsResource
import typingsSlinky.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.datamigration
import typingsSlinky.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.v1beta1
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
      
      /** Load Database Migration API v1beta1 */
      def load(name: datamigration, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: datamigration, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object datamigration extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

package typingsSlinky.maximMazurokGapiClientDlp

import typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp.InfoTypesResource
import typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp.LocationsResource
import typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp.OrganizationsResource
import typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp.ProjectsResource
import typingsSlinky.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.dlp
import typingsSlinky.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.v2
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
      
      /** Load Cloud Data Loss Prevention (DLP) API v2 */
      def load(name: dlp, version: v2): js.Thenable[Unit] = js.native
      def load(name: dlp, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object dlp extends js.Object {
        
        val infoTypes: InfoTypesResource = js.native
        
        val locations: LocationsResource = js.native
        
        val organizations: OrganizationsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

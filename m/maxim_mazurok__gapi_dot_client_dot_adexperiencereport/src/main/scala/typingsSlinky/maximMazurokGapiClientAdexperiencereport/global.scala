package typingsSlinky.maximMazurokGapiClientAdexperiencereport

import typingsSlinky.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport.SitesResource
import typingsSlinky.maximMazurokGapiClientAdexperiencereport.gapi.client.adexperiencereport.ViolatingSitesResource
import typingsSlinky.maximMazurokGapiClientAdexperiencereport.maximMazurokGapiClientAdexperiencereportStrings.adexperiencereport
import typingsSlinky.maximMazurokGapiClientAdexperiencereport.maximMazurokGapiClientAdexperiencereportStrings.v1
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
      
      /** Load Ad Experience Report API v1 */
      def load(name: adexperiencereport, version: v1): js.Thenable[Unit] = js.native
      def load(name: adexperiencereport, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object adexperiencereport extends js.Object {
        
        val sites: SitesResource = js.native
        
        val violatingSites: ViolatingSitesResource = js.native
      }
    }
  }
}

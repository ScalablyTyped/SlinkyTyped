package typingsSlinky.maximMazurokGapiClientWebmasters

import typingsSlinky.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SearchanalyticsResource
import typingsSlinky.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitemapsResource
import typingsSlinky.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitesResource
import typingsSlinky.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.v3
import typingsSlinky.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.webmasters
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
      
      /** Load Search Console API v3 */
      def load(name: webmasters, version: v3): js.Thenable[Unit] = js.native
      def load(name: webmasters, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object webmasters extends js.Object {
        
        val searchanalytics: SearchanalyticsResource = js.native
        
        val sitemaps: SitemapsResource = js.native
        
        val sites: SitesResource = js.native
      }
    }
  }
}

package typingsSlinky.gapiClientAdexperiencereport

import typingsSlinky.gapiClientAdexperiencereport.gapi.client.adexperiencereport.SitesResource
import typingsSlinky.gapiClientAdexperiencereport.gapi.client.adexperiencereport.ViolatingSitesResource
import typingsSlinky.gapiClientAdexperiencereport.gapiClientAdexperiencereportStrings.adexperiencereport
import typingsSlinky.gapiClientAdexperiencereport.gapiClientAdexperiencereportStrings.v1
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
      
      /** Load Google Ad Experience Report API v1 */
      def load(name: adexperiencereport, version: v1): js.Thenable[Unit] = js.native
      def load(name: adexperiencereport, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val sites: SitesResource = js.native
      
      val violatingSites: ViolatingSitesResource = js.native
    }
  }
}

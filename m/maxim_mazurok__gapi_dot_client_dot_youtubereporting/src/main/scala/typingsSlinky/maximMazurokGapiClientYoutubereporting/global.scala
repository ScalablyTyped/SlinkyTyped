package typingsSlinky.maximMazurokGapiClientYoutubereporting

import typingsSlinky.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.JobsResource
import typingsSlinky.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.MediaResource
import typingsSlinky.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting.ReportTypesResource
import typingsSlinky.maximMazurokGapiClientYoutubereporting.maximMazurokGapiClientYoutubereportingStrings.v1
import typingsSlinky.maximMazurokGapiClientYoutubereporting.maximMazurokGapiClientYoutubereportingStrings.youtubereporting
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
      
      /** Load YouTube Reporting API v1 */
      def load(name: youtubereporting, version: v1): js.Thenable[Unit] = js.native
      def load(name: youtubereporting, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object youtubereporting extends js.Object {
        
        val jobs: JobsResource = js.native
        
        val media: MediaResource = js.native
        
        val reportTypes: ReportTypesResource = js.native
      }
    }
  }
}

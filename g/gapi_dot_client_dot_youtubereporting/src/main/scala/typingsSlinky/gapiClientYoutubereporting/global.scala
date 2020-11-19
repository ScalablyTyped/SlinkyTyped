package typingsSlinky.gapiClientYoutubereporting

import typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting.JobsResource
import typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting.MediaResource
import typingsSlinky.gapiClientYoutubereporting.gapi.client.youtubereporting.ReportTypesResource
import typingsSlinky.gapiClientYoutubereporting.gapiClientYoutubereportingStrings.v1
import typingsSlinky.gapiClientYoutubereporting.gapiClientYoutubereportingStrings.youtubereporting
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
      
      val jobs: JobsResource = js.native
      
      /** Load YouTube Reporting API v1 */
      def load(name: youtubereporting, version: v1): js.Thenable[Unit] = js.native
      def load(name: youtubereporting, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val media: MediaResource = js.native
      
      val reportTypes: ReportTypesResource = js.native
    }
  }
}

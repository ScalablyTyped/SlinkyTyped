package typingsSlinky.maximMazurokGapiClientYoutubeanalytics

import typingsSlinky.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupItemsResource
import typingsSlinky.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupsResource
import typingsSlinky.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.ReportsResource
import typingsSlinky.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.v2
import typingsSlinky.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.youtubeanalytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load YouTube Analytics API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: youtubeanalytics, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: youtubeanalytics, version: v2, callback: js.Function0[_]): Unit = js.native
      
      object youtubeanalytics {
        
        @JSGlobal("gapi.client.youtubeanalytics.groupItems")
        @js.native
        val groupItems: GroupItemsResource = js.native
        
        @JSGlobal("gapi.client.youtubeanalytics.groups")
        @js.native
        val groups: GroupsResource = js.native
        
        @JSGlobal("gapi.client.youtubeanalytics.reports")
        @js.native
        val reports: ReportsResource = js.native
      }
    }
  }
}

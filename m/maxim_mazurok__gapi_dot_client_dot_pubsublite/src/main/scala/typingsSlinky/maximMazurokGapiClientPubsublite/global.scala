package typingsSlinky.maximMazurokGapiClientPubsublite

import typingsSlinky.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.AdminResource
import typingsSlinky.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.CursorResource
import typingsSlinky.maximMazurokGapiClientPubsublite.gapi.client.pubsublite.TopicStatsResource
import typingsSlinky.maximMazurokGapiClientPubsublite.maximMazurokGapiClientPubsubliteStrings.pubsublite
import typingsSlinky.maximMazurokGapiClientPubsublite.maximMazurokGapiClientPubsubliteStrings.v1
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
      
      /** Load Pub/Sub Lite API v1 */
      def load(name: pubsublite, version: v1): js.Thenable[Unit] = js.native
      def load(name: pubsublite, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object pubsublite extends js.Object {
        
        val admin: AdminResource = js.native
        
        val cursor: CursorResource = js.native
        
        val topicStats: TopicStatsResource = js.native
      }
    }
  }
}

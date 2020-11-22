package typingsSlinky.maximMazurokGapiClientSafebrowsing

import typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.EncodedFullHashesResource
import typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.EncodedUpdatesResource
import typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.FullHashesResource
import typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatHitsResource
import typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatListUpdatesResource
import typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatListsResource
import typingsSlinky.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing.ThreatMatchesResource
import typingsSlinky.maximMazurokGapiClientSafebrowsing.maximMazurokGapiClientSafebrowsingStrings.safebrowsing
import typingsSlinky.maximMazurokGapiClientSafebrowsing.maximMazurokGapiClientSafebrowsingStrings.v4
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
      
      /** Load Safe Browsing API v4 */
      def load(name: safebrowsing, version: v4): js.Thenable[Unit] = js.native
      def load(name: safebrowsing, version: v4, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object safebrowsing extends js.Object {
        
        val encodedFullHashes: EncodedFullHashesResource = js.native
        
        val encodedUpdates: EncodedUpdatesResource = js.native
        
        val fullHashes: FullHashesResource = js.native
        
        val threatHits: ThreatHitsResource = js.native
        
        val threatListUpdates: ThreatListUpdatesResource = js.native
        
        val threatLists: ThreatListsResource = js.native
        
        val threatMatches: ThreatMatchesResource = js.native
      }
    }
  }
}

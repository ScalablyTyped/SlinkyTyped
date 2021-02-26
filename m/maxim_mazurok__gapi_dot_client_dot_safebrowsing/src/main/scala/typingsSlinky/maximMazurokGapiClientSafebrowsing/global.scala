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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Safe Browsing API v4 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: safebrowsing, version: v4): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: safebrowsing, version: v4, callback: js.Function0[_]): Unit = js.native
      
      object safebrowsing {
        
        @JSGlobal("gapi.client.safebrowsing.encodedFullHashes")
        @js.native
        val encodedFullHashes: EncodedFullHashesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.encodedUpdates")
        @js.native
        val encodedUpdates: EncodedUpdatesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.fullHashes")
        @js.native
        val fullHashes: FullHashesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatHits")
        @js.native
        val threatHits: ThreatHitsResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatListUpdates")
        @js.native
        val threatListUpdates: ThreatListUpdatesResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatLists")
        @js.native
        val threatLists: ThreatListsResource = js.native
        
        @JSGlobal("gapi.client.safebrowsing.threatMatches")
        @js.native
        val threatMatches: ThreatMatchesResource = js.native
      }
    }
  }
}

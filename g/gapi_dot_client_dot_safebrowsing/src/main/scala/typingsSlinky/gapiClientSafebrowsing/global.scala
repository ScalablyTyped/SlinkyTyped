package typingsSlinky.gapiClientSafebrowsing

import typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing.EncodedFullHashesResource
import typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing.EncodedUpdatesResource
import typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing.FullHashesResource
import typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing.ThreatListUpdatesResource
import typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing.ThreatListsResource
import typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing.ThreatMatchesResource
import typingsSlinky.gapiClientSafebrowsing.gapiClientSafebrowsingStrings.safebrowsing
import typingsSlinky.gapiClientSafebrowsing.gapiClientSafebrowsingStrings.v4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val encodedFullHashes: EncodedFullHashesResource = js.native
      val encodedUpdates: EncodedUpdatesResource = js.native
      val fullHashes: FullHashesResource = js.native
      val threatListUpdates: ThreatListUpdatesResource = js.native
      val threatLists: ThreatListsResource = js.native
      val threatMatches: ThreatMatchesResource = js.native
      /** Load Google Safe Browsing API v4 */
      def load(name: safebrowsing, version: v4): js.Thenable[Unit] = js.native
      def load(name: safebrowsing, version: v4, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}


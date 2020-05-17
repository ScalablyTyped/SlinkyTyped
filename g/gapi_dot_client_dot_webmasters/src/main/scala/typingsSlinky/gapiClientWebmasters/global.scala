package typingsSlinky.gapiClientWebmasters

import typingsSlinky.gapiClientWebmasters.gapi.client.webmasters.SearchanalyticsResource
import typingsSlinky.gapiClientWebmasters.gapi.client.webmasters.SitemapsResource
import typingsSlinky.gapiClientWebmasters.gapi.client.webmasters.SitesResource
import typingsSlinky.gapiClientWebmasters.gapi.client.webmasters.UrlcrawlerrorscountsResource
import typingsSlinky.gapiClientWebmasters.gapi.client.webmasters.UrlcrawlerrorssamplesResource
import typingsSlinky.gapiClientWebmasters.gapiClientWebmastersStrings.v3
import typingsSlinky.gapiClientWebmasters.gapiClientWebmastersStrings.webmasters
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
      val searchanalytics: SearchanalyticsResource = js.native
      val sitemaps: SitemapsResource = js.native
      val sites: SitesResource = js.native
      val urlcrawlerrorscounts: UrlcrawlerrorscountsResource = js.native
      val urlcrawlerrorssamples: UrlcrawlerrorssamplesResource = js.native
      /** Load Search Console API v3 */
      def load(name: webmasters, version: v3): js.Thenable[Unit] = js.native
      def load(name: webmasters, version: v3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}


package typingsSlinky.gapiClientAdsense

import typingsSlinky.gapiClientAdsense.gapi.client.adsense.AccountsResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.AdclientsResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.AdunitsResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.AlertsResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.CustomchannelsResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.MetadataResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.PaymentsResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.ReportsResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.SavedadstylesResource
import typingsSlinky.gapiClientAdsense.gapi.client.adsense.UrlchannelsResource
import typingsSlinky.gapiClientAdsense.gapiClientAdsenseStrings.adsense
import typingsSlinky.gapiClientAdsense.gapiClientAdsenseStrings.v1Dot4
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
      val accounts: AccountsResource = js.native
      val adclients: AdclientsResource = js.native
      val adunits: AdunitsResource = js.native
      val alerts: AlertsResource = js.native
      val customchannels: CustomchannelsResource = js.native
      val metadata: MetadataResource = js.native
      val payments: PaymentsResource = js.native
      val reports: ReportsResource = js.native
      val savedadstyles: SavedadstylesResource = js.native
      val urlchannels: UrlchannelsResource = js.native
      /** Load AdSense Management API v1.4 */
      def load(name: adsense, version: v1Dot4): js.Thenable[Unit] = js.native
      def load(name: adsense, version: v1Dot4, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}


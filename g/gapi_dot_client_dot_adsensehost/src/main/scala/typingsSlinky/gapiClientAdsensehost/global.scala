package typingsSlinky.gapiClientAdsensehost

import typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost.AccountsResource
import typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost.AdclientsResource
import typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost.AssociationsessionsResource
import typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost.CustomchannelsResource
import typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost.ReportsResource
import typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost.UrlchannelsResource
import typingsSlinky.gapiClientAdsensehost.gapiClientAdsensehostStrings.adsensehost
import typingsSlinky.gapiClientAdsensehost.gapiClientAdsensehostStrings.v4Dot1
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
      val associationsessions: AssociationsessionsResource = js.native
      val customchannels: CustomchannelsResource = js.native
      val reports: ReportsResource = js.native
      val urlchannels: UrlchannelsResource = js.native
      /** Load AdSense Host API v4.1 */
      def load(name: adsensehost, version: v4Dot1): js.Thenable[Unit] = js.native
      def load(name: adsensehost, version: v4Dot1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}


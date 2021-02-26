package typingsSlinky.maximMazurokGapiClientAdsensehost

import typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AccountsResource
import typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AdclientsResource
import typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.AssociationsessionsResource
import typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.CustomchannelsResource
import typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.ReportsResource
import typingsSlinky.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost.UrlchannelsResource
import typingsSlinky.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.adsensehost
import typingsSlinky.maximMazurokGapiClientAdsensehost.maximMazurokGapiClientAdsensehostStrings.v4Dot1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object adsensehost {
        
        @JSGlobal("gapi.client.adsensehost.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.adclients")
        @js.native
        val adclients: AdclientsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.associationsessions")
        @js.native
        val associationsessions: AssociationsessionsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.customchannels")
        @js.native
        val customchannels: CustomchannelsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.adsensehost.urlchannels")
        @js.native
        val urlchannels: UrlchannelsResource = js.native
      }
      
      /** Load AdSense Host API v4.1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adsensehost, version: v4Dot1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adsensehost, version: v4Dot1, callback: js.Function0[_]): Unit = js.native
    }
  }
}

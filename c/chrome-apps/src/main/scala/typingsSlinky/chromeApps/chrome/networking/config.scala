package typingsSlinky.chromeApps.chrome.networking

import typingsSlinky.chromeApps.anon.WIFI
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.None
import typingsSlinky.chromeApps.chromeAppsStrings.WI_FI
import typingsSlinky.chromeApps.chromeAppsStrings.WiFi
import typingsSlinky.chromeApps.chromeAppsStrings.`WEP-PSK`
import typingsSlinky.chromeApps.chromeAppsStrings.`WPA-EAP`
import typingsSlinky.chromeApps.chromeAppsStrings.`WPA-PSK`
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.networking.*
///////////////////////
// NETWORKING CONFIG //
///////////////////////
/**
  * @requires(CrOS) Chrome OS only.
  * @requires Permissions: 'networking.config'
  * @description
  * Use the *networking.config* API to authenticate to captive portals.
  */
object config {
  
  @js.native
  trait NetworkInfo extends StObject {
    
    /**
      * The basic service set identification (BSSID) uniquely identifying the
      * basic service set. *BSSID* is represented as a human readable,
      * hex-encoded string with bytes separated by colons, e.g.
      * 45:67:89:ab:cd:ef.
      */
    var BSSID: js.UndefOr[String] = js.native
    
    /** A unique identifier of the network. */
    var GUID: js.UndefOr[String] = js.native
    
    /**
      * A hex-encoded byte sequence.
      */
    var HexSSID: js.UndefOr[String] = js.native
    
    /**
      * The decoded SSID of the network (default encoding is UTF-8).
      * To filter for non-UTF-8 SSIDs, use HexSSID instead.
      */
    var SSID: js.UndefOr[String] = js.native
    
    /** Identifier indicating the security type of the network. */
    var Security: js.UndefOr[None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP`] = js.native
    
    /** Currently only WiFi supported. */
    var Type: ToStringLiteral[WIFI, WI_FI, Exclude[WI_FI, WiFi]] = js.native
  }
  object NetworkInfo {
    
    @scala.inline
    def apply(Type: ToStringLiteral[WIFI, WI_FI, Exclude[WI_FI, WiFi]]): NetworkInfo = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInfo]
    }
    
    @scala.inline
    implicit class NetworkInfoMutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
      
      @scala.inline
      def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGUIDUndefined: Self = StObject.set(x, "GUID", js.undefined)
      
      @scala.inline
      def setHexSSID(value: String): Self = StObject.set(x, "HexSSID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexSSIDUndefined: Self = StObject.set(x, "HexSSID", js.undefined)
      
      @scala.inline
      def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
      
      @scala.inline
      def setSecurity(value: None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP`): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "Security", js.undefined)
      
      @scala.inline
      def setType(value: ToStringLiteral[WIFI, WI_FI, Exclude[WI_FI, WiFi]]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkInfoFilterHexSSID extends StObject {
    
    /**
      * A hex-encoded byte sequence.
      */
    var HexSSID: js.UndefOr[String] = js.native
  }
  object NetworkInfoFilterHexSSID {
    
    @scala.inline
    def apply(): NetworkInfoFilterHexSSID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInfoFilterHexSSID]
    }
    
    @scala.inline
    implicit class NetworkInfoFilterHexSSIDMutableBuilder[Self <: NetworkInfoFilterHexSSID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHexSSID(value: String): Self = StObject.set(x, "HexSSID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexSSIDUndefined: Self = StObject.set(x, "HexSSID", js.undefined)
    }
  }
  
  @js.native
  trait NetworkInfoFilterSSID extends StObject {
    
    /**
      * The decoded SSID of the network (default encoding is UTF-8).
      * To filter for non-UTF-8 SSIDs, use HexSSID instead.
      */
    var SSID: js.UndefOr[String] = js.native
  }
  object NetworkInfoFilterSSID {
    
    @scala.inline
    def apply(): NetworkInfoFilterSSID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInfoFilterSSID]
    }
    
    @scala.inline
    implicit class NetworkInfoFilterSSIDMutableBuilder[Self <: NetworkInfoFilterSSID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
    }
  }
}

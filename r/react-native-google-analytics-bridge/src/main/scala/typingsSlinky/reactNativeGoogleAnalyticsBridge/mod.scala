package typingsSlinky.reactNativeGoogleAnalyticsBridge

import typingsSlinky.reactNativeGoogleAnalyticsBridge.customMod.CustomDimensionsFieldIndexMap
import typingsSlinky.reactNativeGoogleAnalyticsBridge.dataLayerEventMod.DataLayerEvent
import typingsSlinky.reactNativeGoogleAnalyticsBridge.googleAnalyticsSettingsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-google-analytics-bridge", "GoogleAnalyticsSettings")
  @js.native
  class GoogleAnalyticsSettings () extends default
  object GoogleAnalyticsSettings {
    
    /**
      * Sets the trackers dispatch interval.
      * Events, screen views, etc, are sent in batches to your tracker. This function allows you to configure how often (in seconds) the batches are sent to your tracker. Recommended to keep this around 20-120 seconds to preserve battery and network traffic. This is set to 20 seconds by default.
      * @example GoogleAnalyticsSettings.setDispatchInterval(30);
      * @param {number} intervalInSeconds
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleAnalyticsSettings.setDispatchInterval")
    @js.native
    def setDispatchInterval(intervalInSeconds: Double): Unit = js.native
    
    /**
      * When enabled the native library prevents any data from being sent to Google Analytics. This allows you to test or debug the implementation, without your test data appearing in your Google Analytics reports.
      * @example GoogleAnalyticsSettings.setDryRun(true);
      * @param {boolean} enabled
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleAnalyticsSettings.setDryRun")
    @js.native
    def setDryRun(enabled: Boolean): Unit = js.native
    
    /**
      * Sets if OptOut is active and disables Google Analytics. This is disabled by default. Note: This has to be set each time the App starts.
      * @example GoogleAnalyticsSettings.setOptOut(true);
      * @param {boolean} enabled
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleAnalyticsSettings.setOptOut")
    @js.native
    def setOptOut(enabled: Boolean): Unit = js.native
  }
  
  /**
    * @name GoogleAnalyticsTracker
    * @example
    * // Constructing a tracker is simple:
    * import { GoogleAnalyticsTracker } from "react-native-google-analytics-bridge";
    * const tracker = new GoogleAnalyticsTracker("UA-12345-1");
    * tracker.trackScreenView("Home");
    *
    * // You can have multiple trackers if you have several tracking ids
    * const tracker2 = new GoogleAnalyticsTracker("UA-12345-2");
    * @example
    * // One optional feature as well is constructing a tracker with a CustomDimensionsFieldIndexMap, to map custom dimension field names to index keys:
    * const fieldIndexMap = { customerType: 1 };
    * const tracker3 = new GoogleAnalyticsTracker("UA-12345-3", fieldIndexMap);
    *
    * // This is because the Google Analytics API expects custom dimensions to be tracked by index keys, and not field names.
    * // Here the underlying logic will transform the custom dimension, so what ends up being sent to GA is { 1: 'Premium' }:
    * tracker3.trackScreenView("Home", { customDimensions: { customerType: "Premium" } });
    *
    * // If you do not use a CustomDimensionsFieldIndexMap, you will have to use index as keys instead for custom dimensions:
    * tracker.trackScreenView("Home", { customDimensions: { 1: "Premium" } });
    */
  @JSImport("react-native-google-analytics-bridge", "GoogleAnalyticsTracker")
  @js.native
  class GoogleAnalyticsTracker protected ()
    extends typingsSlinky.reactNativeGoogleAnalyticsBridge.googleAnalyticsTrackerMod.default {
    /**
      * Save all tracker related data that is needed to call native methods with proper data.
      * @param {string} trackerId Your tracker id, something like: UA-12345-1
      * @param {{fieldName: fieldIndex}} customDimensionsFieldsIndexMap Custom dimensions field/index pairs
      */
    def this(trackerId: String) = this()
    def this(trackerId: String, customDimensionsFieldsIndexMap: CustomDimensionsFieldIndexMap) = this()
  }
  
  /**
    * Can only be used with one container. All functions returns a Promise.
    *
    * @name GoogleTagManager
    * @example
    * import { GoogleTagManager } from "react-native-google-analytics-bridge";
    * GoogleTagManager.openContainerWithId("GT-NZT48")
    *   .then(() => GoogleTagManager.stringForKey("pack"))
    *   .then(str => console.log("Pack: ", str));
    */
  @JSImport("react-native-google-analytics-bridge", "GoogleTagManager")
  @js.native
  class GoogleTagManager ()
    extends typingsSlinky.reactNativeGoogleAnalyticsBridge.googleTagManagerMod.default
  object GoogleTagManager {
    
    /**
      * Retrieves a boolean value with the given key from the opened container.
      * @example GoogleTagManager.boolForKey("key").then(val => console.log(val));
      * @param {string} key
      * @returns {Promise<boolean>}
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.boolForKey")
    @js.native
    def boolForKey(key: String): js.Promise[Boolean] = js.native
    
    /**
      * Retrieves a number with the given key from the opened container.
      * @example GoogleTagManager.doubleForKey("key").then(val => console.log(val));
      * @param {string} key
      * @returns {Promise<number>}
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.doubleForKey")
    @js.native
    def doubleForKey(key: js.Any): js.Promise[Double] = js.native
    
    /**
      * Call once to open the container for all subsequent static calls.
      * @example
      * GoogleTagManager.openContainerWithId('GT-NZT48').then((..) => ..)
      * @param {string} containerId
      * @returns {Promise<boolean>}
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.openContainerWithId")
    @js.native
    def openContainerWithId(containerId: String): js.Promise[Boolean] = js.native
    
    /**
      * Push a datalayer event for Google Analytics through Google Tag Manager. The event must have at least one key "event" with event name.
      * @example
      * GoogleTagManager.pushDataLayerEvent({
      *   event: "eventName",
      *   pageId: "/home"
      * }).then(success => console.log(success));
      * @param {DataLayerEvent} event An Map<String, Object> containing key and value pairs. It must have at least one key "event" with event name
      * @returns {Promise<boolean>}
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.pushDataLayerEvent")
    @js.native
    def pushDataLayerEvent(event: DataLayerEvent): js.Promise[Boolean] = js.native
    
    /**
      * Refreshes the GTM container.
      * According to Tag Manager documentations for Android can be called once every 15 minutes.
      * No such limitations has been mentioned for iOS containers, though.
      * @example
      * GoogleTagManager.refreshContainer().then((..) => ..)
      * @returns {Promise<boolean>}
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.refreshContainer")
    @js.native
    def refreshContainer(): js.Promise[Boolean] = js.native
    
    /**
      * Register Function Call tag handler
      * @param {String} functionName
      * @param {Function} handler
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.registerFunctionCallTagHandler")
    @js.native
    def registerFunctionCallTagHandler(functionName: js.Any, handler: js.Any): js.Promise[Boolean] = js.native
    
    /**
      * Sets logger to verbose, default is warning
      * @param {boolean} enabled
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.setVerboseLoggingEnabled")
    @js.native
    def setVerboseLoggingEnabled(enabled: Boolean): js.Promise[Boolean] = js.native
    
    /**
      * Retrieves a string with the given key from the opened container.
      * @example GoogleTagManager.stringForKey("key").then(val => console.log(val));
      * @param {string} key
      * @returns {Promise<string>}
      */
    /* static member */
    @JSImport("react-native-google-analytics-bridge", "GoogleTagManager.stringForKey")
    @js.native
    def stringForKey(key: String): js.Promise[String] = js.native
  }
  
  @JSImport("react-native-google-analytics-bridge", "ProductActionEnum")
  @js.native
  object ProductActionEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum with Double
      ] = js.native
    
    /* 3 */ val Add: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Add with Double = js.native
    
    /* 5 */ val Checkout: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Checkout with Double = js.native
    
    /* 6 */ val CheckoutOption: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.CheckoutOption with Double = js.native
    
    /* 2 */ val Click: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Click with Double = js.native
    
    /* 1 */ val Detail: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Detail with Double = js.native
    
    /* 7 */ val Purchase: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Purchase with Double = js.native
    
    /* 8 */ val Refund: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Refund with Double = js.native
    
    /* 4 */ val Remove: typingsSlinky.reactNativeGoogleAnalyticsBridge.productMod.ProductActionEnum.Remove with Double = js.native
  }
}

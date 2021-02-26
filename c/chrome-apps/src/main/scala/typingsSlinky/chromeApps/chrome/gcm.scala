package typingsSlinky.chromeApps.chrome

import typingsSlinky.chromeApps.chromeAppsStrings.goog_
import typingsSlinky.chromeApps.chromeAppsStrings.google_
import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.gcm
////////////////////////////
// Google Cloud Messaging //
////////////////////////////
/**
  * Use chrome.gcm to enable apps to send and receive
  * messages through the Google Cloud Messaging Service.
  * @deprecated
  * As of April 10, 2018, Google has deprecated GCM.
  * The GCM server and client APIs are deprecated and will be removed as soon as April 11, 2019.
  * Migrate GCM apps to Firebase Cloud Messaging (FCM),
  * which inherits the reliable and scalable GCM infrastructure,
  * plus many new features. See the migration guide to learn more.
  * @see[Migration guide]{@link https://developers.google.com/cloud-messaging/android/android-migrate-fcm}
  * @see[GCM Imlementation guide]{@link https://developers.google.com/cloud-messaging/chrome/client}
  * @since Chrome 35.
  * @requires Permissions: 'gcm'
  */
object gcm {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.collapse_key
    - typingsSlinky.chromeApps.chromeAppsStrings.goog_
    - typingsSlinky.chromeApps.chromeAppsStrings.googDot
    - typingsSlinky.chromeApps.chromeAppsStrings.GOOG
    - typingsSlinky.chromeApps.chromeAppsStrings.GOOGDot
    - typingsSlinky.chromeApps.chromeAppsStrings.google_
    - typingsSlinky.chromeApps.chromeAppsStrings.GOOGLE
  */
  trait DisallowedKeys extends StObject
  object DisallowedKeys {
    
    @scala.inline
    def GOOG: typingsSlinky.chromeApps.chromeAppsStrings.GOOG = "GOOG".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.GOOG]
    
    @scala.inline
    def GOOGDot: typingsSlinky.chromeApps.chromeAppsStrings.GOOGDot = "GOOG.".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.GOOGDot]
    
    @scala.inline
    def GOOGLE: typingsSlinky.chromeApps.chromeAppsStrings.GOOGLE = "GOOGLE".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.GOOGLE]
    
    @scala.inline
    def collapse_key: typingsSlinky.chromeApps.chromeAppsStrings.collapse_key = "collapse_key".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.collapse_key]
    
    @scala.inline
    def goog: goog_ = "goog".asInstanceOf[goog_]
    
    @scala.inline
    def googDot: typingsSlinky.chromeApps.chromeAppsStrings.googDot = "goog.".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.googDot]
    
    @scala.inline
    def google: google_ = "google".asInstanceOf[google_]
  }
  
  @js.native
  trait GcmError extends StObject {
    
    /** Additional details related to the error, when available. */
    var detail: js.Object = js.native
    
    /** The error message describing the problem. */
    var errorMessage: String = js.native
    
    /** The ID of the message with this error, if error is related to a specific message. */
    var messageId: js.UndefOr[String] = js.native
  }
  object GcmError {
    
    @scala.inline
    def apply(detail: js.Object, errorMessage: String): GcmError = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcmError]
    }
    
    @scala.inline
    implicit class GcmErrorMutableBuilder[Self <: GcmError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: js.Object): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    }
  }
  
  type IGCMDataReceive = Record[String, js.Any]
  
  type IGCMDataSend = Record[Exclude[DisallowedKeys, String], js.Any]
  
  @js.native
  trait IncomingMessage extends StObject {
    
    /**
      * Optional.
      * The collapse key of a message. See Collapsible Messages section of Cloud Messaging documentation for details.
      */
    var collapseKey: js.UndefOr[String] = js.native
    
    /** The message data. */
    var data: IGCMDataReceive = js.native
    
    /**
      * Optional.
      * The sender who issued the message.
      * @since Chrome 41.
      */
    var from: js.UndefOr[String] = js.native
  }
  object IncomingMessage {
    
    @scala.inline
    def apply(data: IGCMDataReceive): IncomingMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingMessage]
    }
    
    @scala.inline
    implicit class IncomingMessageMutableBuilder[Self <: IncomingMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseKeyUndefined: Self = StObject.set(x, "collapseKey", js.undefined)
      
      @scala.inline
      def setData(value: IGCMDataReceive): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  @js.native
  trait OutgoingMessage extends StObject {
    
    /**
      * Message data to send to the server.
      *
      * Case-insensitive goog. and google,
      * as well as case-sensitive collapse_key
      * are disallowed as key prefixes.
      *
      * Sum of all key/value pairs should not exceed gcm.MAX_MESSAGE_SIZE.
      **/
    var data: IGCMDataSend = js.native
    
    /** The ID of the server to send the message to as assigned by Google API Console. */
    var destinationId: String = js.native
    
    /** The ID of the message. It must be unique for each message in scope of the applications. See the Cloud Messaging documentation for advice for picking and handling an ID. */
    var messageId: String = js.native
    
    /** Time-to-live of the message in seconds. If it is not possible to send the message within that time, an onSendError event will be raised. A time-to-live of 0 indicates that the message should be sent immediately or fail if it's not possible. The maximum and a default value of time-to-live is 86400 seconds (1 day). */
    var timeToLive: js.UndefOr[integer] = js.native
  }
  object OutgoingMessage {
    
    @scala.inline
    def apply(data: IGCMDataSend, destinationId: String, messageId: String): OutgoingMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingMessage]
    }
    
    @scala.inline
    implicit class OutgoingMessageMutableBuilder[Self <: OutgoingMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: IGCMDataSend): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLive(value: integer): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
    }
  }
}

package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageMod {
  
  @js.native
  trait Message extends StObject {
    
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign:
      * OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action.
      *
      * DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app.
      *
      * URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify.
      */
    var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.native
    
    /**
      * The message body. Can include up to 140 characters.
      */
    var Body: js.UndefOr[String] = js.native
    
    /**
      * The URL that points to the icon image for the push notification icon, for example, the app icon.
      */
    var ImageIconUrl: js.UndefOr[String] = js.native
    
    /**
      * The URL that points to the small icon image for the push notification icon, for example, the app icon.
      */
    var ImageSmallIconUrl: js.UndefOr[String] = js.native
    
    /**
      * The URL that points to an image used in the push notification.
      */
    var ImageUrl: js.UndefOr[String] = js.native
    
    /**
      * The JSON payload used for a silent push.
      */
    var JsonBody: js.UndefOr[String] = js.native
    
    /**
      * The URL that points to the media resource, for example a .mp4 or .gif file.
      */
    var MediaUrl: js.UndefOr[String] = js.native
    
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[String] = js.native
    
    /**
      * Indicates if the message should display on the users device.
      *
      * Silent pushes can be used for Remote Configuration and Phone Home use cases.
      */
    var SilentPush: js.UndefOr[Boolean] = js.native
    
    /**
      * This parameter specifies how long (in seconds) the message should be kept if the service is unable to deliver the notification the first time. If the value is 0, it treats the notification as if it expires immediately and does not store the notification or attempt to redeliver it. This value is converted to the expiration field when sent to the service. It only applies to APNs and GCM
      */
    var TimeToLive: js.UndefOr[Double] = js.native
    
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[String] = js.native
    
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[String] = js.native
  }
  object Message {
    
    @scala.inline
    def apply(): Message = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setImageIconUrl(value: String): Self = StObject.set(x, "ImageIconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageIconUrlUndefined: Self = StObject.set(x, "ImageIconUrl", js.undefined)
      
      @scala.inline
      def setImageSmallIconUrl(value: String): Self = StObject.set(x, "ImageSmallIconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmallIconUrlUndefined: Self = StObject.set(x, "ImageSmallIconUrl", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
      
      @scala.inline
      def setJsonBody(value: String): Self = StObject.set(x, "JsonBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonBodyUndefined: Self = StObject.set(x, "JsonBody", js.undefined)
      
      @scala.inline
      def setMediaUrl(value: String): Self = StObject.set(x, "MediaUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUrlUndefined: Self = StObject.set(x, "MediaUrl", js.undefined)
      
      @scala.inline
      def setRawContent(value: String): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
      
      @scala.inline
      def setSilentPush(value: Boolean): Self = StObject.set(x, "SilentPush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentPushUndefined: Self = StObject.set(x, "SilentPush", js.undefined)
      
      @scala.inline
      def setTimeToLive(value: Double): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    }
  }
  
  type UnmarshalledMessage = Message
}

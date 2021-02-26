package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  /**
    * The action to occur if a recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of iOS and Android. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Action] = js.native
  
  /**
    * The body of the notification message. The maximum number of characters is 200.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The URL of the image to display as the push-notification icon, such as the icon for the app.
    */
  var ImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL of the image to display as the small, push-notification icon, such as a small version of the icon for the app.
    */
  var ImageSmallIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL of an image to display in the push notification.
    */
  var ImageUrl: js.UndefOr[string] = js.native
  
  /**
    * The JSON payload to use for a silent push notification.
    */
  var JsonBody: js.UndefOr[string] = js.native
  
  /**
    * The URL of the image or video to display in the push notification.
    */
  var MediaUrl: js.UndefOr[string] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value overrides all other content for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration, displaying messages in an in-app message center, or supporting phone home functionality.
    */
  var SilentPush: js.UndefOr[boolean] = js.native
  
  /**
    * The number of seconds that the push-notification service should keep the message, if the service is unable to deliver the notification the first time. This value is converted to an expiration value when it's sent to a push-notification service. If this value is 0, the service treats the notification as if it expires immediately and the service doesn't store or try to deliver the notification again. This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
    */
  var TimeToLive: js.UndefOr[integer] = js.native
  
  /**
    * The title to display above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[string] = js.native
  
  /**
    * The URL to open in a recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.native
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
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setImageIconUrl(value: string): Self = StObject.set(x, "ImageIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIconUrlUndefined: Self = StObject.set(x, "ImageIconUrl", js.undefined)
    
    @scala.inline
    def setImageSmallIconUrl(value: string): Self = StObject.set(x, "ImageSmallIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSmallIconUrlUndefined: Self = StObject.set(x, "ImageSmallIconUrl", js.undefined)
    
    @scala.inline
    def setImageUrl(value: string): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    @scala.inline
    def setJsonBody(value: string): Self = StObject.set(x, "JsonBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonBodyUndefined: Self = StObject.set(x, "JsonBody", js.undefined)
    
    @scala.inline
    def setMediaUrl(value: string): Self = StObject.set(x, "MediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUrlUndefined: Self = StObject.set(x, "MediaUrl", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
    
    @scala.inline
    def setSilentPush(value: boolean): Self = StObject.set(x, "SilentPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentPushUndefined: Self = StObject.set(x, "SilentPush", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: integer): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
    
    @scala.inline
    def setTitle(value: string): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}

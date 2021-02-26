package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaiduMessage extends StObject {
  
  /**
    * The action to occur if the recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking features of the Android platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Action] = js.native
  
  /**
    * The body of the notification message.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The JSON data payload to use for the push notification, if the notification is a silent push notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
    */
  var Data: js.UndefOr[MapOfString] = js.native
  
  /**
    * The icon image name of the asset saved in your app.
    */
  var IconReference: js.UndefOr[string] = js.native
  
  /**
    * The URL of the large icon image to display in the content view of the push notification.
    */
  var ImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL of an image to display in the push notification.
    */
  var ImageUrl: js.UndefOr[string] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value overrides all other content for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration or supporting phone home functionality.
    */
  var SilentPush: js.UndefOr[boolean] = js.native
  
  /**
    * The URL of the small icon image to display in the status bar and the content view of the push notification.
    */
  var SmallImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The sound to play when the recipient receives the push notification. You can use the default stream or specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside in /res/raw/.
    */
  var Sound: js.UndefOr[string] = js.native
  
  /**
    * The default message variables to use in the notification message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The amount of time, in seconds, that the Baidu Cloud Push service should store the message if the recipient's device is offline. The default value and maximum supported time is 604,800 seconds (7 days).
    */
  var TimeToLive: js.UndefOr[integer] = js.native
  
  /**
    * The title to display above the notification message on the recipient's device.
    */
  var Title: js.UndefOr[string] = js.native
  
  /**
    * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.native
}
object BaiduMessage {
  
  @scala.inline
  def apply(): BaiduMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaiduMessage]
  }
  
  @scala.inline
  implicit class BaiduMessageMutableBuilder[Self <: BaiduMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setData(value: MapOfString): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setIconReference(value: string): Self = StObject.set(x, "IconReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconReferenceUndefined: Self = StObject.set(x, "IconReference", js.undefined)
    
    @scala.inline
    def setImageIconUrl(value: string): Self = StObject.set(x, "ImageIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIconUrlUndefined: Self = StObject.set(x, "ImageIconUrl", js.undefined)
    
    @scala.inline
    def setImageUrl(value: string): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
    
    @scala.inline
    def setSilentPush(value: boolean): Self = StObject.set(x, "SilentPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentPushUndefined: Self = StObject.set(x, "SilentPush", js.undefined)
    
    @scala.inline
    def setSmallImageIconUrl(value: string): Self = StObject.set(x, "SmallImageIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallImageIconUrlUndefined: Self = StObject.set(x, "SmallImageIconUrl", js.undefined)
    
    @scala.inline
    def setSound(value: string): Self = StObject.set(x, "Sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "Sound", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    
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

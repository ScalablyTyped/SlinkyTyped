package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaiduMessage extends js.Object {
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
  implicit class BaiduMessageOps[Self <: BaiduMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReference(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconReference")(js.undefined)
        ret
    }
    @scala.inline
    def withImageIconUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRawContent(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSilentPush(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SilentPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilentPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SilentPush")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallImageIconUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmallImageIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallImageIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmallImageIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sound")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: MapOfListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToLive(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLive")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}


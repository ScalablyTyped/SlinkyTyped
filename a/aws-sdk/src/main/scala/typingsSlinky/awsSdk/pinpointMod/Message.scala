package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
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
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def withImageSmallIconUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSmallIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSmallIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageSmallIconUrl")(js.undefined)
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
    def withJsonBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonBody")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediaUrl")(js.undefined)
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


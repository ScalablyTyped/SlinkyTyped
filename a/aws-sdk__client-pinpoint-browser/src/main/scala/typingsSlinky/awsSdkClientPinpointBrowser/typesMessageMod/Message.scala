package typingsSlinky.awsSdkClientPinpointBrowser.typesMessageMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
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
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = {
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
    def withBody(value: String): Self = {
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
    def withImageIconUrl(value: String): Self = {
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
    def withImageSmallIconUrl(value: String): Self = {
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
    def withImageUrl(value: String): Self = {
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
    def withJsonBody(value: String): Self = {
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
    def withMediaUrl(value: String): Self = {
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
    def withRawContent(value: String): Self = {
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
    def withSilentPush(value: Boolean): Self = {
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
    def withTimeToLive(value: Double): Self = {
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
    def withTitle(value: String): Self = {
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
    def withUrl(value: String): Self = {
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


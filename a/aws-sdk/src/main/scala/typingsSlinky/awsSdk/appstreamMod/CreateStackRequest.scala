package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackRequest extends js.Object {
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ApplicationSettings] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Description] = js.native
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DisplayName] = js.native
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
    */
  var EmbedHostDomains: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.EmbedHostDomains] = js.native
  /**
    * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.FeedbackURL] = js.native
  /**
    * The name of the stack.
    */
  var Name: typingsSlinky.awsSdk.appstreamMod.Name = js.native
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.RedirectURL] = js.native
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.native
  /**
    * The tags to associate with the stack. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Tags] = js.native
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. 
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.native
}

object CreateStackRequest {
  @scala.inline
  def apply(Name: Name): CreateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackRequest]
  }
  @scala.inline
  implicit class CreateStackRequestOps[Self <: CreateStackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessEndpoints(value: AccessEndpointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationSettings(value: ApplicationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbedHostDomains(value: EmbedHostDomains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbedHostDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedHostDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbedHostDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedbackURL(value: FeedbackURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackURL")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectURL(value: RedirectURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectURL")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageConnectors(value: StorageConnectorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageConnectors")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSettings(value: UserSettingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettings")(js.undefined)
        ret
    }
  }
  
}


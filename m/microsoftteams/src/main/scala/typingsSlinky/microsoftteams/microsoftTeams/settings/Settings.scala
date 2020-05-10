package typingsSlinky.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * Sets the URL to use for the content of this instance.
    */
  var contentUrl: String = js.native
  /**
    * The developer-defined unique ID for the entity to which this content points.
    */
  var entityId: String = js.native
  /**
    * Sets the URL for the removal configuration experience.
    */
  var removeUrl: js.UndefOr[String] = js.native
  /**
    * A suggested display name for the new content.
    * In the settings for an existing instance being updated, this call has no effect.
    */
  var suggestedDisplayName: js.UndefOr[String] = js.native
  /**
    * Sets the URL to use for the external link to view the underlying resource in a browser.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(contentUrl: String, entityId: String): Settings = {
    val __obj = js.Dynamic.literal(contentUrl = contentUrl.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
  }
  
}


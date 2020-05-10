package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserActivity extends Entity {
  /**
    * Required. URL used to launch the activity in the best native experience represented by the appId. Might launch a
    * web-based app if no native app exists.
    */
  var activationUrl: js.UndefOr[String] = js.native
  /**
    * Required. URL for the domain representing the cross-platform identity mapping for the app. Mapping is stored either as
    * a JSON file hosted on the domain or configurable via Windows Dev Center. The JSON file is named
    * cross-platform-app-identifiers and is hosted at root of your HTTPS domain, either at the top level domain or include a
    * sub domain. For example: https://contoso.com or https://myapp.contoso.com but NOT https://myapp.contoso.com/somepath.
    * You must have a unique file and domain (or sub domain) per cross-platform app identity. For example, a separate file
    * and domain is needed for Word vs. PowerPoint.
    */
  var activitySourceHost: js.UndefOr[String] = js.native
  // Required. The unique activity ID in the context of the app - supplied by caller and immutable thereafter.
  var appActivityId: js.UndefOr[String] = js.native
  /**
    * Optional. Short text description of the app used to generate the activity for use in cases when the app is not
    * installed on the user’s local device.
    */
  var appDisplayName: js.UndefOr[String] = js.native
  // Optional. A custom piece of data - JSON-LD extensible description of content according to schema.org syntax.
  var contentInfo: js.UndefOr[js.Any] = js.native
  /**
    * Optional. Used in the event the content can be rendered outside of a native or web-based app experience (for example, a
    * pointer to an item in an RSS feed).
    */
  var contentUrl: js.UndefOr[String] = js.native
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[String] = js.native
  // Set by the server. DateTime in UTC when the object expired on the server.
  var expirationDateTime: js.UndefOr[String] = js.native
  // Optional. URL used to launch the activity in a web-based app, if available.
  var fallbackUrl: js.UndefOr[String] = js.native
  // Optional. NavigationProperty/Containment; navigation property to the activity's historyItems.
  var historyItems: js.UndefOr[js.Array[ActivityHistoryItem]] = js.native
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[Status] = js.native
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time;
    * values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[String] = js.native
  // Required. The object containing information to render the activity in the UX.
  var visualElements: js.UndefOr[VisualInfo] = js.native
}

object UserActivity {
  @scala.inline
  def apply(): UserActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserActivity]
  }
  @scala.inline
  implicit class UserActivityOps[Self <: UserActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withActivitySourceHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activitySourceHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivitySourceHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activitySourceHost")(js.undefined)
        ret
    }
    @scala.inline
    def withAppActivityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appActivityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppActivityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appActivityId")(js.undefined)
        ret
    }
    @scala.inline
    def withAppDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryItems(value: js.Array[ActivityHistoryItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyItems")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTimezone")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualElements(value: VisualInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualElements")(js.undefined)
        ret
    }
  }
  
}


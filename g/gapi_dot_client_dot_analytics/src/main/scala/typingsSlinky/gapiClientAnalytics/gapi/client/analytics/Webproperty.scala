package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.anon.Effective
import typingsSlinky.gapiClientAnalytics.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webproperty extends js.Object {
  /** Account ID to which this web property belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** Child link for this web property. Points to the list of views (profiles) for this web property. */
  var childLink: js.UndefOr[Href] = js.native
  /** Time this web property was created. */
  var created: js.UndefOr[String] = js.native
  /** Default view (profile) ID. */
  var defaultProfileId: js.UndefOr[String] = js.native
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[String] = js.native
  /** The industry vertical/category selected for this web property. */
  var industryVertical: js.UndefOr[String] = js.native
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** Resource type for Analytics WebProperty. */
  var kind: js.UndefOr[String] = js.native
  /** Level for this web property. Possible values are STANDARD or PREMIUM. */
  var level: js.UndefOr[String] = js.native
  /** Name of this web property. */
  var name: js.UndefOr[String] = js.native
  /** Parent link for this web property. Points to the account to which this web property belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  /** Permissions the user has for this web property. */
  var permissions: js.UndefOr[Effective] = js.native
  /** View (Profile) count for this web property. */
  var profileCount: js.UndefOr[Double] = js.native
  /** Link for this web property. */
  var selfLink: js.UndefOr[String] = js.native
  /** Indicates whether this web property is starred or not. */
  var starred: js.UndefOr[Boolean] = js.native
  /** Time this web property was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Website url for this web property. */
  var websiteUrl: js.UndefOr[String] = js.native
}

object Webproperty {
  @scala.inline
  def apply(): Webproperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Webproperty]
  }
  @scala.inline
  implicit class WebpropertyOps[Self <: Webproperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withChildLink(value: Href): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndustryVertical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industryVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndustryVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industryVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLink(value: Href): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: Effective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withStarred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
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


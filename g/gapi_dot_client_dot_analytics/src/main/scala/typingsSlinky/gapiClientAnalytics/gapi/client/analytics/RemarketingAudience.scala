package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.anon.ExcludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudience extends js.Object {
  /** Account ID to which this remarketing audience belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** The simple audience definition that will cause a user to be added to an audience. */
  var audienceDefinition: js.UndefOr[typingsSlinky.gapiClientAnalytics.anon.IncludeConditions] = js.native
  /** The type of audience, either SIMPLE or STATE_BASED. */
  var audienceType: js.UndefOr[String] = js.native
  /** Time this remarketing audience was created. */
  var created: js.UndefOr[String] = js.native
  /** The description of this remarketing audience. */
  var description: js.UndefOr[String] = js.native
  /** Remarketing Audience ID. */
  var id: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this remarketing audience belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** Collection type. */
  var kind: js.UndefOr[String] = js.native
  /** The linked ad accounts associated with this remarketing audience. A remarketing audience can have only one linkedAdAccount currently. */
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.native
  /** The views (profiles) that this remarketing audience is linked to. */
  var linkedViews: js.UndefOr[js.Array[String]] = js.native
  /** The name of this remarketing audience. */
  var name: js.UndefOr[String] = js.native
  /** A state based audience definition that will cause a user to be added or removed from an audience. */
  var stateBasedAudienceDefinition: js.UndefOr[ExcludeConditions] = js.native
  /** Time this remarketing audience was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Web property ID of the form UA-XXXXX-YY to which this remarketing audience belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object RemarketingAudience {
  @scala.inline
  def apply(): RemarketingAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingAudience]
  }
  @scala.inline
  implicit class RemarketingAudienceOps[Self <: RemarketingAudience] (val x: Self) extends AnyVal {
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
    def withAudienceDefinition(value: typingsSlinky.gapiClientAnalytics.anon.IncludeConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withAudienceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceType")(js.undefined)
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withLinkedAdAccounts(value: js.Array[LinkedForeignAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedAdAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedAdAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedAdAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedViews(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedViews")(js.undefined)
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
    def withStateBasedAudienceDefinition(value: ExcludeConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateBasedAudienceDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateBasedAudienceDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateBasedAudienceDefinition")(js.undefined)
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
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}


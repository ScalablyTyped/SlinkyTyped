package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleapis.AnonComparisonValue
import typingsSlinky.googleapis.AnonEventConditions
import typingsSlinky.googleapis.AnonFirstStepRequired
import typingsSlinky.googleapis.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics goal resource.
  */
@js.native
trait SchemaGoal extends js.Object {
  /**
    * Account ID to which this goal belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Determines whether this goal is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Time this goal was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Details for the goal of the type EVENT.
    */
  var eventDetails: js.UndefOr[AnonEventConditions] = js.native
  /**
    * Goal ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Internal ID for the web property to which this goal belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Resource type for an Analytics goal.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Goal name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent link for a goal. Points to the view (profile) to which this goal
    * belongs.
    */
  var parentLink: js.UndefOr[AnonHref] = js.native
  /**
    * View (Profile) ID to which this goal belongs.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Link for this goal.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE,
    * VISIT_NUM_PAGES, AND EVENT.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Time this goal was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Details for the goal of the type URL_DESTINATION.
    */
  var urlDestinationDetails: js.UndefOr[AnonFirstStepRequired] = js.native
  /**
    * Goal value.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Details for the goal of the type VISIT_NUM_PAGES.
    */
  var visitNumPagesDetails: js.UndefOr[AnonComparisonValue] = js.native
  /**
    * Details for the goal of the type VISIT_TIME_ON_SITE.
    */
  var visitTimeOnSiteDetails: js.UndefOr[AnonComparisonValue] = js.native
  /**
    * Web property ID to which this goal belongs. The web property ID is of the
    * form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaGoal {
  @scala.inline
  def apply(): SchemaGoal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoal]
  }
  @scala.inline
  implicit class SchemaGoalOps[Self <: SchemaGoal] (val x: Self) extends AnyVal {
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
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
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
    def withEventDetails(value: AnonEventConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDetails")(js.undefined)
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
    def withParentLink(value: AnonHref): Self = {
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
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    def withUrlDestinationDetails(value: AnonFirstStepRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlDestinationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlDestinationDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlDestinationDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitNumPagesDetails(value: AnonComparisonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumPagesDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitNumPagesDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitNumPagesDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withVisitTimeOnSiteDetails(value: AnonComparisonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTimeOnSiteDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitTimeOnSiteDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitTimeOnSiteDetails")(js.undefined)
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


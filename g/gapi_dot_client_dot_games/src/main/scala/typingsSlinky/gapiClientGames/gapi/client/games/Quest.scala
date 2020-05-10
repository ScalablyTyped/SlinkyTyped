package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quest extends js.Object {
  /** The timestamp at which the user accepted the quest in milliseconds since the epoch in UTC. Only present if the player has accepted the quest. */
  var acceptedTimestampMillis: js.UndefOr[String] = js.native
  /** The ID of the application this quest is part of. */
  var applicationId: js.UndefOr[String] = js.native
  /** The banner image URL for the quest. */
  var bannerUrl: js.UndefOr[String] = js.native
  /** The description of the quest. */
  var description: js.UndefOr[String] = js.native
  /** The timestamp at which the quest ceases to be active in milliseconds since the epoch in UTC. */
  var endTimestampMillis: js.UndefOr[String] = js.native
  /** The icon image URL for the quest. */
  var iconUrl: js.UndefOr[String] = js.native
  /** The ID of the quest. */
  var id: js.UndefOr[String] = js.native
  /** Indicates whether the banner image being returned is a default image, or is game-provided. */
  var isDefaultBannerUrl: js.UndefOr[Boolean] = js.native
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isDefaultIconUrl: js.UndefOr[Boolean] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#quest. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp at which the quest was last updated by the user in milliseconds since the epoch in UTC. Only present if the player has accepted the
    * quest.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
  /** The quest milestones. */
  var milestones: js.UndefOr[js.Array[QuestMilestone]] = js.native
  /** The name of the quest. */
  var name: js.UndefOr[String] = js.native
  /** The timestamp at which the user should be notified that the quest will end soon in milliseconds since the epoch in UTC. */
  var notifyTimestampMillis: js.UndefOr[String] = js.native
  /** The timestamp at which the quest becomes active in milliseconds since the epoch in UTC. */
  var startTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The state of the quest.
    * Possible values are:
    * - "UPCOMING": The quest is upcoming. The user can see the quest, but cannot accept it until it is open.
    * - "OPEN": The quest is currently open and may be accepted at this time.
    * - "ACCEPTED": The user is currently participating in this quest.
    * - "COMPLETED": The user has completed the quest.
    * - "FAILED": The quest was attempted but was not completed before the deadline expired.
    * - "EXPIRED": The quest has expired and was not accepted.
    * - "DELETED": The quest should be deleted from the local database.
    */
  var state: js.UndefOr[String] = js.native
}

object Quest {
  @scala.inline
  def apply(): Quest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quest]
  }
  @scala.inline
  implicit class QuestOps[Self <: Quest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerUrl")(js.undefined)
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
    def withEndTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
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
    def withIsDefaultBannerUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultBannerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultBannerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultBannerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultIconUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultIconUrl")(js.undefined)
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
    def withLastUpdatedTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestones(value: js.Array[QuestMilestone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestones")(js.undefined)
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
    def withNotifyTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}


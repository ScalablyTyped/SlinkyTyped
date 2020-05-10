package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityHistoryItem extends Entity {
  /**
    * Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime and
    * lastActiveDateTime.
    */
  var activeDurationSeconds: js.UndefOr[Double] = js.native
  // Optional. NavigationProperty/Containment; navigation property to the associated activity.
  var activity: js.UndefOr[UserActivity] = js.native
  // Set by the server. DateTime in UTC when the object was created on the server.
  var createdDateTime: js.UndefOr[String] = js.native
  // Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
  var expirationDateTime: js.UndefOr[String] = js.native
  /**
    * Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if null,
    * historyItem status should be Ongoing.
    */
  var lastActiveDateTime: js.UndefOr[String] = js.native
  // Set by the server. DateTime in UTC when the object was modified on the server.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
  var startedDateTime: js.UndefOr[String] = js.native
  // Set by the server. A status code used to identify valid objects. Values: active, updated, deleted, ignored.
  var status: js.UndefOr[Status] = js.native
  /**
    * Optional. The timezone in which the user's device used to generate the activity was located at activity creation time.
    * Values supplied as Olson IDs in order to support cross-platform representation.
    */
  var userTimezone: js.UndefOr[String] = js.native
}

object ActivityHistoryItem {
  @scala.inline
  def apply(): ActivityHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityHistoryItem]
  }
  @scala.inline
  implicit class ActivityHistoryItemOps[Self <: ActivityHistoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDurationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withActivity(value: UserActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(js.undefined)
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
    def withLastActiveDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActiveDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastActiveDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActiveDateTime")(js.undefined)
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
    def withStartedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedDateTime")(js.undefined)
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
  }
  
}


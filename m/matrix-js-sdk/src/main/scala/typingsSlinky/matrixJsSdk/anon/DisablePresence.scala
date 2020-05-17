package typingsSlinky.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisablePresence extends js.Object {
  // <optional> The filter to apply to /sync calls. This will override the opts.initialSyncLimit, which would normally result in a timeline limit filter.
  var disablePresence: js.UndefOr[Boolean] = js.native
  // <optional> The number of milliseconds to wait on /sync. Default: 30000 (30 seconds).
  var filter: js.UndefOr[typingsSlinky.matrixJsSdk.mod.Filter] = js.native
  // <optional> The event limit= to apply to initial sync. Default: 8.
  var includeArchivedRooms: js.UndefOr[Boolean] = js.native
  var initialSyncLimit: js.UndefOr[Double] = js.native
  // <optional> True to perform syncing without automatically updating presence.
  var lazyLoadMembers: js.UndefOr[Boolean] = js.native
  // <optional> True to do /profile requests on every invite event if the displayname/avatar_url is not known for this user ID. Default: false.
  var pendingEventOrdering: js.UndefOr[String] = js.native
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline when the call to sendEvent
  var pollTimeout: js.UndefOr[Double] = js.native
  // <optional> True to put archived=true on the /initialSync request. Default: false.
  var resolveInvitesToProfiles: js.UndefOr[Boolean] = js.native
}

object DisablePresence {
  @scala.inline
  def apply(): DisablePresence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisablePresence]
  }
  @scala.inline
  implicit class DisablePresenceOps[Self <: DisablePresence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisablePresence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePresence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePresence")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: typingsSlinky.matrixJsSdk.mod.Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeArchivedRooms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeArchivedRooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeArchivedRooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeArchivedRooms")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSyncLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSyncLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSyncLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSyncLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoadMembers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoadMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoadMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoadMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingEventOrdering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingEventOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingEventOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingEventOrdering")(js.undefined)
        ret
    }
    @scala.inline
    def withPollTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveInvitesToProfiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveInvitesToProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveInvitesToProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveInvitesToProfiles")(js.undefined)
        ret
    }
  }
  
}


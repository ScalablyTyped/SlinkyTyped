package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouderrorreporting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var events: EventsResource = js.native
  var groupStats: GroupStatsResource = js.native
  var groups: GroupsResource = js.native
  /** Deletes all error events of a given project. */
  def deleteEvents(request: AnonAlt): Request_[js.Object] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    deleteEvents: AnonAlt => Request_[js.Object],
    events: EventsResource,
    groupStats: GroupStatsResource,
    groups: GroupsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(deleteEvents = js.Any.fromFunction1(deleteEvents), events = events.asInstanceOf[js.Any], groupStats = groupStats.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteEvents(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: EventsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupStats(value: GroupStatsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: GroupsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


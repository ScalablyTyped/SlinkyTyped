package typingsSlinky.gapiClientPlus.gapi.client.plus

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPlus.AnonActivityId
import typingsSlinky.gapiClientPlus.AnonAlt
import typingsSlinky.gapiClientPlus.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: AnonActivityId): Request_[Activity] = js.native
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: AnonAlt): Request_[ActivityFeed] = js.native
  /** Search public activities. */
  def search(request: AnonFields): Request_[ActivityFeed] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: AnonActivityId => Request_[Activity],
    list: AnonAlt => Request_[ActivityFeed],
    search: AnonFields => Request_[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ActivitiesResource]
  }
  @scala.inline
  implicit class ActivitiesResourceOps[Self <: ActivitiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonActivityId => Request_[Activity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ActivityFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonFields => Request_[ActivityFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


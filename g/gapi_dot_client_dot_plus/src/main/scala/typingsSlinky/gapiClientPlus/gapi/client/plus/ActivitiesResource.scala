package typingsSlinky.gapiClientPlus.gapi.client.plus

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlus.anon.ActivityId
import typingsSlinky.gapiClientPlus.anon.Alt
import typingsSlinky.gapiClientPlus.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: ActivityId): Request[Activity] = js.native
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: Alt): Request[ActivityFeed] = js.native
  /** Search public activities. */
  def search(request: Fields): Request[ActivityFeed] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: ActivityId => Request[Activity],
    list: Alt => Request[ActivityFeed],
    search: Fields => Request[ActivityFeed]
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
    def withGet(value: ActivityId => Request[Activity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[ActivityFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: Fields => Request[ActivityFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


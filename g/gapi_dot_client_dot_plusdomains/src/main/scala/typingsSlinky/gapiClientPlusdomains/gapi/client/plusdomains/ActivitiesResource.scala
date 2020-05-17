package typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPlusdomains.anon.ActivityId
import typingsSlinky.gapiClientPlusdomains.anon.Alt
import typingsSlinky.gapiClientPlusdomains.anon.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: ActivityId): Request[Activity] = js.native
  /** Create a new activity for the authenticated user. */
  def insert(request: Alt): Request[Activity] = js.native
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: Collection): Request[ActivityFeed] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: ActivityId => Request[Activity],
    insert: Alt => Request[Activity],
    list: Collection => Request[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
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
    def withInsert(value: Alt => Request[Activity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Collection => Request[ActivityFeed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


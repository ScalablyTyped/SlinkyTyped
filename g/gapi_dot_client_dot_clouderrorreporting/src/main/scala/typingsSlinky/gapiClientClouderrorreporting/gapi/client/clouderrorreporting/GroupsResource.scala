package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientClouderrorreporting.anon.Bearertoken
import typingsSlinky.gapiClientClouderrorreporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: Bearertoken): Request[ErrorGroup] = js.native
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: Callback): Request[ErrorGroup] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(get: Bearertoken => Request[ErrorGroup], update: Callback => Request[ErrorGroup]): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
  @scala.inline
  implicit class GroupsResourceOps[Self <: GroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Bearertoken => Request[ErrorGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Callback => Request[ErrorGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


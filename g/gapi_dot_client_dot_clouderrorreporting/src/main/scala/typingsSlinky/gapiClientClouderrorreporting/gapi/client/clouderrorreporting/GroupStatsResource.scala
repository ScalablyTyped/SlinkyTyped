package typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClouderrorreporting.AnonAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupStatsResource extends js.Object {
  /** Lists the specified groups. */
  def list(request: AnonAlignment): Request_[ListGroupStatsResponse] = js.native
}

object GroupStatsResource {
  @scala.inline
  def apply(list: AnonAlignment => Request_[ListGroupStatsResponse]): GroupStatsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GroupStatsResource]
  }
  @scala.inline
  implicit class GroupStatsResourceOps[Self <: GroupStatsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAlignment => Request_[ListGroupStatsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


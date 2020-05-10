package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepoStatusChangedEvent extends js.Object {
  var path: String = js.native
  /**
    *  This value can be passed to ::isStatusModified or ::isStatusNew to get more
    *  information.
    */
  var pathStatus: Double = js.native
}

object RepoStatusChangedEvent {
  @scala.inline
  def apply(path: String, pathStatus: Double): RepoStatusChangedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathStatus = pathStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoStatusChangedEvent]
  }
  @scala.inline
  implicit class RepoStatusChangedEventOps[Self <: RepoStatusChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


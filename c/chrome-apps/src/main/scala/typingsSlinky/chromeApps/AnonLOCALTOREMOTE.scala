package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.local_to_remote_
import typingsSlinky.chromeApps.chromeAppsStrings.remote_to_local_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLOCALTOREMOTE extends js.Object {
  var LOCAL_TO_REMOTE: local_to_remote_ = js.native
  var REMOTE_TO_LOCAL: remote_to_local_ = js.native
}

object AnonLOCALTOREMOTE {
  @scala.inline
  def apply(LOCAL_TO_REMOTE: local_to_remote_, REMOTE_TO_LOCAL: remote_to_local_): AnonLOCALTOREMOTE = {
    val __obj = js.Dynamic.literal(LOCAL_TO_REMOTE = LOCAL_TO_REMOTE.asInstanceOf[js.Any], REMOTE_TO_LOCAL = REMOTE_TO_LOCAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLOCALTOREMOTE]
  }
  @scala.inline
  implicit class AnonLOCALTOREMOTEOps[Self <: AnonLOCALTOREMOTE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLOCAL_TO_REMOTE(value: local_to_remote_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCAL_TO_REMOTE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREMOTE_TO_LOCAL(value: remote_to_local_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REMOTE_TO_LOCAL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNetworkMode extends js.Object {
  var NetworkMode: String = js.native
}

object AnonNetworkMode {
  @scala.inline
  def apply(NetworkMode: String): AnonNetworkMode = {
    val __obj = js.Dynamic.literal(NetworkMode = NetworkMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNetworkMode]
  }
  @scala.inline
  implicit class AnonNetworkModeOps[Self <: AnonNetworkMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


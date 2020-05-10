package typingsSlinky.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemote extends js.Object {
  var remote: String = js.native
  var supplied: String = js.native
}

object AnonRemote {
  @scala.inline
  def apply(remote: String, supplied: String): AnonRemote = {
    val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any], supplied = supplied.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemote]
  }
  @scala.inline
  implicit class AnonRemoteOps[Self <: AnonRemote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupplied(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplied")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


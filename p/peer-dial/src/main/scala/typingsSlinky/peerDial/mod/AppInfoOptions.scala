package typingsSlinky.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppInfoOptions extends js.Object {
  var allowStop: String = js.native
}

object AppInfoOptions {
  @scala.inline
  def apply(allowStop: String): AppInfoOptions = {
    val __obj = js.Dynamic.literal(allowStop = allowStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInfoOptions]
  }
  @scala.inline
  implicit class AppInfoOptionsOps[Self <: AppInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowStop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowStop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


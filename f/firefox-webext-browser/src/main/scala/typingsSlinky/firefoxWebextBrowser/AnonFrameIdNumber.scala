package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFrameIdNumber extends js.Object {
  /** Send a message to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.native
}

object AnonFrameIdNumber {
  @scala.inline
  def apply(): AnonFrameIdNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFrameIdNumber]
  }
  @scala.inline
  implicit class AnonFrameIdNumberOps[Self <: AnonFrameIdNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameId")(js.undefined)
        ret
    }
  }
  
}


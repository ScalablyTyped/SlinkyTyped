package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameIdName extends js.Object {
  /** Open a port to a specific frame identified by `frameId` instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.native
  /** Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.native
}

object FrameIdName {
  @scala.inline
  def apply(): FrameIdName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameIdName]
  }
  @scala.inline
  implicit class FrameIdNameOps[Self <: FrameIdName] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}


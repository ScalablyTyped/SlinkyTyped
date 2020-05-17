package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameId extends js.Object {
  /** The ID of the frame in the given tab. */
  var frameId: Double = js.native
  /** The ID of the process runs the renderer for this tab. */
  var processId: js.UndefOr[Double] = js.native
  /** The ID of the tab in which the frame is. */
  var tabId: Double = js.native
}

object FrameId {
  @scala.inline
  def apply(frameId: Double, tabId: Double): FrameId = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameId]
  }
  @scala.inline
  implicit class FrameIdOps[Self <: FrameId] (val x: Self) extends AnyVal {
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
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processId")(js.undefined)
        ret
    }
  }
  
}


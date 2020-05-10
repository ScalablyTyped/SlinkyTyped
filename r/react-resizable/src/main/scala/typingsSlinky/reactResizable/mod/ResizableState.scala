package typingsSlinky.reactResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableState extends js.Object {
  var height: Double = js.native
  var resizing: Boolean = js.native
  var slackH: Double = js.native
  var slackW: Double = js.native
  var width: Double = js.native
}

object ResizableState {
  @scala.inline
  def apply(height: Double, resizing: Boolean, slackH: Double, slackW: Double, width: Double): ResizableState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], slackH = slackH.asInstanceOf[js.Any], slackW = slackW.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableState]
  }
  @scala.inline
  implicit class ResizableStateOps[Self <: ResizableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlackH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slackH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlackW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slackW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


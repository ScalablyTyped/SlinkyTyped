package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseControlProps extends js.Object {
  var captureClick: js.UndefOr[Boolean] = js.native
  var captureDoubleClick: js.UndefOr[Boolean] = js.native
  var captureDrag: js.UndefOr[Boolean] = js.native
  var captureScroll: js.UndefOr[Boolean] = js.native
}

object BaseControlProps {
  @scala.inline
  def apply(): BaseControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseControlProps]
  }
  @scala.inline
  implicit class BaseControlPropsOps[Self <: BaseControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureDoubleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDoubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureScroll")(js.undefined)
        ret
    }
  }
  
}


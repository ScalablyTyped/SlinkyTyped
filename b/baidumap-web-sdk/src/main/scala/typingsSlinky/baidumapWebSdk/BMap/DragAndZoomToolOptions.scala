package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragAndZoomToolOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.native
  var followText: js.UndefOr[String] = js.native
  var zoomType: js.UndefOr[ZoomType] = js.native
}

object DragAndZoomToolOptions {
  @scala.inline
  def apply(): DragAndZoomToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndZoomToolOptions]
  }
  @scala.inline
  implicit class DragAndZoomToolOptionsOps[Self <: DragAndZoomToolOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followText")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomType(value: ZoomType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomType")(js.undefined)
        ret
    }
  }
  
}


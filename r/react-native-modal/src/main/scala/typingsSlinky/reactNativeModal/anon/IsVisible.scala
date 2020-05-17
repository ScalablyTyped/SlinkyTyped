package typingsSlinky.reactNativeModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsVisible extends js.Object {
  var isVisible: Boolean = js.native
  var showContent: Boolean = js.native
}

object IsVisible {
  @scala.inline
  def apply(isVisible: Boolean, showContent: Boolean): IsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVisible]
  }
  @scala.inline
  implicit class IsVisibleOps[Self <: IsVisible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


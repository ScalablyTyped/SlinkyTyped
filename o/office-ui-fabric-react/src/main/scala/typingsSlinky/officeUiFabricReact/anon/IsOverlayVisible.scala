package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsOverlayVisible extends js.Object {
  var isOverlayVisible: Boolean = js.native
}

object IsOverlayVisible {
  @scala.inline
  def apply(isOverlayVisible: Boolean): IsOverlayVisible = {
    val __obj = js.Dynamic.literal(isOverlayVisible = isOverlayVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOverlayVisible]
  }
  @scala.inline
  implicit class IsOverlayVisibleOps[Self <: IsOverlayVisible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOverlayVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverlayVisible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


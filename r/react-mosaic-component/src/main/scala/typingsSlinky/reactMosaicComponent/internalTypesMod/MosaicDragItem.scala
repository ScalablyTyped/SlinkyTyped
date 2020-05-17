package typingsSlinky.reactMosaicComponent.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicDragItem extends js.Object {
  var hideTimer: Double = js.native
  var mosaicId: String = js.native
}

object MosaicDragItem {
  @scala.inline
  def apply(hideTimer: Double, mosaicId: String): MosaicDragItem = {
    val __obj = js.Dynamic.literal(hideTimer = hideTimer.asInstanceOf[js.Any], mosaicId = mosaicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicDragItem]
  }
  @scala.inline
  implicit class MosaicDragItemOps[Self <: MosaicDragItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMosaicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mosaicId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.jqueryUiLayout.JQueryUILayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneState extends js.Object {
  var isClosed: Boolean = js.native
  var isHidden: Boolean = js.native
  var isResizing: Boolean = js.native
  var isSliding: Boolean = js.native
  var maxSize: Double = js.native
  var minSize: Double = js.native
  var noRoom: Boolean = js.native
  var size: Double = js.native
}

object PaneState {
  @scala.inline
  def apply(
    isClosed: Boolean,
    isHidden: Boolean,
    isResizing: Boolean,
    isSliding: Boolean,
    maxSize: Double,
    minSize: Double,
    noRoom: Boolean,
    size: Double
  ): PaneState = {
    val __obj = js.Dynamic.literal(isClosed = isClosed.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSliding = isSliding.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], noRoom = noRoom.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneState]
  }
  @scala.inline
  implicit class PaneStateOps[Self <: PaneState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSliding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSliding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoRoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


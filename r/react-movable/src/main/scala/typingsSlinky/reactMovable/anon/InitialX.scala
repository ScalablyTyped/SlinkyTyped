package typingsSlinky.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialX extends js.Object {
  var initialX: Double = js.native
  var initialY: Double = js.native
  var itemDragged: Double = js.native
  var itemDraggedOutOfBounds: Double = js.native
  var liveText: String = js.native
  var scrollWindow: Boolean = js.native
  var scrollingSpeed: Double = js.native
  var selectedItem: Double = js.native
  var targetHeight: Double = js.native
  var targetWidth: Double = js.native
  var targetX: Double = js.native
  var targetY: Double = js.native
}

object InitialX {
  @scala.inline
  def apply(
    initialX: Double,
    initialY: Double,
    itemDragged: Double,
    itemDraggedOutOfBounds: Double,
    liveText: String,
    scrollWindow: Boolean,
    scrollingSpeed: Double,
    selectedItem: Double,
    targetHeight: Double,
    targetWidth: Double,
    targetX: Double,
    targetY: Double
  ): InitialX = {
    val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], itemDragged = itemDragged.asInstanceOf[js.Any], itemDraggedOutOfBounds = itemDraggedOutOfBounds.asInstanceOf[js.Any], liveText = liveText.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any], targetX = targetX.asInstanceOf[js.Any], targetY = targetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialX]
  }
  @scala.inline
  implicit class InitialXOps[Self <: InitialX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDragged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemDraggedOutOfBounds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDraggedOutOfBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiveText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollingSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


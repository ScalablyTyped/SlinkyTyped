package typingsSlinky.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait POSITIONS_TYPES extends js.Object {
  var bottom: BOTTOM = js.native
  var bottomCenter: BOTTOM_CENTER = js.native
  var bottomLeft: BOTTOM_LEFT_POSITION = js.native
  var bottomRight: BOTTOM_RIGHT_POSITION = js.native
  var top: TOP = js.native
  var topCenter: TOP_CENTER = js.native
  var topLeft: TOP_LEFT_POSITION = js.native
  var topRight: TOP_RIGHT_POSITION = js.native
}

object POSITIONS_TYPES {
  @scala.inline
  def apply(
    bottom: BOTTOM,
    bottomCenter: BOTTOM_CENTER,
    bottomLeft: BOTTOM_LEFT_POSITION,
    bottomRight: BOTTOM_RIGHT_POSITION,
    top: TOP,
    topCenter: TOP_CENTER,
    topLeft: TOP_LEFT_POSITION,
    topRight: TOP_RIGHT_POSITION
  ): POSITIONS_TYPES = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomCenter = bottomCenter.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSITIONS_TYPES]
  }
  @scala.inline
  implicit class POSITIONS_TYPESOps[Self <: POSITIONS_TYPES] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: BOTTOM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomCenter(value: BOTTOM_CENTER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomLeft(value: BOTTOM_LEFT_POSITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomRight(value: BOTTOM_RIGHT_POSITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: TOP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopCenter(value: TOP_CENTER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopLeft(value: TOP_LEFT_POSITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopRight(value: TOP_RIGHT_POSITION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


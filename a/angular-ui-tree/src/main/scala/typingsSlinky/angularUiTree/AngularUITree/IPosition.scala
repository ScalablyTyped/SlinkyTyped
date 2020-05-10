package typingsSlinky.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPosition extends js.Object {
  var dirAx: Double = js.native
  var dirX: Double = js.native
  var dirY: Double = js.native
  var distAxX: Double = js.native
  var distAxY: Double = js.native
  var distX: Double = js.native
  var distY: Double = js.native
  var lastDirX: Double = js.native
  var lastDirY: Double = js.native
  var lastX: Double = js.native
  var lastY: Double = js.native
  var moving: Boolean = js.native
  var nowX: Double = js.native
  var nowY: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var startX: Double = js.native
  var startY: Double = js.native
}

object IPosition {
  @scala.inline
  def apply(
    dirAx: Double,
    dirX: Double,
    dirY: Double,
    distAxX: Double,
    distAxY: Double,
    distX: Double,
    distY: Double,
    lastDirX: Double,
    lastDirY: Double,
    lastX: Double,
    lastY: Double,
    moving: Boolean,
    nowX: Double,
    nowY: Double,
    offsetX: Double,
    offsetY: Double,
    startX: Double,
    startY: Double
  ): IPosition = {
    val __obj = js.Dynamic.literal(dirAx = dirAx.asInstanceOf[js.Any], dirX = dirX.asInstanceOf[js.Any], dirY = dirY.asInstanceOf[js.Any], distAxX = distAxX.asInstanceOf[js.Any], distAxY = distAxY.asInstanceOf[js.Any], distX = distX.asInstanceOf[js.Any], distY = distY.asInstanceOf[js.Any], lastDirX = lastDirX.asInstanceOf[js.Any], lastDirY = lastDirY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], nowX = nowX.asInstanceOf[js.Any], nowY = nowY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPosition]
  }
  @scala.inline
  implicit class IPositionOps[Self <: IPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirAx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirAx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistAxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distAxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistAxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distAxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastDirX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDirX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastDirY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDirY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNowX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNowY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


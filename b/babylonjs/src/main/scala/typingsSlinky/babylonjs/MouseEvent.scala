package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEvent extends js.Object {
  var mozMovementX: Double = js.native
  var mozMovementY: Double = js.native
  var msMovementX: Double = js.native
  var msMovementY: Double = js.native
  var webkitMovementX: Double = js.native
  var webkitMovementY: Double = js.native
}

object MouseEvent {
  @scala.inline
  def apply(
    mozMovementX: Double,
    mozMovementY: Double,
    msMovementX: Double,
    msMovementY: Double,
    webkitMovementX: Double,
    webkitMovementY: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(mozMovementX = mozMovementX.asInstanceOf[js.Any], mozMovementY = mozMovementY.asInstanceOf[js.Any], msMovementX = msMovementX.asInstanceOf[js.Any], msMovementY = msMovementY.asInstanceOf[js.Any], webkitMovementX = webkitMovementX.asInstanceOf[js.Any], webkitMovementY = webkitMovementY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  @scala.inline
  implicit class MouseEventOps[Self <: MouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMozMovementX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozMovementX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMozMovementY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozMovementY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsMovementX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMovementX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsMovementY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msMovementY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkitMovementX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMovementX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkitMovementY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMovementY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


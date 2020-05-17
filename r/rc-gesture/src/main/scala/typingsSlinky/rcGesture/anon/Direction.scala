package typingsSlinky.rcGesture.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var direction: String = js.native
  var enablePinch: Boolean = js.native
  var enableRotate: Boolean = js.native
}

object Direction {
  @scala.inline
  def apply(direction: String, enablePinch: Boolean, enableRotate: Boolean): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enablePinch = enablePinch.asInstanceOf[js.Any], enableRotate = enableRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePinch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePinch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRotate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


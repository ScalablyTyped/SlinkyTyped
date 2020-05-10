package typingsSlinky.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeConfig extends js.Object {
  var directionalOffsetThreshold: js.UndefOr[Double] = js.native
  var velocityThreshold: js.UndefOr[Double] = js.native
}

object SwipeConfig {
  @scala.inline
  def apply(): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeConfig]
  }
  @scala.inline
  implicit class SwipeConfigOps[Self <: SwipeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectionalOffsetThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalOffsetThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalOffsetThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalOffsetThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityThreshold")(js.undefined)
        ret
    }
  }
  
}


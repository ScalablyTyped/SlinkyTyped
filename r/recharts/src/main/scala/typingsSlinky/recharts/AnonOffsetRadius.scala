package typingsSlinky.recharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOffsetRadius extends js.Object {
  var offsetRadius: Double = js.native
}

object AnonOffsetRadius {
  @scala.inline
  def apply(offsetRadius: Double): AnonOffsetRadius = {
    val __obj = js.Dynamic.literal(offsetRadius = offsetRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffsetRadius]
  }
  @scala.inline
  implicit class AnonOffsetRadiusOps[Self <: AnonOffsetRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffsetRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


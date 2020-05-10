package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBottomRight extends js.Object {
  var BottomRight: AnonLongitude = js.native
  var TopLeft: AnonLongitude = js.native
}

object AnonBottomRight {
  @scala.inline
  def apply(BottomRight: AnonLongitude, TopLeft: AnonLongitude): AnonBottomRight = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomRight]
  }
  @scala.inline
  implicit class AnonBottomRightOps[Self <: AnonBottomRight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomRight(value: AnonLongitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopLeft(value: AnonLongitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopLeft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


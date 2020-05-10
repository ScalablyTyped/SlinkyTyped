package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndPosition extends js.Object {
  var endPosition: Cartesian2 = js.native
  var startPosition: Cartesian2 = js.native
}

object AnonEndPosition {
  @scala.inline
  def apply(endPosition: Cartesian2, startPosition: Cartesian2): AnonEndPosition = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndPosition]
  }
  @scala.inline
  implicit class AnonEndPositionOps[Self <: AnonEndPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPosition(value: Cartesian2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPosition(value: Cartesian2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


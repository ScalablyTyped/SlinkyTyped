package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxCellPosition extends js.Object {
  var qx: Double = js.native
  var qy: Double = js.native
}

object NxCellPosition {
  @scala.inline
  def apply(qx: Double, qy: Double): NxCellPosition = {
    val __obj = js.Dynamic.literal(qx = qx.asInstanceOf[js.Any], qy = qy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCellPosition]
  }
  @scala.inline
  implicit class NxCellPositionOps[Self <: NxCellPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


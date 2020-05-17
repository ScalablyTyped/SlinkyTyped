package typingsSlinky.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GRD extends js.Object {
  var GRD: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
}

object GRD {
  @scala.inline
  def apply(GRD: js.Array[String], JPY: js.Array[String], THB: js.Array[String]): GRD = {
    val __obj = js.Dynamic.literal(GRD = GRD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRD]
  }
  @scala.inline
  implicit class GRDOps[Self <: GRD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGRD(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJPY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHB(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


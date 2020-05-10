package typingsSlinky.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAxis1 extends js.Object {
  var axis1: js.Any = js.native
  var axis2: js.Any = js.native
  var dimension: js.Any = js.native
  var origin: Double = js.native
}

object AnonAxis1 {
  @scala.inline
  def apply(axis1: js.Any, axis2: js.Any, dimension: js.Any, origin: Double): AnonAxis1 = {
    val __obj = js.Dynamic.literal(axis1 = axis1.asInstanceOf[js.Any], axis2 = axis2.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxis1]
  }
  @scala.inline
  implicit class AnonAxis1Ops[Self <: AnonAxis1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxis2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimension(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


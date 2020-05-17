package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position1 extends js.Object {
  var position1: Cartesian2 = js.native
  var position2: Cartesian2 = js.native
}

object Position1 {
  @scala.inline
  def apply(position1: Cartesian2, position2: Cartesian2): Position1 = {
    val __obj = js.Dynamic.literal(position1 = position1.asInstanceOf[js.Any], position2 = position2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position1]
  }
  @scala.inline
  implicit class Position1Ops[Self <: Position1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition1(value: Cartesian2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition2(value: Cartesian2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


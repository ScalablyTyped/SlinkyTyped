package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maximum extends js.Object {
  var maximum: Vector3 = js.native
  var minimum: Vector3 = js.native
}

object Maximum {
  @scala.inline
  def apply(maximum: Vector3, minimum: Vector3): Maximum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maximum]
  }
  @scala.inline
  implicit class MaximumOps[Self <: Maximum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximum(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


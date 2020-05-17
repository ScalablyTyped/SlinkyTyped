package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Minimum extends js.Object {
  var maximum: Vector3 = js.native
  var minimum: Vector3 = js.native
}

object Minimum {
  @scala.inline
  def apply(maximum: Vector3, minimum: Vector3): Minimum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minimum]
  }
  @scala.inline
  implicit class MinimumOps[Self <: Minimum] (val x: Self) extends AnyVal {
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


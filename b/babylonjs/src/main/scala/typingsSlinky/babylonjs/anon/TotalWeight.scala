package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Matrix
import typingsSlinky.babylonjs.BABYLON.RuntimeAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalWeight extends js.Object {
  var animations: js.Array[RuntimeAnimation] = js.native
  var originalValue: Matrix = js.native
  var totalWeight: Double = js.native
}

object TotalWeight {
  @scala.inline
  def apply(animations: js.Array[RuntimeAnimation], originalValue: Matrix, totalWeight: Double): TotalWeight = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalWeight]
  }
  @scala.inline
  implicit class TotalWeightOps[Self <: TotalWeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: js.Array[RuntimeAnimation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalValue(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalWeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


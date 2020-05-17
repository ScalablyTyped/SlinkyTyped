package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Angle extends js.Object {
  var _radians: js.Any = js.native
  /**
    * Get value in degrees
    * @returns the Angle value in degrees (float)
    */
  def degrees(): Double = js.native
  /**
    * Get value in radians
    * @returns the Angle value in radians (float)
    */
  def radians(): Double = js.native
}

object Angle {
  @scala.inline
  def apply(_radians: js.Any, degrees: () => Double, radians: () => Double): Angle = {
    val __obj = js.Dynamic.literal(_radians = _radians.asInstanceOf[js.Any], degrees = js.Any.fromFunction0(degrees), radians = js.Any.fromFunction0(radians))
    __obj.asInstanceOf[Angle]
  }
  @scala.inline
  implicit class AngleOps[Self <: Angle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_radians(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_radians")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDegrees(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRadians(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radians")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


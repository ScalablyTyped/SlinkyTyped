package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationRange extends js.Object {
  /**The starting frame of the animation */
  var from: Double = js.native
  /**The name of the animation range**/
  var name: String = js.native
  /**The ending frame of the animation*/
  var to: Double = js.native
}

object AnimationRange {
  @scala.inline
  def apply(from: Double, name: String, to: Double): AnimationRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationRange]
  }
  @scala.inline
  implicit class AnimationRangeOps[Self <: AnimationRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


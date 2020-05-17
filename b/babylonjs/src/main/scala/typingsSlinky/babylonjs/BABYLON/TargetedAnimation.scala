package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetedAnimation extends js.Object {
  /**
    * Animation to perform
    */
  var animation: Animation = js.native
  /**
    * Target to animate
    */
  var target: js.Any = js.native
  /**
    * Serialize the object
    * @returns the JSON object representing the current entity
    */
  def serialize(): js.Any = js.native
}

object TargetedAnimation {
  @scala.inline
  def apply(animation: Animation, serialize: () => js.Any, target: js.Any): TargetedAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedAnimation]
  }
  @scala.inline
  implicit class TargetedAnimationOps[Self <: TargetedAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


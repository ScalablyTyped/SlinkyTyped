package typingsSlinky.babylonjs.animatableInterfaceMod

import typingsSlinky.babylonjs.animationMod.Animation
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimatable extends js.Object {
  /**
    * Array of animations
    */
  var animations: Nullable[js.Array[Animation]] = js.native
}

object IAnimatable {
  @scala.inline
  def apply(): IAnimatable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimatable]
  }
  @scala.inline
  implicit class IAnimatableOps[Self <: IAnimatable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: Nullable[js.Array[Animation]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(null)
        ret
    }
  }
  
}


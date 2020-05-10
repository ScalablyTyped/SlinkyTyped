package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.collapseMod.AnimationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationState extends js.Object {
  var animationState: AnimationStates = js.native
  var height: js.UndefOr[scala.Nothing] = js.native
}

object AnonAnimationState {
  @scala.inline
  def apply(animationState: AnimationStates): AnonAnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationState]
  }
  @scala.inline
  implicit class AnonAnimationStateOps[Self <: AnonAnimationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationState(value: AnimationStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
  }
  
}


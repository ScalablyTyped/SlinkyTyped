package typingsSlinky.ionicCore.transitionMod

import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionResult extends js.Object {
  var animation: js.UndefOr[Animation | typingsSlinky.ionicCore.animationInterfaceMod.Animation] = js.native
  var hasCompleted: Boolean = js.native
}

object TransitionResult {
  @scala.inline
  def apply(hasCompleted: Boolean): TransitionResult = {
    val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionResult]
  }
  @scala.inline
  implicit class TransitionResultOps[Self <: TransitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: Animation | typingsSlinky.ionicCore.animationInterfaceMod.Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
  }
  
}


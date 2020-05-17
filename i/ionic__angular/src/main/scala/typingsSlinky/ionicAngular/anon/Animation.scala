package typingsSlinky.ionicAngular.anon

import typingsSlinky.ionicAngular.ionicAngularStrings.back
import typingsSlinky.ionicAngular.ionicAngularStrings.forward
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var animation: js.UndefOr[forward | back] = js.native
  var direction: RouterDirection = js.native
}

object Animation {
  @scala.inline
  def apply(direction: RouterDirection): Animation = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: RouterDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: forward | back): Self = {
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


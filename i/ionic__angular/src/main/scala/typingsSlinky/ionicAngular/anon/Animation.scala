package typingsSlinky.ionicAngular.anon

import typingsSlinky.ionicAngular.ionicAngularStrings.back
import typingsSlinky.ionicAngular.ionicAngularStrings.forward
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var animation: js.UndefOr[forward | back] = js.undefined
  var direction: RouterDirection
}

object Animation {
  @scala.inline
  def apply(direction: RouterDirection, animation: forward | back = null): Animation = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}


package typingsSlinky.ionicCore.animationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationCallbackOptions extends js.Object {
  var oneTimeCallback: Boolean = js.native
}

object AnimationCallbackOptions {
  @scala.inline
  def apply(oneTimeCallback: Boolean): AnimationCallbackOptions = {
    val __obj = js.Dynamic.literal(oneTimeCallback = oneTimeCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationCallbackOptions]
  }
  @scala.inline
  implicit class AnimationCallbackOptionsOps[Self <: AnimationCallbackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOneTimeCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneTimeCallback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


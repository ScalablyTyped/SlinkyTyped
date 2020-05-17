package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animating extends js.Object {
  var animating: Boolean = js.native
  var color: String = js.native
  var size: String = js.native
  var toast: Boolean = js.native
}

object Animating {
  @scala.inline
  def apply(animating: Boolean, color: String, size: String, toast: Boolean): Animating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animating]
  }
  @scala.inline
  implicit class AnimatingOps[Self <: Animating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimateStarted extends js.Object {
  var animateStarted: Boolean = js.native
}

object AnimateStarted {
  @scala.inline
  def apply(animateStarted: Boolean): AnimateStarted = {
    val __obj = js.Dynamic.literal(animateStarted = animateStarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateStarted]
  }
  @scala.inline
  implicit class AnimateStartedOps[Self <: AnimateStarted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateStarted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


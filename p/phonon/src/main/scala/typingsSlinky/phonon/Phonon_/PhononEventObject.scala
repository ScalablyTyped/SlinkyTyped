package typingsSlinky.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononEventObject extends js.Object {
  var animationEnd: String = js.native
  var transitionEnd: String = js.native
}

object PhononEventObject {
  @scala.inline
  def apply(animationEnd: String, transitionEnd: String): PhononEventObject = {
    val __obj = js.Dynamic.literal(animationEnd = animationEnd.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononEventObject]
  }
  @scala.inline
  implicit class PhononEventObjectOps[Self <: PhononEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


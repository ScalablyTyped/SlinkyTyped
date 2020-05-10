package typingsSlinky.ngxInfiniteScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFire extends js.Object {
  var fire: Boolean = js.native
  var scrollDown: Boolean = js.native
}

object AnonFire {
  @scala.inline
  def apply(fire: Boolean, scrollDown: Boolean): AnonFire = {
    val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFire]
  }
  @scala.inline
  implicit class AnonFireOps[Self <: AnonFire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


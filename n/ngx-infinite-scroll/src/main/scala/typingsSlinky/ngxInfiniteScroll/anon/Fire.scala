package typingsSlinky.ngxInfiniteScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fire extends js.Object {
  var fire: Boolean = js.native
  var scrollDown: Boolean = js.native
}

object Fire {
  @scala.inline
  def apply(fire: Boolean, scrollDown: Boolean): Fire = {
    val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fire]
  }
  @scala.inline
  implicit class FireOps[Self <: Fire] (val x: Self) extends AnyVal {
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


package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMouse extends js.Object {
  var useMouse: js.UndefOr[Boolean] = js.native
  var useTouch: js.UndefOr[Boolean] = js.native
}

object UseMouse {
  @scala.inline
  def apply(): UseMouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMouse]
  }
  @scala.inline
  implicit class UseMouseOps[Self <: UseMouse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTouch")(js.undefined)
        ret
    }
  }
  
}


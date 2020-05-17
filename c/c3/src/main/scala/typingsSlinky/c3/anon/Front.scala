package typingsSlinky.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Front extends js.Object {
  var front: js.UndefOr[Boolean] = js.native
}

object Front {
  @scala.inline
  def apply(): Front = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Front]
  }
  @scala.inline
  implicit class FrontOps[Self <: Front] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(js.undefined)
        ret
    }
  }
  
}


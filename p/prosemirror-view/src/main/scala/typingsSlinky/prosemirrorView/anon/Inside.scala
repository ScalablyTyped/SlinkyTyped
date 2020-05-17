package typingsSlinky.prosemirrorView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inside extends js.Object {
  var inside: Double = js.native
  var pos: Double = js.native
}

object Inside {
  @scala.inline
  def apply(inside: Double, pos: Double): Inside = {
    val __obj = js.Dynamic.literal(inside = inside.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inside]
  }
  @scala.inline
  implicit class InsideOps[Self <: Inside] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInside(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


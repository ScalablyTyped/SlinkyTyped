package typingsSlinky.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdRev extends js.Object {
  var _id: String = js.native
  var _rev: String = js.native
}

object IdRev {
  @scala.inline
  def apply(_id: String, _rev: String): IdRev = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdRev]
  }
  @scala.inline
  implicit class IdRevOps[Self <: IdRev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


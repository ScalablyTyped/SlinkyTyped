package typingsSlinky.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWhere extends js.Object {
  var where: js.Any = js.native
}

object AnonWhere {
  @scala.inline
  def apply(where: js.Any): AnonWhere = {
    val __obj = js.Dynamic.literal(where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWhere]
  }
  @scala.inline
  implicit class AnonWhereOps[Self <: AnonWhere] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWhere(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


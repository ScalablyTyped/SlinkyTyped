package typingsSlinky.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCapSQL extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.native
}

object AnonCapSQL {
  @scala.inline
  def apply(): AnonCapSQL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCapSQL]
  }
  @scala.inline
  implicit class AnonCapSQLOps[Self <: AnonCapSQL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapSQL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSQL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapSQL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capSQL")(js.undefined)
        ret
    }
  }
  
}


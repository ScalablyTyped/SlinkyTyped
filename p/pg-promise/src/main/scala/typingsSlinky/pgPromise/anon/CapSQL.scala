package typingsSlinky.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapSQL extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.native
}

object CapSQL {
  @scala.inline
  def apply(): CapSQL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapSQL]
  }
  @scala.inline
  implicit class CapSQLOps[Self <: CapSQL] (val x: Self) extends AnyVal {
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


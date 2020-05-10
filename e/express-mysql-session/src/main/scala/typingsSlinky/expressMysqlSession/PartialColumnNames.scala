package typingsSlinky.expressMysqlSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<express-mysql-session.express-mysql-session.ColumnNames> */
@js.native
trait PartialColumnNames extends js.Object {
  var data: js.UndefOr[String] = js.native
  var expires: js.UndefOr[String] = js.native
  var session_id: js.UndefOr[String] = js.native
}

object PartialColumnNames {
  @scala.inline
  def apply(): PartialColumnNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColumnNames]
  }
  @scala.inline
  implicit class PartialColumnNamesOps[Self <: PartialColumnNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_id")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gapiClientSqladmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectQuery extends js.Object {
  /** The select query used to extract the data. */
  var selectQuery: js.UndefOr[String] = js.native
}

object SelectQuery {
  @scala.inline
  def apply(): SelectQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectQuery]
  }
  @scala.inline
  implicit class SelectQueryOps[Self <: SelectQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectQuery")(js.undefined)
        ret
    }
  }
  
}


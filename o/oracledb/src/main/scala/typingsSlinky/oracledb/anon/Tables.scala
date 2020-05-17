package typingsSlinky.oracledb.anon

import typingsSlinky.oracledb.mod.SubscriptionTables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tables extends js.Object {
  /** Array of objects specifying the queries which were affected by the Query Change notification. */
  var tables: SubscriptionTables = js.native
}

object Tables {
  @scala.inline
  def apply(tables: SubscriptionTables): Tables = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tables]
  }
  @scala.inline
  implicit class TablesOps[Self <: Tables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTables(value: SubscriptionTables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


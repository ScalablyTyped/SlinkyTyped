package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTablesOptions extends TimeoutIntervalOptions {
  var nextTableName: js.UndefOr[String] = js.native
}

object QueryTablesOptions {
  @scala.inline
  def apply(): QueryTablesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTablesOptions]
  }
  @scala.inline
  implicit class QueryTablesOptionsOps[Self <: QueryTablesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTableName")(js.undefined)
        ret
    }
  }
  
}


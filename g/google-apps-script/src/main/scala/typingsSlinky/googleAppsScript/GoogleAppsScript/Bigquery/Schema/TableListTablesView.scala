package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableListTablesView extends js.Object {
  var useLegacySql: js.UndefOr[Boolean] = js.native
}

object TableListTablesView {
  @scala.inline
  def apply(): TableListTablesView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableListTablesView]
  }
  @scala.inline
  implicit class TableListTablesViewOps[Self <: TableListTablesView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseLegacySql(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacySql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLegacySql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacySql")(js.undefined)
        ret
    }
  }
  
}


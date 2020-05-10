package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterializedViewDefinition extends js.Object {
  var lastRefreshTime: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
}

object MaterializedViewDefinition {
  @scala.inline
  def apply(): MaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterializedViewDefinition]
  }
  @scala.inline
  implicit class MaterializedViewDefinitionOps[Self <: MaterializedViewDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastRefreshTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRefreshTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshTime")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}


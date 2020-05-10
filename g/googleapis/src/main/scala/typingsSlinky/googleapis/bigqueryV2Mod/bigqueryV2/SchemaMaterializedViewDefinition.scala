package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMaterializedViewDefinition extends js.Object {
  /**
    * [Output-only] [TrustedTester] The time when this materialized view was
    * last modified, in milliseconds since the epoch.
    */
  var lastRefreshTime: js.UndefOr[String] = js.native
  /**
    * [Required] A query whose result is persisted.
    */
  var query: js.UndefOr[String] = js.native
}

object SchemaMaterializedViewDefinition {
  @scala.inline
  def apply(): SchemaMaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterializedViewDefinition]
  }
  @scala.inline
  implicit class SchemaMaterializedViewDefinitionOps[Self <: SchemaMaterializedViewDefinition] (val x: Self) extends AnyVal {
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


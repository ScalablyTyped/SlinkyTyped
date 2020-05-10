package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaViewDefinition extends js.Object {
  /**
    * [Required] A query that BigQuery executes when the view is referenced.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Specifies whether to use BigQuery&#39;s legacy SQL for this view. The
    * default value is true. If set to false, the view will use BigQuery&#39;s
    * standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries
    * and views that reference this view must use the same flag value.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  /**
    * Describes user-defined function resources used in the query.
    */
  var userDefinedFunctionResources: js.UndefOr[js.Array[SchemaUserDefinedFunctionResource]] = js.native
}

object SchemaViewDefinition {
  @scala.inline
  def apply(): SchemaViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViewDefinition]
  }
  @scala.inline
  implicit class SchemaViewDefinitionOps[Self <: SchemaViewDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withUserDefinedFunctionResources(value: js.Array[SchemaUserDefinedFunctionResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedFunctionResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedFunctionResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedFunctionResources")(js.undefined)
        ret
    }
  }
  
}


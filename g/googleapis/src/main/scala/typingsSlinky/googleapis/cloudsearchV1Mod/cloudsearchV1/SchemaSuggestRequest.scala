package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of suggest API.
  */
@js.native
trait SchemaSuggestRequest extends js.Object {
  /**
    * The sources to use for suggestions. If not specified, all data sources
    * from the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  /**
    * Partial query for the completion suggestion.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.native
}

object SchemaSuggestRequest {
  @scala.inline
  def apply(): SchemaSuggestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestRequest]
  }
  @scala.inline
  implicit class SchemaSuggestRequestOps[Self <: SchemaSuggestRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceRestrictions")(js.undefined)
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
    @scala.inline
    def withRequestOptions(value: SchemaRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(js.undefined)
        ret
    }
  }
  
}


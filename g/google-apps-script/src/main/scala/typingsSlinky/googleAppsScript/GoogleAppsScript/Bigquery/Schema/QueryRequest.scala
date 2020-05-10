package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRequest extends js.Object {
  var defaultDataset: js.UndefOr[DatasetReference] = js.native
  var dryRun: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var parameterMode: js.UndefOr[String] = js.native
  var preserveNulls: js.UndefOr[Boolean] = js.native
  var query: js.UndefOr[String] = js.native
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
  var timeoutMs: js.UndefOr[Double] = js.native
  var useLegacySql: js.UndefOr[Boolean] = js.native
  var useQueryCache: js.UndefOr[Boolean] = js.native
}

object QueryRequest {
  @scala.inline
  def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  @scala.inline
  implicit class QueryRequestOps[Self <: QueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDataset(value: DatasetReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataset")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveNulls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveNulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveNulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveNulls")(js.undefined)
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
    def withQueryParameters(value: js.Array[QueryParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMs")(js.undefined)
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
    def withUseQueryCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQueryCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseQueryCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useQueryCache")(js.undefined)
        ret
    }
  }
  
}


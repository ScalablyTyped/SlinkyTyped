package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryRequest extends js.Object {
  /**
    * [Optional] Specifies the default datasetId and projectId to assume for
    * any unqualified table names in the query. If not set, all table names in
    * the query string must be qualified in the format
    * &#39;datasetId.tableId&#39;.
    */
  var defaultDataset: js.UndefOr[SchemaDatasetReference] = js.native
  /**
    * [Optional] If set to true, BigQuery doesn&#39;t run the job. Instead, if
    * the query is valid, BigQuery returns statistics about the job such as how
    * many bytes would be processed. If the query is invalid, an error returns.
    * The default value is false.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * The resource type of the request.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The geographic location where the job should run. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * [Optional] The maximum number of rows of data to return per page of
    * results. Setting this flag to a small value such as 1000 and then paging
    * through results might improve reliability when the query result set is
    * large. In addition to this limit, responses are also limited to 10 MB. By
    * default, there is no maximum row count, and only the byte limit applies.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Standard SQL only. Set to POSITIONAL to use positional (?) query
    * parameters or to NAMED to use named (@myparam) query parameters in this
    * query.
    */
  var parameterMode: js.UndefOr[String] = js.native
  /**
    * [Deprecated] This property is deprecated.
    */
  var preserveNulls: js.UndefOr[Boolean] = js.native
  /**
    * [Required] A query string, following the BigQuery query syntax, of the
    * query to execute. Example: &quot;SELECT count(f1) FROM
    * [myProjectId:myDatasetId.myTableId]&quot;.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Query parameters for Standard SQL queries.
    */
  var queryParameters: js.UndefOr[js.Array[SchemaQueryParameter]] = js.native
  /**
    * [Optional] How long to wait for the query to complete, in milliseconds,
    * before the request times out and returns. Note that this is only a
    * timeout for the request, not the query. If the query takes longer to run
    * than the timeout value, the call returns without any results and with the
    * &#39;jobComplete&#39; flag set to false. You can call GetQueryResults()
    * to wait for the query to complete and read the results. The default value
    * is 10000 milliseconds (10 seconds).
    */
  var timeoutMs: js.UndefOr[Double] = js.native
  /**
    * Specifies whether to use BigQuery&#39;s legacy SQL dialect for this
    * query. The default value is true. If set to false, the query will use
    * BigQuery&#39;s standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set
    * to false, the value of flattenResults is ignored; query will be run as if
    * flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Whether to look for the result in the query cache. The query
    * cache is a best-effort cache that will be flushed whenever tables in the
    * query are modified. The default value is true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.native
}

object SchemaQueryRequest {
  @scala.inline
  def apply(): SchemaQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryRequest]
  }
  @scala.inline
  implicit class SchemaQueryRequestOps[Self <: SchemaQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDataset(value: SchemaDatasetReference): Self = {
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
    def withQueryParameters(value: js.Array[SchemaQueryParameter]): Self = {
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


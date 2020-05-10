package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationQuery extends js.Object {
  /**
    * [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance.
    * Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set
    * destinationTable when result size exceeds the allowed maximum response size.
    */
  var allowLargeResults: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not
    * exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The
    * default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.native
  /** [Optional] Specifies the default dataset to use for unqualified table names in the query. */
  var defaultDataset: js.UndefOr[DatasetReference] = js.native
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  /**
    * [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This
    * property must be set for large results that exceed the maximum response size.
    */
  var destinationTable: js.UndefOr[TableReference] = js.native
  /**
    * [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if
    * this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
    */
  var flattenResults: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If
    * unspecified, this will be set to your project default.
    */
  var maximumBillingTier: js.UndefOr[Double] = js.native
  /**
    * [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If
    * unspecified, this will be set to your project default.
    */
  var maximumBytesBilled: js.UndefOr[String] = js.native
  /** Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query. */
  var parameterMode: js.UndefOr[String] = js.native
  /** [Deprecated] This property is deprecated. */
  var preserveNulls: js.UndefOr[Boolean] = js.native
  /** [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE. */
  var priority: js.UndefOr[String] = js.native
  /** [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL. */
  var query: js.UndefOr[String] = js.native
  /** Query parameters for standard SQL queries. */
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
  /**
    * [Experimental] Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two
    * cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by
    * partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified:
    * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to
    * nullable.
    */
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By
    * defining these properties, the data source can then be queried as if it were a standard BigQuery table.
    */
  var tableDefinitions: js.UndefOr[Record[String, ExternalDataConfiguration]] = js.native
  /** [Experimental] If specified, configures time-based partitioning for the destination table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  /**
    * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's
    * standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be
    * run as if flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query
    * are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.native
  /** Describes user-defined function resources used in the query. */
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.native
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table
    * already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery
    * appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The
    * default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and
    * append actions occur as one atomic update upon job completion.
    */
  var writeDisposition: js.UndefOr[String] = js.native
}

object JobConfigurationQuery {
  @scala.inline
  def apply(): JobConfigurationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationQuery]
  }
  @scala.inline
  implicit class JobConfigurationQueryOps[Self <: JobConfigurationQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLargeResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLargeResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLargeResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLargeResults")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDisposition")(js.undefined)
        ret
    }
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
    def withDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationEncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationTable(value: TableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTable")(js.undefined)
        ret
    }
    @scala.inline
    def withFlattenResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattenResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumBillingTier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBillingTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBillingTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBillingTier")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumBytesBilled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBytesBilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBytesBilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumBytesBilled")(js.undefined)
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
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
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
    def withSchemaUpdateOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaUpdateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaUpdateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaUpdateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTableDefinitions(value: Record[String, ExternalDataConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePartitioning(value: TimePartitioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePartitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePartitioning")(js.undefined)
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
    @scala.inline
    def withUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = {
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
    @scala.inline
    def withWriteDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeDisposition")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationQuery extends js.Object {
  var allowLargeResults: js.UndefOr[Boolean] = js.native
  var clustering: js.UndefOr[Clustering] = js.native
  var createDisposition: js.UndefOr[String] = js.native
  var defaultDataset: js.UndefOr[DatasetReference] = js.native
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  var destinationTable: js.UndefOr[TableReference] = js.native
  var flattenResults: js.UndefOr[Boolean] = js.native
  var maximumBillingTier: js.UndefOr[Double] = js.native
  var maximumBytesBilled: js.UndefOr[String] = js.native
  var parameterMode: js.UndefOr[String] = js.native
  var preserveNulls: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.native
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  var tableDefinitions: js.UndefOr[js.Object] = js.native
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  var useLegacySql: js.UndefOr[Boolean] = js.native
  var useQueryCache: js.UndefOr[Boolean] = js.native
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.native
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
    def withClustering(value: Clustering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clustering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClustering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clustering")(js.undefined)
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
    def withRangePartitioning(value: RangePartitioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangePartitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePartitioning")(js.undefined)
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
    def withTableDefinitions(value: js.Object): Self = {
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


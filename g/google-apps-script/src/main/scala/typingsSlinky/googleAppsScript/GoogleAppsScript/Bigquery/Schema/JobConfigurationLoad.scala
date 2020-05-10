package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationLoad extends js.Object {
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  var autodetect: js.UndefOr[Boolean] = js.native
  var clustering: js.UndefOr[Clustering] = js.native
  var createDisposition: js.UndefOr[String] = js.native
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  var destinationTable: js.UndefOr[TableReference] = js.native
  var destinationTableProperties: js.UndefOr[DestinationTableProperties] = js.native
  var encoding: js.UndefOr[String] = js.native
  var fieldDelimiter: js.UndefOr[String] = js.native
  var hivePartitioningMode: js.UndefOr[String] = js.native
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  var maxBadRecords: js.UndefOr[Double] = js.native
  var nullMarker: js.UndefOr[String] = js.native
  var projectionFields: js.UndefOr[js.Array[String]] = js.native
  var quote: js.UndefOr[String] = js.native
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.native
  var schema: js.UndefOr[TableSchema] = js.native
  var schemaInline: js.UndefOr[String] = js.native
  var schemaInlineFormat: js.UndefOr[String] = js.native
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  var skipLeadingRows: js.UndefOr[Double] = js.native
  var sourceFormat: js.UndefOr[String] = js.native
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  var useAvroLogicalTypes: js.UndefOr[Boolean] = js.native
  var writeDisposition: js.UndefOr[String] = js.native
}

object JobConfigurationLoad {
  @scala.inline
  def apply(): JobConfigurationLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationLoad]
  }
  @scala.inline
  implicit class JobConfigurationLoadOps[Self <: JobConfigurationLoad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowJaggedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJaggedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowJaggedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowJaggedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowQuotedNewlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowQuotedNewlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowQuotedNewlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowQuotedNewlines")(js.undefined)
        ret
    }
    @scala.inline
    def withAutodetect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodetect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutodetect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodetect")(js.undefined)
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
    def withDestinationTableProperties(value: DestinationTableProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTableProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationTableProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTableProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withHivePartitioningMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hivePartitioningMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHivePartitioningMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hivePartitioningMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnknownValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnknownValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknownValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBadRecords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBadRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBadRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBadRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNullMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionFields")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
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
    def withSchema(value: TableSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaInline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaInline")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaInlineFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaInlineFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaInlineFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaInlineFormat")(js.undefined)
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
    def withSkipLeadingRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLeadingRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLeadingRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLeadingRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUris")(js.undefined)
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
    def withUseAvroLogicalTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAvroLogicalTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAvroLogicalTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAvroLogicalTypes")(js.undefined)
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


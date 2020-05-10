package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationLoad extends js.Object {
  /**
    * [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing
    * columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
    * Only applicable to CSV, ignored for other formats.
    */
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  /** Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false. */
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  /** Indicates if we should automatically infer the options and schema for CSV and JSON sources. */
  var autodetect: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not
    * exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The
    * default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
    */
  var createDisposition: js.UndefOr[String] = js.native
  /** [Experimental] Custom encryption configuration (e.g., Cloud KMS keys). */
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  /** [Required] The destination table to load the data into. */
  var destinationTable: js.UndefOr[TableReference] = js.native
  /**
    * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data
    * after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255,
    * you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split
    * the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
    */
  var fieldDelimiter: js.UndefOr[String] = js.native
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If
    * false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result.
    * The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that
    * don't match any column names
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid
    * error is returned in the job result. The default value is 0, which requires that all records are valid.
    */
  var maxBadRecords: js.UndefOr[Double] = js.native
  /**
    * [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify "\N", BigQuery interprets "\N" as a null value
    * when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string
    * is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
    */
  var nullMarker: js.UndefOr[String] = js.native
  /**
    * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are
    * case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in
    * the Cloud Datastore backup, an invalid error is returned in the job result.
    */
  var projectionFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first
    * byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted
    * sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines
    * property to true.
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * [Optional] The schema for the destination table. The schema can be omitted if the destination table already exists, or if you're loading data from
    * Google Cloud Datastore.
    */
  var schema: js.UndefOr[TableSchema] = js.native
  /** [Deprecated] The inline schema. For CSV schemas, specify as "Field1:Type1[,Field2:Type2]&#42;". For example, "foo:STRING, bar:INTEGER, baz:FLOAT". */
  var schemaInline: js.UndefOr[String] = js.native
  /** [Deprecated] The format of the schemaInline property. */
  var schemaInlineFormat: js.UndefOr[String] = js.native
  /**
    * [Experimental] Allows the schema of the desitination table to be updated as a side effect of the load job if a schema is autodetected or supplied in
    * the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE
    * and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
    * schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION:
    * allow relaxing a required field in the original schema to nullable.
    */
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful
    * if you have header rows in the file that should be skipped.
    */
  var skipLeadingRows: js.UndefOr[Double] = js.native
  /**
    * [Optional] The format of the data files. For CSV files, specify "CSV". For datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON,
    * specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". The default value is CSV.
    */
  var sourceFormat: js.UndefOr[String] = js.native
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '&#42;' wildcard
    * character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs:
    * Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
    * backups: Exactly one URI can be specified. Also, the '&#42;' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
  /** [Experimental] If specified, configures time-based partitioning for the destination table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  /**
    * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table
    * already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If
    * the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic
    * and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job
    * completion.
    */
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


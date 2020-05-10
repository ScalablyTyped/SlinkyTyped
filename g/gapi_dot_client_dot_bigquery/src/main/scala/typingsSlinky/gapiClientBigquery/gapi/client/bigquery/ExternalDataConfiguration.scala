package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalDataConfiguration extends js.Object {
  /** Try to detect schema and format options automatically. Any option specified explicitly will be honored. */
  var autodetect: js.UndefOr[Boolean] = js.native
  /** [Optional] Additional options if sourceFormat is set to BIGTABLE. */
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.native
  /**
    * [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for
    * Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var compression: js.UndefOr[String] = js.native
  /** Additional properties to set if sourceFormat is set to CSV. */
  var csvOptions: js.UndefOr[CsvOptions] = js.native
  /** [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS. */
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.native
  /**
    * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If
    * false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result.
    * The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that
    * don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This
    * setting is ignored.
    */
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid
    * error is returned in the job result. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud
    * Bigtable, Google Cloud Datastore backups and Avro formats.
    */
  var maxBadRecords: js.UndefOr[Double] = js.native
  /**
    * [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore
    * backups, and Avro formats.
    */
  var schema: js.UndefOr[TableSchema] = js.native
  /**
    * [Required] The data format. For CSV files, specify "CSV". For Google sheets, specify "GOOGLE_SHEETS". For newline-delimited JSON, specify
    * "NEWLINE_DELIMITED_JSON". For Avro files, specify "AVRO". For Google Cloud Datastore backups, specify "DATASTORE_BACKUP". [Beta] For Google Cloud
    * Bigtable, specify "BIGTABLE".
    */
  var sourceFormat: js.UndefOr[String] = js.native
  /**
    * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '&#42;' wildcard
    * character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs:
    * Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
    * backups, exactly one URI can be specified. Also, the '&#42;' wildcard character is not allowed.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
}

object ExternalDataConfiguration {
  @scala.inline
  def apply(): ExternalDataConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDataConfiguration]
  }
  @scala.inline
  implicit class ExternalDataConfigurationOps[Self <: ExternalDataConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBigtableOptions(value: BigtableOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigtableOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigtableOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigtableOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvOptions(value: CsvOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleSheetsOptions(value: GoogleSheetsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSheetsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleSheetsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSheetsOptions")(js.undefined)
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
  }
  
}


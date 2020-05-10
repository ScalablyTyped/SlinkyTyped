package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationExtract extends js.Object {
  /** [Optional] The compression type to use for exported files. Possible values include GZIP and NONE. The default value is NONE. */
  var compression: js.UndefOr[String] = js.native
  /**
    * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO. The default value is CSV. Tables with nested or
    * repeated fields cannot be exported as CSV.
    */
  var destinationFormat: js.UndefOr[String] = js.native
  /**
    * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted
    * table should be written.
    */
  var destinationUri: js.UndefOr[String] = js.native
  /** [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written. */
  var destinationUris: js.UndefOr[js.Array[String]] = js.native
  /** [Optional] Delimiter to use between fields in the exported data. Default is ',' */
  var fieldDelimiter: js.UndefOr[String] = js.native
  /** [Optional] Whether to print out a header row in the results. Default is true. */
  var printHeader: js.UndefOr[Boolean] = js.native
  /** [Required] A reference to the table being exported. */
  var sourceTable: js.UndefOr[TableReference] = js.native
}

object JobConfigurationExtract {
  @scala.inline
  def apply(): JobConfigurationExtract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationExtract]
  }
  @scala.inline
  implicit class JobConfigurationExtractOps[Self <: JobConfigurationExtract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDestinationFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationUris")(js.undefined)
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
    def withPrintHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTable(value: TableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTable")(js.undefined)
        ret
    }
  }
  
}


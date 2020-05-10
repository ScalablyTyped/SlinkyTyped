package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalDataConfiguration extends js.Object {
  var autodetect: js.UndefOr[Boolean] = js.native
  var bigtableOptions: js.UndefOr[BigtableOptions] = js.native
  var compression: js.UndefOr[String] = js.native
  var csvOptions: js.UndefOr[CsvOptions] = js.native
  var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.native
  var hivePartitioningMode: js.UndefOr[String] = js.native
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.native
  var maxBadRecords: js.UndefOr[Double] = js.native
  var schema: js.UndefOr[TableSchema] = js.native
  var sourceFormat: js.UndefOr[String] = js.native
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


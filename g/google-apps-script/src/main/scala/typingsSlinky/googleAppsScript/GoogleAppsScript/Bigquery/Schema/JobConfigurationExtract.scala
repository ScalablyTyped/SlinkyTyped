package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationExtract extends js.Object {
  var compression: js.UndefOr[String] = js.native
  var destinationFormat: js.UndefOr[String] = js.native
  var destinationUri: js.UndefOr[String] = js.native
  var destinationUris: js.UndefOr[js.Array[String]] = js.native
  var fieldDelimiter: js.UndefOr[String] = js.native
  var printHeader: js.UndefOr[Boolean] = js.native
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


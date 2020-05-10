package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1BigQueryTable extends js.Object {
  /** Dataset ID of the table. */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Platform project ID of the project containing the table.
    * If omitted, project ID is inferred from the API call.
    */
  var projectId: js.UndefOr[String] = js.native
  /** Name of the table. */
  var tableId: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1BigQueryTable {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1BigQueryTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BigQueryTable]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1BigQueryTableOps[Self <: GooglePrivacyDlpV2beta1BigQueryTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(js.undefined)
        ret
    }
  }
  
}


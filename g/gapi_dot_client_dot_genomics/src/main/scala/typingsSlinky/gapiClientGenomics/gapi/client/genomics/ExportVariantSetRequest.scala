package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportVariantSetRequest extends js.Object {
  /**
    * Required. The BigQuery dataset to export data to. This dataset must already
    * exist. Note that this is distinct from the Genomics concept of "dataset".
    */
  var bigqueryDataset: js.UndefOr[String] = js.native
  /**
    * Required. The BigQuery table to export data to.
    * If the table doesn't exist, it will be created. If it already exists, it
    * will be overwritten.
    */
  var bigqueryTable: js.UndefOr[String] = js.native
  /**
    * If provided, only variant call information from the specified call sets
    * will be exported. By default all variant calls are exported.
    */
  var callSetIds: js.UndefOr[js.Array[String]] = js.native
  /** The format for the exported data. */
  var format: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud project ID that owns the destination
    * BigQuery dataset. The caller must have WRITE access to this project.  This
    * project will also own the resulting export job.
    */
  var projectId: js.UndefOr[String] = js.native
}

object ExportVariantSetRequest {
  @scala.inline
  def apply(): ExportVariantSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportVariantSetRequest]
  }
  @scala.inline
  implicit class ExportVariantSetRequestOps[Self <: ExportVariantSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigqueryDataset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigqueryDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryDataset")(js.undefined)
        ret
    }
    @scala.inline
    def withBigqueryTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigqueryTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigqueryTable")(js.undefined)
        ret
    }
    @scala.inline
    def withCallSetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallSetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
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
  }
  
}


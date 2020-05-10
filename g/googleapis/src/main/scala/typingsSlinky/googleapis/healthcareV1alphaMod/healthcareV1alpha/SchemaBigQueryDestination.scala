package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The BigQuery table to which the output should be written.
  */
@js.native
trait SchemaBigQueryDestination extends js.Object {
  /**
    * Required. The BigQuery dataset to which the DICOM store should be
    * exported. If this dataset does not exist, the export call returns an
    * error.
    */
  var dataset: js.UndefOr[String] = js.native
  /**
    * If the destination table already exists and this flag is `TRUE`, the
    * table will be overwritten by the contents of the DICOM store. If the flag
    * is not set and the destination table already exists, the export call
    * returns an error.
    */
  var overwriteTable: js.UndefOr[Boolean] = js.native
  /**
    * Required. The BigQuery table to which the DICOM store should be written.
    * If this table does not exist, a new table with the given name will be
    * created.
    */
  var table: js.UndefOr[String] = js.native
}

object SchemaBigQueryDestination {
  @scala.inline
  def apply(): SchemaBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryDestination]
  }
  @scala.inline
  implicit class SchemaBigQueryDestinationOps[Self <: SchemaBigQueryDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwriteTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwriteTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwriteTable")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}


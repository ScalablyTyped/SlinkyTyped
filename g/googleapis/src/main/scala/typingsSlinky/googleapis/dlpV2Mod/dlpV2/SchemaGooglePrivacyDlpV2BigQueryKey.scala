package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Row key for identifying a record in BigQuery table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BigQueryKey extends js.Object {
  /**
    * Absolute number of the row from the beginning of the table at the time of
    * scanning.
    */
  var rowNumber: js.UndefOr[String] = js.native
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2BigQueryKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BigQueryKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BigQueryKeyOps[Self <: SchemaGooglePrivacyDlpV2BigQueryKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTableReference(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableReference")(js.undefined)
        ret
    }
  }
  
}


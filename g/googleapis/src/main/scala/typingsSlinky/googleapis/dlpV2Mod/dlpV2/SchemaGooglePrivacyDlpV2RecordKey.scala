package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for a unique key indicating a record that contains a finding.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordKey extends js.Object {
  var bigQueryKey: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryKey] = js.native
  var datastoreKey: js.UndefOr[SchemaGooglePrivacyDlpV2DatastoreKey] = js.native
  /**
    * Values of identifying columns in the given row. Order of values matches
    * the order of field identifiers specified in the scanning request.
    */
  var idValues: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2RecordKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordKeyOps[Self <: SchemaGooglePrivacyDlpV2RecordKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBigQueryKey(value: SchemaGooglePrivacyDlpV2BigQueryKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigQueryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigQueryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigQueryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDatastoreKey(value: SchemaGooglePrivacyDlpV2DatastoreKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastoreKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIdValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idValues")(js.undefined)
        ret
    }
  }
  
}


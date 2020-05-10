package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a row or record.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordLocation extends js.Object {
  /**
    * Field id of the field containing the finding.
    */
  var fieldId: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * Key of the finding.
    */
  var recordKey: js.UndefOr[SchemaGooglePrivacyDlpV2RecordKey] = js.native
  /**
    * Location within a `ContentItem.Table`.
    */
  var tableLocation: js.UndefOr[SchemaGooglePrivacyDlpV2TableLocation] = js.native
}

object SchemaGooglePrivacyDlpV2RecordLocation {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordLocation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordLocationOps[Self <: SchemaGooglePrivacyDlpV2RecordLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldId(value: SchemaGooglePrivacyDlpV2FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordKey(value: SchemaGooglePrivacyDlpV2RecordKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTableLocation(value: SchemaGooglePrivacyDlpV2TableLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLocation")(js.undefined)
        ret
    }
  }
  
}


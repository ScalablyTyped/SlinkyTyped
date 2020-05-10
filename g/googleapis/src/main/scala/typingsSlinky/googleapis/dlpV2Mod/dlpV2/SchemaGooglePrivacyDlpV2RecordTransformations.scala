package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of transformation that is applied over structured data such as a
  * table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordTransformations extends js.Object {
  /**
    * Transform the record by applying various field transformations.
    */
  var fieldTransformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]] = js.native
  /**
    * Configuration defining which records get suppressed entirely. Records
    * that match any suppression rule are omitted from the output [optional].
    */
  var recordSuppressions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]] = js.native
}

object SchemaGooglePrivacyDlpV2RecordTransformations {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordTransformations]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordTransformationsOps[Self <: SchemaGooglePrivacyDlpV2RecordTransformations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldTransformations(value: js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTransformations")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordSuppressions(value: js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordSuppressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordSuppressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordSuppressions")(js.undefined)
        ret
    }
  }
  
}


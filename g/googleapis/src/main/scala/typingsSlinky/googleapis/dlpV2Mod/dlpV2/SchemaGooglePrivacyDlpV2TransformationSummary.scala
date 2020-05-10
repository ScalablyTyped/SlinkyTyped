package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summary of a single transformation. Only one of &#39;transformation&#39;,
  * &#39;field_transformation&#39;, or &#39;record_suppress&#39; will be set.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransformationSummary extends js.Object {
  /**
    * Set if the transformation was limited to a specific FieldId.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * The field transformation that was applied. If multiple field
    * transformations are requested for a single field, this list will contain
    * all of them; otherwise, only one is supplied.
    */
  var fieldTransformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]] = js.native
  /**
    * Set if the transformation was limited to a specific InfoType.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * The specific suppression option these stats apply to.
    */
  var recordSuppress: js.UndefOr[SchemaGooglePrivacyDlpV2RecordSuppression] = js.native
  var results: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2SummaryResult]] = js.native
  /**
    * The specific transformation these stats apply to.
    */
  var transformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TransformationSummary {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TransformationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationSummary]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TransformationSummaryOps[Self <: SchemaGooglePrivacyDlpV2TransformationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: SchemaGooglePrivacyDlpV2FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
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
    def withInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordSuppress(value: SchemaGooglePrivacyDlpV2RecordSuppression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordSuppress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordSuppress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordSuppress")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[SchemaGooglePrivacyDlpV2SummaryResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformation")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformedBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedBytes")(js.undefined)
        ret
    }
  }
  
}


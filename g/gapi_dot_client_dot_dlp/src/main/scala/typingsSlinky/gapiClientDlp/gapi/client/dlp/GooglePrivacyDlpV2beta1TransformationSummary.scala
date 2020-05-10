package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1TransformationSummary extends js.Object {
  /** Set if the transformation was limited to a specific FieldId. */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
  /**
    * The field transformation that was applied. This list will contain
    * multiple only in the case of errors.
    */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldTransformation]] = js.native
  /** Set if the transformation was limited to a specific info_type. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.native
  /** The specific suppression option these stats apply to. */
  var recordSuppress: js.UndefOr[GooglePrivacyDlpV2beta1RecordSuppression] = js.native
  var results: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1SummaryResult]] = js.native
  /** The specific transformation these stats apply to. */
  var transformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.native
}

object GooglePrivacyDlpV2beta1TransformationSummary {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1TransformationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TransformationSummary]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1TransformationSummaryOps[Self <: GooglePrivacyDlpV2beta1TransformationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: GooglePrivacyDlpV2beta1FieldId): Self = {
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
    def withFieldTransformations(value: js.Array[GooglePrivacyDlpV2beta1FieldTransformation]): Self = {
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
    def withInfoType(value: GooglePrivacyDlpV2beta1InfoType): Self = {
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
    def withRecordSuppress(value: GooglePrivacyDlpV2beta1RecordSuppression): Self = {
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
    def withResults(value: js.Array[GooglePrivacyDlpV2beta1SummaryResult]): Self = {
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
    def withTransformation(value: GooglePrivacyDlpV2beta1PrimitiveTransformation): Self = {
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
  }
  
}


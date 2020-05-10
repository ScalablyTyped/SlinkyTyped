package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DeidentificationSummary extends js.Object {
  /** Transformations applied to the dataset. */
  var transformationSummaries: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1TransformationSummary]] = js.native
  /** Total size in bytes that were transformed in some way. */
  var transformedBytes: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1DeidentificationSummary {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DeidentificationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentificationSummary]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DeidentificationSummaryOps[Self <: GooglePrivacyDlpV2beta1DeidentificationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformationSummaries(value: js.Array[GooglePrivacyDlpV2beta1TransformationSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformationSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformationSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformationSummaries")(js.undefined)
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


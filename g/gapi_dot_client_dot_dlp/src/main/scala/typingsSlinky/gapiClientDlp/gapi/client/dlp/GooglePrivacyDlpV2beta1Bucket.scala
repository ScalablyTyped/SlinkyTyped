package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Bucket extends js.Object {
  /** Upper bound of the range, exclusive; type must match min. */
  var max: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
  /**
    * Replacement value for this bucket. If not provided
    * the default behavior will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
}

object GooglePrivacyDlpV2beta1Bucket {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Bucket]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1BucketOps[Self <: GooglePrivacyDlpV2beta1Bucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacementValue(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacementValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacementValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacementValue")(js.undefined)
        ret
    }
  }
  
}


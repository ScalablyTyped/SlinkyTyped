package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bucket is represented as a range, along with replacement values.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Bucket extends js.Object {
  /**
    * Upper bound of the range, exclusive; type must match min.
    */
  var max: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * Replacement value for this bucket. If not provided the default behavior
    * will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
}

object SchemaGooglePrivacyDlpV2Bucket {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Bucket]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BucketOps[Self <: SchemaGooglePrivacyDlpV2Bucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: SchemaGooglePrivacyDlpV2Value): Self = {
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
    def withMin(value: SchemaGooglePrivacyDlpV2Value): Self = {
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
    def withReplacementValue(value: SchemaGooglePrivacyDlpV2Value): Self = {
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


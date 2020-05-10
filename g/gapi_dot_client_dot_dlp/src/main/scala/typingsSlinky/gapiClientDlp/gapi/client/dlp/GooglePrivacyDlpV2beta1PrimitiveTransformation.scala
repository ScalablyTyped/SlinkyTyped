package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1PrimitiveTransformation extends js.Object {
  var bucketingConfig: js.UndefOr[GooglePrivacyDlpV2beta1BucketingConfig] = js.native
  var characterMaskConfig: js.UndefOr[GooglePrivacyDlpV2beta1CharacterMaskConfig] = js.native
  var cryptoHashConfig: js.UndefOr[GooglePrivacyDlpV2beta1CryptoHashConfig] = js.native
  var cryptoReplaceFfxFpeConfig: js.UndefOr[GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig] = js.native
  var fixedSizeBucketingConfig: js.UndefOr[GooglePrivacyDlpV2beta1FixedSizeBucketingConfig] = js.native
  var redactConfig: js.UndefOr[js.Any] = js.native
  var replaceConfig: js.UndefOr[GooglePrivacyDlpV2beta1ReplaceValueConfig] = js.native
  var replaceWithInfoTypeConfig: js.UndefOr[js.Any] = js.native
  var timePartConfig: js.UndefOr[GooglePrivacyDlpV2beta1TimePartConfig] = js.native
}

object GooglePrivacyDlpV2beta1PrimitiveTransformation {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PrimitiveTransformation]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1PrimitiveTransformationOps[Self <: GooglePrivacyDlpV2beta1PrimitiveTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketingConfig(value: GooglePrivacyDlpV2beta1BucketingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacterMaskConfig(value: GooglePrivacyDlpV2beta1CharacterMaskConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterMaskConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterMaskConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterMaskConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoHashConfig(value: GooglePrivacyDlpV2beta1CryptoHashConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoHashConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoHashConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoHashConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoReplaceFfxFpeConfig(value: GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoReplaceFfxFpeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoReplaceFfxFpeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoReplaceFfxFpeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedSizeBucketingConfig(value: GooglePrivacyDlpV2beta1FixedSizeBucketingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedSizeBucketingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedSizeBucketingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedSizeBucketingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRedactConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedactConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceConfig(value: GooglePrivacyDlpV2beta1ReplaceValueConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceWithInfoTypeConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWithInfoTypeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceWithInfoTypeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWithInfoTypeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePartConfig(value: GooglePrivacyDlpV2beta1TimePartConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePartConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePartConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePartConfig")(js.undefined)
        ret
    }
  }
  
}


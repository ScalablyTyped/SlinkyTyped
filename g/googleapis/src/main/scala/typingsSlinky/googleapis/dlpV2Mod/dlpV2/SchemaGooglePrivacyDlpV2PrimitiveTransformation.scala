package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule for transforming a value.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PrimitiveTransformation extends js.Object {
  var bucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2BucketingConfig] = js.native
  var characterMaskConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CharacterMaskConfig] = js.native
  var cryptoDeterministicConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoDeterministicConfig] = js.native
  var cryptoHashConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoHashConfig] = js.native
  var cryptoReplaceFfxFpeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] = js.native
  var dateShiftConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DateShiftConfig] = js.native
  var fixedSizeBucketingConfig: js.UndefOr[SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig] = js.native
  var redactConfig: js.UndefOr[SchemaGooglePrivacyDlpV2RedactConfig] = js.native
  var replaceConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceValueConfig] = js.native
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig] = js.native
  var timePartConfig: js.UndefOr[SchemaGooglePrivacyDlpV2TimePartConfig] = js.native
}

object SchemaGooglePrivacyDlpV2PrimitiveTransformation {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrimitiveTransformation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PrimitiveTransformationOps[Self <: SchemaGooglePrivacyDlpV2PrimitiveTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketingConfig(value: SchemaGooglePrivacyDlpV2BucketingConfig): Self = {
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
    def withCharacterMaskConfig(value: SchemaGooglePrivacyDlpV2CharacterMaskConfig): Self = {
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
    def withCryptoDeterministicConfig(value: SchemaGooglePrivacyDlpV2CryptoDeterministicConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoDeterministicConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoDeterministicConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoDeterministicConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoHashConfig(value: SchemaGooglePrivacyDlpV2CryptoHashConfig): Self = {
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
    def withCryptoReplaceFfxFpeConfig(value: SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig): Self = {
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
    def withDateShiftConfig(value: SchemaGooglePrivacyDlpV2DateShiftConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateShiftConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateShiftConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateShiftConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedSizeBucketingConfig(value: SchemaGooglePrivacyDlpV2FixedSizeBucketingConfig): Self = {
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
    def withRedactConfig(value: SchemaGooglePrivacyDlpV2RedactConfig): Self = {
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
    def withReplaceConfig(value: SchemaGooglePrivacyDlpV2ReplaceValueConfig): Self = {
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
    def withReplaceWithInfoTypeConfig(value: SchemaGooglePrivacyDlpV2ReplaceWithInfoTypeConfig): Self = {
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
    def withTimePartConfig(value: SchemaGooglePrivacyDlpV2TimePartConfig): Self = {
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


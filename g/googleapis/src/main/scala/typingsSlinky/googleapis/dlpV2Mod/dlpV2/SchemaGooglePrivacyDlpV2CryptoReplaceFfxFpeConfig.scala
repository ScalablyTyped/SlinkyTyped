package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces an identifier with a surrogate using Format Preserving Encryption
  * (FPE) with the FFX mode of operation; however when used in the
  * `ReidentifyContent` API method, it serves the opposite function by
  * reversing the surrogate back into the original identifier. The identifier
  * must be encoded as ASCII. For a given crypto key and context, the same
  * identifier will be replaced with the same surrogate. Identifiers must be at
  * least two characters long. In the case that the identifier is the empty
  * string, it will be skipped. See
  * https://cloud.google.com/dlp/docs/pseudonymization to learn more.  Note: We
  * recommend using  CryptoDeterministicConfig for all use cases which do not
  * require preserving the input alphabet space and size, plus warrant
  * referential integrity.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig extends js.Object {
  var commonAlphabet: js.UndefOr[String] = js.native
  /**
    * The &#39;tweak&#39;, a context may be used for higher security since the
    * same identifier in two different contexts won&#39;t be given the same
    * surrogate. If the context is not set, a default tweak will be used.  If
    * the context is set but:  1. there is no record present when transforming
    * a given value or 1. the field is not present when transforming a given
    * value,  a default tweak will be used.  Note that case (1) is expected
    * when an `InfoTypeTransformation` is applied to both structured and
    * non-structured `ContentItem`s. Currently, the referenced field may be of
    * value type integer or string.  The tweak is constructed as a sequence of
    * bytes in big endian byte order such that:  - a 64 bit integer is encoded
    * followed by a single byte of value 1 - a string is encoded in UTF-8
    * format followed by a single byte of value 2
    */
  var context: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * The key used by the encryption algorithm. [required]
    */
  var cryptoKey: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoKey] = js.native
  /**
    * This is supported by mapping these to the alphanumeric characters that
    * the FFX mode natively supports. This happens before/after
    * encryption/decryption. Each character listed must appear only once.
    * Number of characters must be in the range [2, 62]. This must be encoded
    * as ASCII. The order of characters does not matter.
    */
  var customAlphabet: js.UndefOr[String] = js.native
  /**
    * The native way to select the alphabet. Must be in the range [2, 62].
    */
  var radix: js.UndefOr[Double] = js.native
  /**
    * The custom infoType to annotate the surrogate with. This annotation will
    * be applied to the surrogate by prefixing it with the name of the custom
    * infoType followed by the number of characters comprising the surrogate.
    * The following scheme defines the format:
    * info_type_name(surrogate_character_count):surrogate  For example, if the
    * name of custom infoType is &#39;MY_TOKEN_INFO_TYPE&#39; and the surrogate
    * is &#39;abc&#39;, the full replacement value will be:
    * &#39;MY_TOKEN_INFO_TYPE(3):abc&#39;  This annotation identifies the
    * surrogate when inspecting content using the custom infoType
    * [`SurrogateType`](/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype).
    * This facilitates reversal of the surrogate when it occurs in free text.
    * In order for inspection to work properly, the name of this infoType must
    * not occur naturally anywhere in your data; otherwise, inspection may find
    * a surrogate that does not correspond to an actual identifier. Therefore,
    * choose your custom infoType name carefully after considering what your
    * data looks like. One way to select a name that has a high chance of
    * yielding reliable detection is to include one or more unicode characters
    * that are highly improbable to exist in your data. For example, assuming
    * your data is entered from a regular ASCII keyboard, the symbol with the
    * hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
    */
  var surrogateInfoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}

object SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfigOps[Self <: SchemaGooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonAlphabet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonAlphabet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonAlphabet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonAlphabet")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: SchemaGooglePrivacyDlpV2FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoKey(value: SchemaGooglePrivacyDlpV2CryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAlphabet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAlphabet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAlphabet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAlphabet")(js.undefined)
        ret
    }
    @scala.inline
    def withRadix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radix")(js.undefined)
        ret
    }
    @scala.inline
    def withSurrogateInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surrogateInfoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurrogateInfoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surrogateInfoType")(js.undefined)
        ret
    }
  }
  
}


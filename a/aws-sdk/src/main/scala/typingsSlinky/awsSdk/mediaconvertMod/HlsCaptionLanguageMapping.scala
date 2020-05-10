package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsCaptionLanguageMapping extends js.Object {
  /**
    * Caption channel.
    */
  var CaptionChannel: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Specify the language for this captions channel, using the ISO 639-2 or ISO 639-3 three-letter language code
    */
  var CustomLanguageCode: js.UndefOr[stringMin3Max3PatternAZaZ3] = js.native
  /**
    * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.LanguageCode] = js.native
  /**
    * Caption language description.
    */
  var LanguageDescription: js.UndefOr[string] = js.native
}

object HlsCaptionLanguageMapping {
  @scala.inline
  def apply(): HlsCaptionLanguageMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCaptionLanguageMapping]
  }
  @scala.inline
  implicit class HlsCaptionLanguageMappingOps[Self <: HlsCaptionLanguageMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionChannel(value: integerMinNegative2147483648Max2147483647): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptionChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLanguageCode(value: stringMin3Max3PatternAZaZ3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomLanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageDescription")(js.undefined)
        ret
    }
  }
  
}


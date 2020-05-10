package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Voice extends js.Object {
  /**
    * Additional codes for languages available for the specified voice in addition to its default language.  For example, the default language for Aditi is Indian English (en-IN) because it was first used for that language. Since Aditi is bilingual and fluent in both Indian English and Hindi, this parameter would show the code hi-IN.
    */
  var AdditionalLanguageCodes: js.UndefOr[LanguageCodeList] = js.native
  /**
    * Gender of the voice.
    */
  var Gender: js.UndefOr[typingsSlinky.awsSdk.pollyMod.Gender] = js.native
  /**
    * Amazon Polly assigned voice ID. This is the ID that you specify when calling the SynthesizeSpeech operation.
    */
  var Id: js.UndefOr[VoiceId] = js.native
  /**
    * Language code of the voice.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LanguageCode] = js.native
  /**
    * Human readable name of the language in English.
    */
  var LanguageName: js.UndefOr[typingsSlinky.awsSdk.pollyMod.LanguageName] = js.native
  /**
    * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might display in your application.
    */
  var Name: js.UndefOr[VoiceName] = js.native
  /**
    * Specifies which engines (standard or neural) that are supported by a given voice.
    */
  var SupportedEngines: js.UndefOr[EngineList] = js.native
}

object Voice {
  @scala.inline
  def apply(): Voice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Voice]
  }
  @scala.inline
  implicit class VoiceOps[Self <: Voice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalLanguageCodes(value: LanguageCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalLanguageCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalLanguageCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalLanguageCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: Gender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gender")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: VoiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withLanguageName(value: LanguageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: VoiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedEngines(value: EngineList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedEngines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedEngines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedEngines")(js.undefined)
        ret
    }
  }
  
}


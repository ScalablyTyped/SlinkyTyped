package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVocabularyResponse extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary was updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the vocabulary that was updated.
    */
  var VocabularyName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the vocabulary. When the VocabularyState field contains READY the vocabulary is ready to be used in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}

object UpdateVocabularyResponse {
  @scala.inline
  def apply(): UpdateVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVocabularyResponse]
  }
  @scala.inline
  implicit class UpdateVocabularyResponseOps[Self <: UpdateVocabularyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVocabularyName(value: VocabularyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVocabularyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyName")(js.undefined)
        ret
    }
    @scala.inline
    def withVocabularyState(value: VocabularyState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVocabularyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyState")(js.undefined)
        ret
    }
  }
  
}


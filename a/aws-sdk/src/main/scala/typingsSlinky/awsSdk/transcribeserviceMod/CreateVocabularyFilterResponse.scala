package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVocabularyFilterResponse extends js.Object {
  /**
    * The language code of the words in the collection.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary filter was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the vocabulary filter.
    */
  var VocabularyFilterName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyFilterName] = js.native
}

object CreateVocabularyFilterResponse {
  @scala.inline
  def apply(): CreateVocabularyFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVocabularyFilterResponse]
  }
  @scala.inline
  implicit class CreateVocabularyFilterResponseOps[Self <: CreateVocabularyFilterResponse] (val x: Self) extends AnyVal {
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
    def withVocabularyFilterName(value: VocabularyFilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyFilterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVocabularyFilterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyFilterName")(js.undefined)
        ret
    }
  }
  
}


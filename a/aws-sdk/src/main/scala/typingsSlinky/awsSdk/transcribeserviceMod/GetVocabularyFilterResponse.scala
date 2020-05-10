package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyFilterResponse extends js.Object {
  /**
    * The URI of the list of words in the vocabulary filter. You can use this URI to get the list of words.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  /**
    * The language code of the words in the vocabulary filter.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the contents of the vocabulary filter were updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the vocabulary filter.
    */
  var VocabularyFilterName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyFilterName] = js.native
}

object GetVocabularyFilterResponse {
  @scala.inline
  def apply(): GetVocabularyFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVocabularyFilterResponse]
  }
  @scala.inline
  implicit class GetVocabularyFilterResponseOps[Self <: GetVocabularyFilterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadUri")(js.undefined)
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


package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyResponse extends js.Object {
  /**
    * The S3 location where the vocabulary is stored. Use this URI to get the contents of the vocabulary. The URI is available for a limited time.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  /**
    * If the VocabularyState field is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.FailureReason] = js.native
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the vocabulary to return.
    */
  var VocabularyName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the vocabulary.
    */
  var VocabularyState: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}

object GetVocabularyResponse {
  @scala.inline
  def apply(): GetVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVocabularyResponse]
  }
  @scala.inline
  implicit class GetVocabularyResponseOps[Self <: GetVocabularyResponse] (val x: Self) extends AnyVal {
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
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
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


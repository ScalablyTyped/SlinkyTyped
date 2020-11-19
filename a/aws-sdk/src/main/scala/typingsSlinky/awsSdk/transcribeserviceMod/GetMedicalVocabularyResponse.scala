package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMedicalVocabularyResponse extends js.Object {
  
  /**
    * The Amazon S3 location where the vocabulary is stored. Use this URI to get the contents of the vocabulary. You can download your vocabulary from the URI for a limited time.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  
  /**
    * If the VocabularyState is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.FailureReason] = js.native
  
  /**
    * The valid language code returned for your vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  /**
    * The date and time the vocabulary was last modified with a text file different from what was previously used.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The valid name that Amazon Transcribe Medical returns.
    */
  var VocabularyName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  
  /**
    * The processing state of the vocabulary.
    */
  var VocabularyState: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyState] = js.native
}
object GetMedicalVocabularyResponse {
  
  @scala.inline
  def apply(): GetMedicalVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMedicalVocabularyResponse]
  }
  
  @scala.inline
  implicit class GetMedicalVocabularyResponseOps[Self <: GetMedicalVocabularyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDownloadUri(value: Uri): Self = this.set("DownloadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUri: Self = this.set("DownloadUri", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = this.set("VocabularyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocabularyName: Self = this.set("VocabularyName", js.undefined)
    
    @scala.inline
    def setVocabularyState(value: VocabularyState): Self = this.set("VocabularyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocabularyState: Self = this.set("VocabularyState", js.undefined)
  }
}

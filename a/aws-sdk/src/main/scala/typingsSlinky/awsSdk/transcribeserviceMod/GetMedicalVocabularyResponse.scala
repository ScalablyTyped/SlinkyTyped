package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMedicalVocabularyResponse extends StObject {
  
  /**
    * The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the vocabulary. You can download your vocabulary from the URI for a limited time.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  
  /**
    * If the VocabularyState is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.FailureReason] = js.native
  
  /**
    * The valid language code for your vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  /**
    * The date and time that the vocabulary was last modified with a text file different from the one that was previously used.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the vocabulary returned by Amazon Transcribe Medical.
    */
  var VocabularyName: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.VocabularyName] = js.native
  
  /**
    * The processing state of the vocabulary. If the VocabularyState is READY then you can use it in the StartMedicalTranscriptionJob operation. 
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
  implicit class GetMedicalVocabularyResponseMutableBuilder[Self <: GetMedicalVocabularyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadUri(value: Uri): Self = StObject.set(x, "DownloadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUriUndefined: Self = StObject.set(x, "DownloadUri", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
    
    @scala.inline
    def setVocabularyState(value: VocabularyState): Self = StObject.set(x, "VocabularyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyStateUndefined: Self = StObject.set(x, "VocabularyState", js.undefined)
  }
}

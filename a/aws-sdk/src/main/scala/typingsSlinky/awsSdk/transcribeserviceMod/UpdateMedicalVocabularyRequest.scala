package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMedicalVocabularyRequest extends StObject {
  
  /**
    * The language code of the language used for the entries in the updated vocabulary. US English (en-US) is the only valid language code in Amazon Transcribe Medical.
    */
  var LanguageCode: typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode = js.native
  
  /**
    * The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI must be in the same AWS Region as the resource that you are calling. The following is the format for a URI:   https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt  For more information about Amazon S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies in Amazon Transcribe Medical, see Medical Custom Vocabularies.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.native
  
  /**
    * The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with the same name as a vocabulary you've already made, you get a ConflictException error.
    */
  var VocabularyName: typingsSlinky.awsSdk.transcribeserviceMod.VocabularyName = js.native
}
object UpdateMedicalVocabularyRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyName: VocabularyName): UpdateMedicalVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMedicalVocabularyRequest]
  }
  
  @scala.inline
  implicit class UpdateMedicalVocabularyRequestMutableBuilder[Self <: UpdateMedicalVocabularyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFileUri(value: Uri): Self = StObject.set(x, "VocabularyFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFileUriUndefined: Self = StObject.set(x, "VocabularyFileUri", js.undefined)
    
    @scala.inline
    def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
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

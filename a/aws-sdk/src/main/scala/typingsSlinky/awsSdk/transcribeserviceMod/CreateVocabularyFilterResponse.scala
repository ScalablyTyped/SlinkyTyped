package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVocabularyFilterResponse extends StObject {
  
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
  implicit class CreateVocabularyFilterResponseMutableBuilder[Self <: CreateVocabularyFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
  }
}

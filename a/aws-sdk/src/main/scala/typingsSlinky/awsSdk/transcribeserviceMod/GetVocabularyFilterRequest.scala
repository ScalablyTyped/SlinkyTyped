package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVocabularyFilterRequest extends StObject {
  
  /**
    * The name of the vocabulary filter for which to return information.
    */
  var VocabularyFilterName: typingsSlinky.awsSdk.transcribeserviceMod.VocabularyFilterName = js.native
}
object GetVocabularyFilterRequest {
  
  @scala.inline
  def apply(VocabularyFilterName: VocabularyFilterName): GetVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyFilterRequest]
  }
  
  @scala.inline
  implicit class GetVocabularyFilterRequestMutableBuilder[Self <: GetVocabularyFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectKeyPhrasesRequest extends StObject {
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typingsSlinky.awsSdk.comprehendMod.LanguageCode = js.native
  
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: CustomerInputStringList = js.native
}
object BatchDetectKeyPhrasesRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, TextList: CustomerInputStringList): BatchDetectKeyPhrasesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectKeyPhrasesRequest]
  }
  
  @scala.inline
  implicit class BatchDetectKeyPhrasesRequestMutableBuilder[Self <: BatchDetectKeyPhrasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextList(value: CustomerInputStringList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextListVarargs(value: CustomerInputString*): Self = StObject.set(x, "TextList", js.Array(value :_*))
  }
}

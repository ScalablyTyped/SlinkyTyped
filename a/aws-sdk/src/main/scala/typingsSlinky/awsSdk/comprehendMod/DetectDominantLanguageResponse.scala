package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectDominantLanguageResponse extends StObject {
  
  /**
    * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.native
}
object DetectDominantLanguageResponse {
  
  @scala.inline
  def apply(): DetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectDominantLanguageResponse]
  }
  
  @scala.inline
  implicit class DetectDominantLanguageResponseMutableBuilder[Self <: DetectDominantLanguageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: ListOfDominantLanguages): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "Languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: DominantLanguage*): Self = StObject.set(x, "Languages", js.Array(value :_*))
  }
}

package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectPiiEntitiesRequest extends StObject {
  
  /**
    * The language of the input documents.
    */
  var LanguageCode: typingsSlinky.awsSdk.comprehendMod.LanguageCode = js.native
  
  /**
    * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: String = js.native
}
object DetectPiiEntitiesRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, Text: String): DetectPiiEntitiesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectPiiEntitiesRequest]
  }
  
  @scala.inline
  implicit class DetectPiiEntitiesRequestMutableBuilder[Self <: DetectPiiEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}

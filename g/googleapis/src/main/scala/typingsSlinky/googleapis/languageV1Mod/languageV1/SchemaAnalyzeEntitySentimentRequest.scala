package typingsSlinky.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entity-level sentiment analysis request message.
  */
@js.native
trait SchemaAnalyzeEntitySentimentRequest extends StObject {
  
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.native
}
object SchemaAnalyzeEntitySentimentRequest {
  
  @scala.inline
  def apply(): SchemaAnalyzeEntitySentimentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeEntitySentimentRequest]
  }
  
  @scala.inline
  implicit class SchemaAnalyzeEntitySentimentRequestMutableBuilder[Self <: SchemaAnalyzeEntitySentimentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
  }
}

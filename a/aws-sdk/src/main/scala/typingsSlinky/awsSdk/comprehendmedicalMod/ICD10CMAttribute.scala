package typingsSlinky.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICD10CMAttribute extends StObject {
  
  /**
    * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this entity.
    */
  var RelationshipScore: js.UndefOr[Float] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an attribute.
    */
  var Score: js.UndefOr[Float] = js.native
  
  /**
    * The segment of input text which contains the detected attribute.
    */
  var Text: js.UndefOr[String] = js.native
  
  /**
    * The contextual information for the attribute. The traits recognized by InferICD10CM are DIAGNOSIS, SIGN, SYMPTOM, and NEGATION.
    */
  var Traits: js.UndefOr[ICD10CMTraitList] = js.native
  
  /**
    * The type of attribute. InferICD10CM detects entities of the type DX_NAME. 
    */
  var Type: js.UndefOr[ICD10CMAttributeType] = js.native
}
object ICD10CMAttribute {
  
  @scala.inline
  def apply(): ICD10CMAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMAttribute]
  }
  
  @scala.inline
  implicit class ICD10CMAttributeMutableBuilder[Self <: ICD10CMAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    @scala.inline
    def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setRelationshipScore(value: Float): Self = StObject.set(x, "RelationshipScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipScoreUndefined: Self = StObject.set(x, "RelationshipScore", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setTraits(value: ICD10CMTraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: ICD10CMTrait*): Self = StObject.set(x, "Traits", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ICD10CMAttributeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

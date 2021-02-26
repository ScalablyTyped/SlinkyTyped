package typingsSlinky.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RxNormEntity extends StObject {
  
  /**
    * The extracted attributes that relate to the entity. The attributes recognized by InferRxNorm are DOSAGE, DURATION, FORM, FREQUENCY, RATE, ROUTE_OR_MODE, and STRENGTH.
    */
  var Attributes: js.UndefOr[RxNormAttributeList] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The category of the entity. The recognized categories are GENERIC or BRAND_NAME.
    */
  var Category: js.UndefOr[RxNormEntityCategory] = js.native
  
  /**
    * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  
  /**
    * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  
  /**
    *  The RxNorm concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  var RxNormConcepts: js.UndefOr[RxNormConceptList] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detected entity.
    */
  var Score: js.UndefOr[Float] = js.native
  
  /**
    * The segment of input text extracted from which the entity was detected.
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.native
  
  /**
    *  Contextual information for the entity.
    */
  var Traits: js.UndefOr[RxNormTraitList] = js.native
  
  /**
    *  Describes the specific type of entity. For InferRxNorm, the recognized entity type is MEDICATION.
    */
  var Type: js.UndefOr[RxNormEntityType] = js.native
}
object RxNormEntity {
  
  @scala.inline
  def apply(): RxNormEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormEntity]
  }
  
  @scala.inline
  implicit class RxNormEntityMutableBuilder[Self <: RxNormEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: RxNormAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: RxNormAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    @scala.inline
    def setCategory(value: RxNormEntityCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    @scala.inline
    def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setRxNormConcepts(value: RxNormConceptList): Self = StObject.set(x, "RxNormConcepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxNormConceptsUndefined: Self = StObject.set(x, "RxNormConcepts", js.undefined)
    
    @scala.inline
    def setRxNormConceptsVarargs(value: RxNormConcept*): Self = StObject.set(x, "RxNormConcepts", js.Array(value :_*))
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    @scala.inline
    def setText(value: OntologyLinkingBoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    @scala.inline
    def setTraits(value: RxNormTraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    @scala.inline
    def setTraitsVarargs(value: RxNormTrait*): Self = StObject.set(x, "Traits", js.Array(value :_*))
    
    @scala.inline
    def setType(value: RxNormEntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

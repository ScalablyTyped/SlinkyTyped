package typingsSlinky.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RxNormConcept extends StObject {
  
  /**
    * RxNorm concept ID, also known as the RxCUI.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The description of the RxNorm concept.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported RxNorm concept.
    */
  var Score: js.UndefOr[Float] = js.native
}
object RxNormConcept {
  
  @scala.inline
  def apply(): RxNormConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormConcept]
  }
  
  @scala.inline
  implicit class RxNormConceptMutableBuilder[Self <: RxNormConcept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}

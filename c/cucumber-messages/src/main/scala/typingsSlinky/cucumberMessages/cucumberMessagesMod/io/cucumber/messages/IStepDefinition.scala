package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepDefinition. */
@js.native
trait IStepDefinition extends StObject {
  
  /** StepDefinition id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** StepDefinition pattern */
  var pattern: js.UndefOr[IStepDefinitionPattern | Null] = js.native
  
  /** StepDefinition sourceReference */
  var sourceReference: js.UndefOr[ISourceReference | Null] = js.native
}
object IStepDefinition {
  
  @scala.inline
  def apply(): IStepDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepDefinition]
  }
  
  @scala.inline
  implicit class IStepDefinitionMutableBuilder[Self <: IStepDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPattern(value: IStepDefinitionPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setSourceReference(value: ISourceReference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReferenceNull: Self = StObject.set(x, "sourceReference", null)
    
    @scala.inline
    def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
  }
}

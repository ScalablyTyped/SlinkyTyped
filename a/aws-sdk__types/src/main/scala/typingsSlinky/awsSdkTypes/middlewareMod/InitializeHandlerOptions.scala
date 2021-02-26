package typingsSlinky.awsSdkTypes.middlewareMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.initialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeHandlerOptions extends HandlerOptions {
  
  @JSName("step")
  var step_InitializeHandlerOptions: js.UndefOr[initialize] = js.native
}
object InitializeHandlerOptions {
  
  @scala.inline
  def apply(): InitializeHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeHandlerOptions]
  }
  
  @scala.inline
  implicit class InitializeHandlerOptionsMutableBuilder[Self <: InitializeHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: initialize): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}

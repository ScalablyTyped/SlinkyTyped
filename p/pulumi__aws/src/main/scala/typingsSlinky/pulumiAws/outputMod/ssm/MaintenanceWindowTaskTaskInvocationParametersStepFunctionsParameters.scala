package typingsSlinky.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters extends StObject {
  
  /**
    * The inputs for the STEP_FUNCTION task.
    */
  var input: js.UndefOr[String] = js.native
  
  /**
    * The name of the STEP_FUNCTION task.
    */
  var name: js.UndefOr[String] = js.native
}
object MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

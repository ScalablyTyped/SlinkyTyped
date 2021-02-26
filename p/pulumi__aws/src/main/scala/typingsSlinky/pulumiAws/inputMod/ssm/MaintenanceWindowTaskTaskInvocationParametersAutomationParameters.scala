package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends StObject {
  
  /**
    * The version of an Automation document to use during task execution.
    */
  var documentVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
      ]
    ]
  ] = js.native
}
object MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVersion(value: Input[String]): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
    
    @scala.inline
    def setParameters(
      value: Input[
          js.Array[
            Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
          ]
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}

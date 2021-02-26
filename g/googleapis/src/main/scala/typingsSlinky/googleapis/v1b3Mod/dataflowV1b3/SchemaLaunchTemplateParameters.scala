package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters to provide to the template being launched.
  */
@js.native
trait SchemaLaunchTemplateParameters extends StObject {
  
  /**
    * The runtime environment for the job.
    */
  var environment: js.UndefOr[SchemaRuntimeEnvironment] = js.native
  
  /**
    * Required. The job name to use for the created job.
    */
  var jobName: js.UndefOr[String] = js.native
  
  /**
    * The runtime parameters to pass to the job.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaLaunchTemplateParameters {
  
  @scala.inline
  def apply(): SchemaLaunchTemplateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchTemplateParameters]
  }
  
  @scala.inline
  implicit class SchemaLaunchTemplateParametersMutableBuilder[Self <: SchemaLaunchTemplateParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: SchemaRuntimeEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}

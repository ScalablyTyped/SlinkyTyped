package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetParametersResult extends StObject {
  
  /**
    * A list of parameters that are not formatted correctly or do not run during an execution.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.native
  
  /**
    * A list of details for a parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.native
}
object GetParametersResult {
  
  @scala.inline
  def apply(): GetParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersResult]
  }
  
  @scala.inline
  implicit class GetParametersResultMutableBuilder[Self <: GetParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidParameters(value: ParameterNameList): Self = StObject.set(x, "InvalidParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidParametersUndefined: Self = StObject.set(x, "InvalidParameters", js.undefined)
    
    @scala.inline
    def setInvalidParametersVarargs(value: PSParameterName*): Self = StObject.set(x, "InvalidParameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: ParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}

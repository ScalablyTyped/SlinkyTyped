package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterConstraints extends StObject {
  
  /**
    * Whether or not the parameter is required.
    */
  var Required: js.UndefOr[boolean] = js.native
}
object ParameterConstraints {
  
  @scala.inline
  def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  
  @scala.inline
  implicit class ParameterConstraintsMutableBuilder[Self <: ParameterConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "Required", js.undefined)
  }
}

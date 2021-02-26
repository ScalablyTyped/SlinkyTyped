package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetParameterResult extends StObject {
  
  /**
    * Information about a parameter.
    */
  var Parameter: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Parameter] = js.native
}
object GetParameterResult {
  
  @scala.inline
  def apply(): GetParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParameterResult]
  }
  
  @scala.inline
  implicit class GetParameterResultMutableBuilder[Self <: GetParameterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameter(value: Parameter): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "Parameter", js.undefined)
  }
}

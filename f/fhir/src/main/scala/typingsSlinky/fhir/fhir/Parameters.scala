package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Operation Request or Response
  */
@js.native
trait Parameters
  extends ResourceBase
     with Resource {
  
  /**
    * Operation Parameter
    */
  var parameter: js.UndefOr[js.Array[ParametersParameter]] = js.native
}
object Parameters {
  
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameter(value: js.Array[ParametersParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: ParametersParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
  }
}

package typingsSlinky.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleOfParams extends ErrorParameters {
  
  var multipleOf: Double = js.native
}
object MultipleOfParams {
  
  @scala.inline
  def apply(multipleOf: Double): MultipleOfParams = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOfParams]
  }
  
  @scala.inline
  implicit class MultipleOfParamsMutableBuilder[Self <: MultipleOfParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
  }
}

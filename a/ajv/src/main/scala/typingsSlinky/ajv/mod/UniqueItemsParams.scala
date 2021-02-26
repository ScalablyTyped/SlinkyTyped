package typingsSlinky.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueItemsParams extends ErrorParameters {
  
  var i: Double = js.native
  
  var j: Double = js.native
}
object UniqueItemsParams {
  
  @scala.inline
  def apply(i: Double, j: Double): UniqueItemsParams = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueItemsParams]
  }
  
  @scala.inline
  implicit class UniqueItemsParamsMutableBuilder[Self <: UniqueItemsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
  }
}

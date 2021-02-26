package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MissingParams extends Message {
  
  /**
    * A list of the missing parameters.
    */
  var params: String | js.Array[String] = js.native
}
object MissingParams {
  
  @scala.inline
  def apply(params: String | js.Array[String], `type`: String): MissingParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingParams]
  }
  
  @scala.inline
  implicit class MissingParamsMutableBuilder[Self <: MissingParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: String | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
  }
}

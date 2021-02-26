package typingsSlinky.isMyJsonValid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyOneOfSchema extends _AnySchema {
  
  var oneOf: js.Array[AnySchema] = js.native
}
object AnyOneOfSchema {
  
  @scala.inline
  def apply(oneOf: js.Array[AnySchema]): AnyOneOfSchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOneOfSchema]
  }
  
  @scala.inline
  implicit class AnyOneOfSchemaMutableBuilder[Self <: AnyOneOfSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneOf(value: js.Array[AnySchema]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfVarargs(value: AnySchema*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
  }
}

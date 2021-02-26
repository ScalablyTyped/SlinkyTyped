package typingsSlinky.isMyJsonValid.mod

import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`null`
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableStringSchema extends _AnySchema {
  
  var `type`: js.Array[string | `null`] = js.native
}
object NullableStringSchema {
  
  @scala.inline
  def apply(`type`: js.Array[string | `null`]): NullableStringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableStringSchema]
  }
  
  @scala.inline
  implicit class NullableStringSchemaMutableBuilder[Self <: NullableStringSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: js.Array[string | `null`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: (string | `null`)*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}

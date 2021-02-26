package typingsSlinky.isMyJsonValid.mod

import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`null`
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`object`
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyNullableAllOptionalObjectSchema
  extends NullableAllOptionalObjectSchema[Record[String, AnySchema]]
     with _AnySchema
object AnyNullableAllOptionalObjectSchema {
  
  @scala.inline
  def apply(properties: Record[String, AnySchema], `type`: js.Array[`object` | `null`]): AnyNullableAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNullableAllOptionalObjectSchema]
  }
}

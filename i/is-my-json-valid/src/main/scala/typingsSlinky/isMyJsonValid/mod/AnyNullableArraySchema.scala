package typingsSlinky.isMyJsonValid.mod

import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`null`
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyNullableArraySchema
  extends NullableArraySchema[AnySchema]
     with _AnySchema
object AnyNullableArraySchema {
  
  @scala.inline
  def apply(items: AnySchema, `type`: js.Array[array | `null`]): AnyNullableArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNullableArraySchema]
  }
}

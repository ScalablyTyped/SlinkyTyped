package typingsSlinky.isMyJsonValid.mod

import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`object`
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyAllOptionalObjectSchema
  extends AllOptionalObjectSchema[Record[String, AnySchema]]
     with _AnySchema
object AnyAllOptionalObjectSchema {
  
  @scala.inline
  def apply(properties: Record[String, AnySchema], `type`: `object`): AnyAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAllOptionalObjectSchema]
  }
}

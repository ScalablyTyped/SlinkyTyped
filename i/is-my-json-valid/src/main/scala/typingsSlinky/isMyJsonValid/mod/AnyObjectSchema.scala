package typingsSlinky.isMyJsonValid.mod

import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`object`
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyObjectSchema
  extends ObjectSchema[Record[String, AnySchema], String]
     with _AnySchema
object AnyObjectSchema {
  
  @scala.inline
  def apply(properties: Record[String, AnySchema], required: js.Array[String], `type`: `object`): AnyObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyObjectSchema]
  }
}

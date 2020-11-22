package typingsSlinky.isMyJsonValid.mod

import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`null`
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`object`
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.array
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.boolean
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.number
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.string
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AnySchema extends js.Object
object _AnySchema {
  
  @scala.inline
  def AnyNullableArraySchema(items: AnySchema, `type`: js.Array[array | `null`]): _AnySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def NullSchema(`type`: `null`): _AnySchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def AnyArraySchema(items: AnySchema, `type`: array): _AnySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def StringSchema(`type`: string): _AnySchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def BooleanSchema(`type`: boolean): _AnySchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def AnyNullableAllOptionalObjectSchema(properties: Record[String, AnySchema], `type`: js.Array[`object` | `null`]): _AnySchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def NullableBooleanSchema(`type`: js.Array[boolean | `null`]): _AnySchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def NullableStringSchema(`type`: js.Array[string | `null`]): _AnySchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def NumberSchema(`type`: number): _AnySchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def AnyOneOfSchema(oneOf: js.Array[AnySchema]): _AnySchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def NullableNumberSchema(`type`: js.Array[number | `null`]): _AnySchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def AnyObjectSchema(properties: Record[String, AnySchema], required: js.Array[String], `type`: `object`): _AnySchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def AnyNullableObjectSchema(
    properties: Record[String, AnySchema],
    required: js.Array[String],
    `type`: js.Array[`object` | `null`]
  ): _AnySchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
  
  @scala.inline
  def AnyAllOptionalObjectSchema(properties: Record[String, AnySchema], `type`: `object`): _AnySchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AnySchema]
  }
}

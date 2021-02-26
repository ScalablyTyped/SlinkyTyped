package typingsSlinky.isMyJsonValid.mod

import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`null`
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.`object`
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.array
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.boolean
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.number
import typingsSlinky.isMyJsonValid.isMyJsonValidStrings.string
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AnySchema extends StObject
object _AnySchema {
  
  @scala.inline
  def AnyAllOptionalObjectSchema(properties: Record[String, AnySchema], `type`: `object`): typingsSlinky.isMyJsonValid.mod.AnyAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.AnyAllOptionalObjectSchema]
  }
  
  @scala.inline
  def AnyArraySchema(items: AnySchema, `type`: array): typingsSlinky.isMyJsonValid.mod.AnyArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.AnyArraySchema]
  }
  
  @scala.inline
  def AnyNullableAllOptionalObjectSchema(properties: Record[String, AnySchema], `type`: js.Array[`object` | `null`]): typingsSlinky.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema]
  }
  
  @scala.inline
  def AnyNullableArraySchema(items: AnySchema, `type`: js.Array[array | `null`]): typingsSlinky.isMyJsonValid.mod.AnyNullableArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.AnyNullableArraySchema]
  }
  
  @scala.inline
  def AnyNullableObjectSchema(
    properties: Record[String, AnySchema],
    required: js.Array[String],
    `type`: js.Array[`object` | `null`]
  ): typingsSlinky.isMyJsonValid.mod.AnyNullableObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.AnyNullableObjectSchema]
  }
  
  @scala.inline
  def AnyObjectSchema(properties: Record[String, AnySchema], required: js.Array[String], `type`: `object`): typingsSlinky.isMyJsonValid.mod.AnyObjectSchema = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.AnyObjectSchema]
  }
  
  @scala.inline
  def AnyOneOfSchema(oneOf: js.Array[AnySchema]): typingsSlinky.isMyJsonValid.mod.AnyOneOfSchema = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.AnyOneOfSchema]
  }
  
  @scala.inline
  def BooleanSchema(`type`: boolean): typingsSlinky.isMyJsonValid.mod.BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.BooleanSchema]
  }
  
  @scala.inline
  def NullSchema(`type`: `null`): typingsSlinky.isMyJsonValid.mod.NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.NullSchema]
  }
  
  @scala.inline
  def NullableBooleanSchema(`type`: js.Array[boolean | `null`]): typingsSlinky.isMyJsonValid.mod.NullableBooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.NullableBooleanSchema]
  }
  
  @scala.inline
  def NullableNumberSchema(`type`: js.Array[number | `null`]): typingsSlinky.isMyJsonValid.mod.NullableNumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.NullableNumberSchema]
  }
  
  @scala.inline
  def NullableStringSchema(`type`: js.Array[string | `null`]): typingsSlinky.isMyJsonValid.mod.NullableStringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.NullableStringSchema]
  }
  
  @scala.inline
  def NumberSchema(`type`: number): typingsSlinky.isMyJsonValid.mod.NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.NumberSchema]
  }
  
  @scala.inline
  def StringSchema(`type`: string): typingsSlinky.isMyJsonValid.mod.StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.isMyJsonValid.mod.StringSchema]
  }
}

package typingsSlinky.isMyJsonValid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyEnumSchema = typingsSlinky.isMyJsonValid.mod.EnumSchema[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.isMyJsonValid.mod.NullSchema
    - typingsSlinky.isMyJsonValid.mod.BooleanSchema
    - typingsSlinky.isMyJsonValid.mod.NullableBooleanSchema
    - typingsSlinky.isMyJsonValid.mod.NumberSchema
    - typingsSlinky.isMyJsonValid.mod.NullableNumberSchema
    - typingsSlinky.isMyJsonValid.mod.StringSchema
    - typingsSlinky.isMyJsonValid.mod.NullableStringSchema
    - typingsSlinky.isMyJsonValid.mod.AnyEnumSchema
    - typingsSlinky.isMyJsonValid.mod.AnyArraySchema
    - typingsSlinky.isMyJsonValid.mod.AnyNullableArraySchema
    - typingsSlinky.isMyJsonValid.mod.AnyObjectSchema
    - typingsSlinky.isMyJsonValid.mod.AnyNullableObjectSchema
    - typingsSlinky.isMyJsonValid.mod.AnyAllOptionalObjectSchema
    - typingsSlinky.isMyJsonValid.mod.AnyNullableAllOptionalObjectSchema
    - typingsSlinky.isMyJsonValid.mod.AnyOneOfSchema
  */
  type AnySchema = typingsSlinky.isMyJsonValid.mod._AnySchema | typingsSlinky.isMyJsonValid.mod.AnyEnumSchema
  
  type Filter[Schema /* <: typingsSlinky.isMyJsonValid.mod.AnySchema */, Output] = js.Function2[/* input */ Output, /* options */ js.UndefOr[js.Any], Output]
  
  type ObjectFromSchema[Properties /* <: typingsSlinky.std.Record[java.lang.String, typingsSlinky.isMyJsonValid.mod.AnySchema] */, Required /* <: typingsSlinky.isMyJsonValid.mod.StringKeys[Properties] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Properties ]: Key extends Required? is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> : is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> | undefined}
    */ typingsSlinky.isMyJsonValid.isMyJsonValidStrings.ObjectFromSchema with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type StringKeys[T] = /* keyof T */ java.lang.String
  
  type TypeFromSchema[Schema /* <: typingsSlinky.isMyJsonValid.mod.AnySchema */] = (typingsSlinky.isMyJsonValid.mod.ObjectFromSchema[js.Any, js.Any | scala.Nothing]) | scala.Null | typingsSlinky.isMyJsonValid.mod.ArrayFromSchema[js.Any] | java.lang.String | scala.Double | scala.Boolean
}

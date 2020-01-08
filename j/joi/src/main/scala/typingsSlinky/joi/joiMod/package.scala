package typingsSlinky.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object joiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.joi.Anon_Context
  import typingsSlinky.joi.Anon_Key
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Record

  type DefaultsFunction = js.Function1[/* root */ Schema, Schema]
  type ExtensionBoundSchema = Schema with Anon_Context
  type LanguageOptions = String | Boolean | Null | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias joi.joi.LanguageOptions */ js.Object
  ])
  type LanguageRootOptions = Anon_Key with (Partial[Record[Types, LanguageOptions]])
  type LazySchema = AnySchema
  /* Rewritten from type alias, can be one of: 
    - typings.joi.joiMod.AnySchema
    - typings.joi.joiMod.ArraySchema
    - typings.joi.joiMod.AlternativesSchema
    - typings.joi.joiMod.BinarySchema
    - typings.joi.joiMod.BooleanSchema
    - typings.joi.joiMod.DateSchema
    - typings.joi.joiMod.FunctionSchema
    - typings.joi.joiMod.NumberSchema
    - typings.joi.joiMod.ObjectSchema
    - typings.joi.joiMod.StringSchema
    - typings.joi.joiMod.LazySchema
  */
  type Schema = _Schema | LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.joi.joiMod.Schema
    - typings.joi.joiMod.SchemaMap
  */
  type SchemaLike = _SchemaLike | String | Double | Boolean | js.Object | Null | LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    String | ValidationErrorItem | js.Array[ValidationErrorItem] | js.Error
  ]
}

package typingsSlinky.joi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultsFunction = js.Function1[/* root */ typingsSlinky.joi.mod.Schema, typingsSlinky.joi.mod.Schema]
  type ExtensionBoundSchema = typingsSlinky.joi.mod.Schema with typingsSlinky.joi.AnonCreateError
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias joi.joi.LanguageOptions */ js.Object
  ])
  type LazySchema = typingsSlinky.joi.mod.AnySchema
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.joi.mod.AnySchema
    - typingsSlinky.joi.mod.ArraySchema
    - typingsSlinky.joi.mod.AlternativesSchema
    - typingsSlinky.joi.mod.BinarySchema
    - typingsSlinky.joi.mod.BooleanSchema
    - typingsSlinky.joi.mod.DateSchema
    - typingsSlinky.joi.mod.FunctionSchema
    - typingsSlinky.joi.mod.NumberSchema
    - typingsSlinky.joi.mod.ObjectSchema
    - typingsSlinky.joi.mod.StringSchema
    - typingsSlinky.joi.mod.LazySchema
  */
  type Schema = typingsSlinky.joi.mod._Schema | typingsSlinky.joi.mod.LazySchema
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typingsSlinky.joi.mod.Schema
    - typingsSlinky.joi.mod.SchemaMap
  */
  type SchemaLike = typingsSlinky.joi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typingsSlinky.joi.mod.LazySchema
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.joi.mod.ValidationErrorItem], 
    java.lang.String | typingsSlinky.joi.mod.ValidationErrorItem | js.Array[typingsSlinky.joi.mod.ValidationErrorItem] | js.Error
  ]
}

package typingsSlinky.reactNativeJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtensionBoundSchema = typingsSlinky.reactNativeJoi.mod.Schema with typingsSlinky.reactNativeJoi.anon.CreateError
  
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-joi.react-native-joi.LanguageOptions */ js.Object
  ])
  
  type LazySchema = typingsSlinky.reactNativeJoi.mod.AnySchema
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeJoi.mod.AnySchema
    - typingsSlinky.reactNativeJoi.mod.ArraySchema
    - typingsSlinky.reactNativeJoi.mod.AlternativesSchema
    - typingsSlinky.reactNativeJoi.mod.BinarySchema
    - typingsSlinky.reactNativeJoi.mod.BooleanSchema
    - typingsSlinky.reactNativeJoi.mod.DateSchema
    - typingsSlinky.reactNativeJoi.mod.FunctionSchema
    - typingsSlinky.reactNativeJoi.mod.NumberSchema
    - typingsSlinky.reactNativeJoi.mod.ObjectSchema
    - typingsSlinky.reactNativeJoi.mod.StringSchema
    - typingsSlinky.reactNativeJoi.mod.LazySchema
  */
  type Schema = typingsSlinky.reactNativeJoi.mod._Schema | typingsSlinky.reactNativeJoi.mod.LazySchema
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typingsSlinky.reactNativeJoi.mod.Schema
    - typingsSlinky.reactNativeJoi.mod.SchemaMap
  */
  type SchemaLike = typingsSlinky.reactNativeJoi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typingsSlinky.reactNativeJoi.mod.LazySchema
  
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.reactNativeJoi.mod.ValidationErrorItem], 
    java.lang.String | typingsSlinky.reactNativeJoi.mod.ValidationErrorItem | js.Array[typingsSlinky.reactNativeJoi.mod.ValidationErrorItem] | js.Error
  ]
}

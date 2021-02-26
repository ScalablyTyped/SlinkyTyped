package typingsSlinky.joi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicType = scala.Boolean | scala.Double | java.lang.String | js.Array[js.Any] | js.Object | scala.Null
  
  type CoerceFunction = js.Function2[
    /* value */ js.Any, 
    /* helpers */ typingsSlinky.joi.mod.CustomHelpers[js.Any], 
    typingsSlinky.joi.mod.CoerceResult
  ]
  
  type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  
  type CustomValidator[V] = js.Function2[
    /* value */ V, 
    /* helpers */ typingsSlinky.joi.mod.CustomHelpers[js.Any], 
    V | typingsSlinky.joi.mod.ErrorReport
  ]
  
  type ExtensionBoundSchema = typingsSlinky.joi.mod.Schema with typingsSlinky.joi.mod.SchemaInternals
  
  type ExtensionFactory = js.Function1[/* joi */ typingsSlinky.joi.mod.Root, typingsSlinky.joi.mod.Extension]
  
  type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]
  
  type LanguageMessages = typingsSlinky.std.Record[java.lang.String, java.lang.String]
  
  type RuleMethod = js.Function1[/* repeated */ js.Any, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.joi.mod.AnySchema
    - typingsSlinky.joi.mod.ArraySchema
    - typingsSlinky.joi.mod.AlternativesSchema
    - typingsSlinky.joi.mod.BinarySchema
    - typingsSlinky.joi.mod.BooleanSchema
    - typingsSlinky.joi.mod.DateSchema
    - typingsSlinky.joi.mod.FunctionSchema
    - typingsSlinky.joi.mod.NumberSchema
    - typingsSlinky.joi.mod.ObjectSchema[js.Any]
    - typingsSlinky.joi.mod.StringSchema
    - typingsSlinky.joi.mod.LinkSchema
    - typingsSlinky.joi.mod.SymbolSchema
  */
  type Schema = typingsSlinky.joi.mod._Schema | typingsSlinky.joi.mod.ObjectSchema[js.Any]
  
  type SchemaFunction = js.Function1[/* schema */ typingsSlinky.joi.mod.Schema, typingsSlinky.joi.mod.Schema]
  
  type SchemaLike = typingsSlinky.joi.mod.SchemaLikeWithoutArray | js.Object
  
  type SchemaLikeWithoutArray = java.lang.String | scala.Double | scala.Boolean | scala.Null | typingsSlinky.joi.mod.Schema | typingsSlinky.joi.mod.SchemaMap[js.Any]
  
  type SchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSchema ]:? joi.joi.SchemaLike | std.Array<joi.joi.SchemaLike>}
    */ typingsSlinky.joi.joiStrings.SchemaMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.joi.mod.ErrorReport], 
    java.lang.String | typingsSlinky.joi.mod.ValidationErrorItem | js.Error
  ]
}

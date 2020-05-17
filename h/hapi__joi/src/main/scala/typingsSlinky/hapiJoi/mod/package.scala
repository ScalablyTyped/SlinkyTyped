package typingsSlinky.hapiJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CoerceFunction = js.Function2[
    /* value */ js.Any, 
    /* helpers */ typingsSlinky.hapiJoi.mod.CustomHelpers[js.Any], 
    typingsSlinky.hapiJoi.mod.CoerceResult
  ]
  type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  type CustomValidator[V] = js.Function2[/* value */ V, /* helpers */ typingsSlinky.hapiJoi.mod.CustomHelpers[js.Any], V]
  type ExtensionBoundSchema = typingsSlinky.hapiJoi.mod.Schema with typingsSlinky.hapiJoi.mod.SchemaInternals
  type ExtensionFactory = js.Function1[/* joi */ typingsSlinky.hapiJoi.mod.Root, typingsSlinky.hapiJoi.mod.Extension]
  type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]
  type LanguageMessages = typingsSlinky.std.Record[java.lang.String, java.lang.String]
  type RuleMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type SchemaFunction = js.Function1[/* schema */ typingsSlinky.hapiJoi.mod.Schema, typingsSlinky.hapiJoi.mod.Schema]
  type SchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSchema ]:? @hapi/joi.@hapi/joi.SchemaLike | std.Array<@hapi/joi.@hapi/joi.SchemaLike>}
    */ typingsSlinky.hapiJoi.hapiJoiStrings.SchemaMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.hapiJoi.mod.ErrorReport], 
    java.lang.String | typingsSlinky.hapiJoi.mod.ValidationErrorItem | js.Error
  ]
}

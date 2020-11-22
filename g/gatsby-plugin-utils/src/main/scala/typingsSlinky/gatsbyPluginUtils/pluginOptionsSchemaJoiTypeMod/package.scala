package typingsSlinky.gatsbyPluginUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pluginOptionsSchemaJoiTypeMod {
  
  type BasicType = scala.Boolean | scala.Double | java.lang.String | js.Array[js.Any] | js.Object | scala.Null
  
  type CoerceFunction = js.Function2[
    /* value */ js.Any, 
    /* helpers */ typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.CustomHelpers[js.Any], 
    typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.CoerceResult
  ]
  
  type ComparatorFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  
  type CustomValidator[V] = js.Function2[
    /* value */ V, 
    /* helpers */ typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.CustomHelpers[js.Any], 
    V
  ]
  
  type ExtensionBoundSchema = typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema with typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SchemaInternals
  
  type ExtensionFactory = js.Function1[
    /* joi */ typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.PluginOptionsSchemaJoi, 
    typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Extension
  ]
  
  type ExternalValidationFunction = js.Function1[/* value */ js.Any, js.Any]
  
  type LanguageMessages = typingsSlinky.std.Record[java.lang.String, java.lang.String]
  
  type RuleMethod = js.Function1[/* repeated */ js.Any, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.AnySchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ArraySchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.AlternativesSchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.BinarySchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.BooleanSchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.DateSchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.FunctionSchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.NumberSchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema[js.Any]
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.StringSchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.LinkSchema
    - typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SymbolSchema
  */
  type Schema = typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod._Schema | typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema[js.Any]
  
  type SchemaFunction = js.Function1[
    /* schema */ typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema, 
    typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema
  ]
  
  type SchemaLike = typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SchemaLikeWithoutArray | js.Object
  
  type SchemaLikeWithoutArray = java.lang.String | scala.Double | scala.Boolean | scala.Null | typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.Schema | typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.SchemaMap[js.Any]
  
  type SchemaMap[TSchema] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSchema ]:? gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.SchemaLike | std.Array<gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.SchemaLike>}
    */ typingsSlinky.gatsbyPluginUtils.gatsbyPluginUtilsStrings.SchemaMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ErrorReport], 
    java.lang.String | typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ValidationErrorItem | js.Error
  ]
}

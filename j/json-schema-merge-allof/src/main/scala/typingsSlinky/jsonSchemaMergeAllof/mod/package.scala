package typingsSlinky.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JSONSchema = typingsSlinky.jsonSchema.mod.JSONSchema4 | typingsSlinky.jsonSchema.mod.JSONSchema6 | typingsSlinky.jsonSchema.mod.JSONSchema7
  
  type JSONSchema46 = typingsSlinky.jsonSchema.mod.JSONSchema4 | typingsSlinky.jsonSchema.mod.JSONSchema6
  
  type MergeChildSchemas = js.Function2[
    /* schemas */ js.Array[typingsSlinky.jsonSchemaMergeAllof.mod.JSONSchema], 
    /* childSchemaName */ java.lang.String, 
    typingsSlinky.jsonSchemaMergeAllof.mod.JSONSchema
  ]
  
  type MergeSchemas = js.Function1[
    /* schemas */ js.Array[typingsSlinky.jsonSchemaMergeAllof.mod.JSONSchema], 
    typingsSlinky.jsonSchemaMergeAllof.mod.JSONSchema
  ]
}

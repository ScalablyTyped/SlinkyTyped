package typingsSlinky.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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

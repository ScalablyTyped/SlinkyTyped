package typingsSlinky.apidevtoolsJsonSchemaRefParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSONSchema = typingsSlinky.jsonSchema.mod.JSONSchema4 | typingsSlinky.jsonSchema.mod.JSONSchema6
  type RefsCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* $refs */ js.UndefOr[typingsSlinky.apidevtoolsJsonSchemaRefParser.mod.Refs], 
    js.Any
  ]
  type SchemaCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* schema */ js.UndefOr[typingsSlinky.apidevtoolsJsonSchemaRefParser.mod.JSONSchema], 
    js.Any
  ]
}

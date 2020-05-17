package typingsSlinky.jsonSchemaRefParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RefsCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* $refs */ js.UndefOr[typingsSlinky.jsonSchemaRefParser.mod.Refs], 
    js.Any
  ]
  type SchemaCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* schema */ js.UndefOr[typingsSlinky.jsonSchemaRefParser.mod.JSONSchema], 
    js.Any
  ]
}

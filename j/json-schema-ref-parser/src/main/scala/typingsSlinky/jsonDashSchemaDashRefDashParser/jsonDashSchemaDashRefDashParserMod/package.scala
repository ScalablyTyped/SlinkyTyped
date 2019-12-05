package typingsSlinky.jsonDashSchemaDashRefDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashSchemaDashRefDashParserMod {
  import typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  import typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6

  type $RefsCallback = js.Function2[/* err */ js.Error | Null, /* $refs */ js.UndefOr[$Refs], js.Any]
  type JSONSchema = JSONSchema4 | JSONSchema6
  type SchemaCallback = js.Function2[/* err */ js.Error | Null, /* schema */ js.UndefOr[JSONSchema], js.Any]
}

package typingsSlinky.jsonSchemaMergeAllof.anon

import typingsSlinky.jsonSchemaMergeAllof.mod.JSONSchema
import typingsSlinky.jsonSchemaMergeAllof.mod.MergeChildSchemas
import typingsSlinky.jsonSchemaMergeAllof.mod.MergeSchemas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalProperties extends js.Object {
  @JSName("additionalProperties")
  var additionalProperties_Original: MergeSchemas = js.native
  @JSName("patternProperties")
  var patternProperties_Original: MergeChildSchemas = js.native
  @JSName("properties")
  var properties_Original: MergeChildSchemas = js.native
  def additionalProperties[T /* <: JSONSchema */](schemas: js.Array[T]): T = js.native
  def patternProperties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T = js.native
  def properties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T = js.native
}


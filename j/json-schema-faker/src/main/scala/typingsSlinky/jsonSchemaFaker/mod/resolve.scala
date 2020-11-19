package typingsSlinky.jsonSchemaFaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-schema-faker", "resolve")
@js.native
object resolve extends js.Object {
  
  def apply(schema: Schema): js.Promise[js.Array[_]] = js.native
  def apply(schema: Schema, refs: js.UndefOr[scala.Nothing], cwd: String): js.Promise[js.Array[_]] = js.native
  def apply(schema: Schema, refs: String): js.Promise[js.Array[_]] = js.native
  def apply(schema: Schema, refs: String, cwd: String): js.Promise[js.Array[_]] = js.native
  def apply(schema: Schema, refs: js.Array[Schema]): js.Promise[js.Array[_]] = js.native
  def apply(schema: Schema, refs: js.Array[Schema], cwd: String): js.Promise[js.Array[_]] = js.native
}

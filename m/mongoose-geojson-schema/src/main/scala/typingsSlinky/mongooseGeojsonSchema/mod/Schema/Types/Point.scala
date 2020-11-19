package typingsSlinky.mongooseGeojsonSchema.mod.Schema.Types

import typingsSlinky.mongoose.mod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "Schema.Types.Point")
@js.native
class Point protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  
  def cast(geojson: js.Object): this.type = js.native
}
/* static members */
@JSImport("mongoose", "Schema.Types.Point")
@js.native
object Point extends js.Object {
  
  var schemaName: typingsSlinky.mongooseGeojsonSchema.mongooseGeojsonSchemaStrings.Point = js.native
}

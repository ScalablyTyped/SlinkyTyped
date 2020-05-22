package typingsSlinky.peculiarJsonSchema

import typingsSlinky.peculiarJsonSchema.jsonErrorMod.JsonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/errors/serializer_error", JSImport.Namespace)
@js.native
object serializerErrorMod extends js.Object {
  @js.native
  class SerializerError protected () extends JsonError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: js.Error) = this()
    var schemaName: String = js.native
  }
  
}


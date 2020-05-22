package typingsSlinky.peculiarJsonSchema

import typingsSlinky.peculiarJsonSchema.keyErrorMod.IKeyErrors
import typingsSlinky.peculiarJsonSchema.schemaMod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class JsonError protected ()
    extends typingsSlinky.peculiarJsonSchema.jsonErrorMod.JsonError {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class KeyError protected ()
    extends typingsSlinky.peculiarJsonSchema.keyErrorMod.KeyError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
  }
  
  @js.native
  class ParserError protected ()
    extends typingsSlinky.peculiarJsonSchema.parserErrorMod.ParserError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class SerializerError protected ()
    extends typingsSlinky.peculiarJsonSchema.serializerErrorMod.SerializerError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class TransformError protected ()
    extends typingsSlinky.peculiarJsonSchema.transformErrorMod.TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class ValidationError ()
    extends typingsSlinky.peculiarJsonSchema.jsonErrorMod.JsonError
  
}


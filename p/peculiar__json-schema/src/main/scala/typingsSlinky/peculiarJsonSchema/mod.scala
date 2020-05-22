package typingsSlinky.peculiarJsonSchema

import typingsSlinky.peculiarJsonSchema.decoratorsMod.IJsonPropOptions
import typingsSlinky.peculiarJsonSchema.keyErrorMod.IKeyErrors
import typingsSlinky.peculiarJsonSchema.parserMod.IJsonParserOptions
import typingsSlinky.peculiarJsonSchema.schemaMod.IJsonSchema
import typingsSlinky.peculiarJsonSchema.serializerMod.IJsonSerializerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonError protected ()
    extends typingsSlinky.peculiarJsonSchema.errorsMod.JsonError {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class JsonParser ()
    extends typingsSlinky.peculiarJsonSchema.parserMod.JsonParser
  
  @js.native
  class JsonSerializer ()
    extends typingsSlinky.peculiarJsonSchema.serializerMod.JsonSerializer
  
  @js.native
  class KeyError protected ()
    extends typingsSlinky.peculiarJsonSchema.errorsMod.KeyError {
    def this(schema: IJsonSchema, keys: js.Array[String]) = this()
    def this(schema: IJsonSchema, keys: js.Array[String], errors: IKeyErrors) = this()
  }
  
  @js.native
  class ParserError protected ()
    extends typingsSlinky.peculiarJsonSchema.errorsMod.ParserError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class SerializerError protected ()
    extends typingsSlinky.peculiarJsonSchema.errorsMod.SerializerError {
    def this(schemaName: String, message: String) = this()
    def this(schemaName: String, message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class TransformError protected ()
    extends typingsSlinky.peculiarJsonSchema.errorsMod.TransformError {
    def this(schema: IJsonSchema, message: String) = this()
    def this(schema: IJsonSchema, message: String, innerError: js.Error) = this()
  }
  
  @js.native
  class ValidationError ()
    extends typingsSlinky.peculiarJsonSchema.jsonErrorMod.JsonError
  
  def JsonProp(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def JsonProp(options: IJsonPropOptions): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  /* static members */
  @js.native
  object JsonParser extends js.Object {
    /**
      * Checks for odd properties in target object.
      * @param target Target object
      * @param namedSchema Named schema with a list of properties
      * @param schema
      * @throws Throws ParserError exception whenever target object has odd property
      */
    var checkStrictProperty: js.Any = js.native
    def fromJSON[T](target: js.Any, options: IJsonParserOptions[T]): T = js.native
    def parse[T](data: String, options: IJsonParserOptions[T]): T = js.native
  }
  
  @js.native
  object JsonPropTypes extends js.Object {
    /* 0 */ val Any: typingsSlinky.peculiarJsonSchema.propTypesMod.JsonPropTypes.Any with Double = js.native
    /* 1 */ val Boolean: typingsSlinky.peculiarJsonSchema.propTypesMod.JsonPropTypes.Boolean with Double = js.native
    /* 2 */ val Number: typingsSlinky.peculiarJsonSchema.propTypesMod.JsonPropTypes.Number with Double = js.native
    /* 3 */ val String: typingsSlinky.peculiarJsonSchema.propTypesMod.JsonPropTypes.String with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.peculiarJsonSchema.propTypesMod.JsonPropTypes with Double] = js.native
  }
  
  /* static members */
  @js.native
  object JsonSerializer extends js.Object {
    def serialize(obj: js.Any): String = js.native
    def serialize(obj: js.Any, options: IJsonSerializerOptions): String = js.native
    def serialize(
      obj: js.Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _]
    ): String = js.native
    def serialize(
      obj: js.Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      space: String
    ): String = js.native
    def serialize(
      obj: js.Any,
      options: IJsonSerializerOptions,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      space: Double
    ): String = js.native
    def toJSON(obj: js.Any): js.Any = js.native
    def toJSON(obj: js.Any, options: IJsonSerializerOptions): js.Any = js.native
  }
  
}


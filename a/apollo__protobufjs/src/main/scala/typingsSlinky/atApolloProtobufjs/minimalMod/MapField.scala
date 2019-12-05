package typingsSlinky.atApolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.Constructor
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.FieldDecorator
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.IMapField
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.bool
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.bytes
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.double
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.fixed32
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.fixed64
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.float
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.int32
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.int64
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.sfixed32
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.sfixed64
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.sint32
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.sint64
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.string
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.uint32
import typingsSlinky.atApolloProtobufjs.atApolloProtobufjsStrings.uint64
import typingsSlinky.long.longMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/minimal", "MapField")
@js.native
class MapField protected ()
  extends typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.MapField {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String, id: Double, keyType: String, `type`: String) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[js.Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
}

/* static members */
@JSImport("@apollo/protobufjs/minimal", "MapField")
@js.native
object MapField extends js.Object {
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  def d[T /* <: StringDictionary[
    Double | ^  | String | Boolean | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes | js.Object | Constructor[js.Object]
  ): FieldDecorator = js.native
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IMapField): typingsSlinky.atApolloProtobufjs.atApolloProtobufjsMod.MapField = js.native
}


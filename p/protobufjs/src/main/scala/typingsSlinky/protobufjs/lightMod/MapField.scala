package typingsSlinky.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.Constructor
import typingsSlinky.protobufjs.mod.FieldDecorator
import typingsSlinky.protobufjs.mod.IMapField
import typingsSlinky.protobufjs.mod.Long
import typingsSlinky.protobufjs.protobufjsStrings.bool
import typingsSlinky.protobufjs.protobufjsStrings.bytes
import typingsSlinky.protobufjs.protobufjsStrings.double
import typingsSlinky.protobufjs.protobufjsStrings.fixed32
import typingsSlinky.protobufjs.protobufjsStrings.fixed64
import typingsSlinky.protobufjs.protobufjsStrings.float
import typingsSlinky.protobufjs.protobufjsStrings.int32
import typingsSlinky.protobufjs.protobufjsStrings.int64
import typingsSlinky.protobufjs.protobufjsStrings.sfixed32
import typingsSlinky.protobufjs.protobufjsStrings.sfixed64
import typingsSlinky.protobufjs.protobufjsStrings.sint32
import typingsSlinky.protobufjs.protobufjsStrings.sint64
import typingsSlinky.protobufjs.protobufjsStrings.string
import typingsSlinky.protobufjs.protobufjsStrings.uint32
import typingsSlinky.protobufjs.protobufjsStrings.uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "MapField")
@js.native
class MapField protected ()
  extends typingsSlinky.protobufjs.mod.MapField {
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
@JSImport("protobufjs/light", "MapField")
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
    Double | Long | String | Boolean | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | typingsSlinky.protobufjs.mod.Message[js.Object]
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
  def fromJSON(name: String, json: IMapField): typingsSlinky.protobufjs.mod.MapField = js.native
}


package typingsSlinky.googleDashGax.buildSrcFallbackMod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleDashGax.googleDashGaxStrings.bool
import typingsSlinky.googleDashGax.googleDashGaxStrings.bytes
import typingsSlinky.googleDashGax.googleDashGaxStrings.double
import typingsSlinky.googleDashGax.googleDashGaxStrings.fixed32
import typingsSlinky.googleDashGax.googleDashGaxStrings.fixed64
import typingsSlinky.googleDashGax.googleDashGaxStrings.float
import typingsSlinky.googleDashGax.googleDashGaxStrings.int32
import typingsSlinky.googleDashGax.googleDashGaxStrings.int64
import typingsSlinky.googleDashGax.googleDashGaxStrings.sfixed32
import typingsSlinky.googleDashGax.googleDashGaxStrings.sfixed64
import typingsSlinky.googleDashGax.googleDashGaxStrings.sint32
import typingsSlinky.googleDashGax.googleDashGaxStrings.sint64
import typingsSlinky.googleDashGax.googleDashGaxStrings.string
import typingsSlinky.googleDashGax.googleDashGaxStrings.uint32
import typingsSlinky.googleDashGax.googleDashGaxStrings.uint64
import typingsSlinky.protobufjs.protobufjsMod.Buffer
import typingsSlinky.protobufjs.protobufjsMod.Constructor
import typingsSlinky.protobufjs.protobufjsMod.FieldDecorator
import typingsSlinky.protobufjs.protobufjsMod.IMapField
import typingsSlinky.protobufjs.protobufjsMod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "protobuf.MapField")
@js.native
class MapField protected ()
  extends typingsSlinky.protobufjs.protobufjsMod.MapField {
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
@JSImport("google-gax/build/src/fallback", "protobuf.MapField")
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
    Double | Long | String | Boolean | scala.scalajs.js.typedarray.Uint8Array | Buffer | js.Array[Double] | typingsSlinky.protobufjs.protobufjsMod.Message[js.Object]
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
  def fromJSON(name: String, json: IMapField): typingsSlinky.protobufjs.protobufjsMod.MapField = js.native
}


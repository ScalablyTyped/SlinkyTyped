package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.bool
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.bytes
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.double
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.fixed32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.fixed64
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.float
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.int32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.int64
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sfixed32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sfixed64
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sint32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sint64
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.string
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.uint32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.uint64
import typingsSlinky.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "MapField")
@js.native
class MapField protected () extends FieldBase {
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
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  
  /** Key type. */
  var keyType: String = js.native
  
  /** Resolved key type if not a basic type. */
  var resolvedKeyType: ReflectionObject | Null = js.native
}
/* static members */
@JSImport("@apollo/protobufjs", "MapField")
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
    Double | Long | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | Message[js.Object]
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
  def fromJSON(name: String, json: IMapField): MapField = js.native
}

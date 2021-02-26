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
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.optional
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.repeated
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.required
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sfixed32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sfixed64
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sint32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.sint64
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.string
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.uint32
import typingsSlinky.apolloProtobufjs.apolloProtobufjsStrings.uint64
import typingsSlinky.long.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "Field")
@js.native
class Field protected () extends FieldBase {
  /**
    * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param type Value type
    * @param [rule="optional"] Field rule
    * @param [extend] Extended type if different from parent
    * @param [options] Declared options
    */
  def this(name: String, id: Double, `type`: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(name: String, id: Double, `type`: String, rule: js.UndefOr[scala.Nothing], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: String
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  
  /** Determines whether this field is packed. Only relevant when repeated and working with proto2. */
  val packed: Boolean = js.native
}
/* static members */
object Field {
  
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | Long | String]) | Long | String | Boolean | js.typedarray.Uint8Array */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: js.UndefOr[optional | required | repeated],
    defaultValue: js.UndefOr[T]
  ): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d_optional[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d_optional[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d_repeated[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d_repeated[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d_required[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs", "Field.d")
  @js.native
  def d_required[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("@apollo/protobufjs", "Field.fromJSON")
  @js.native
  def fromJSON(name: String, json: IField): Field = js.native
}

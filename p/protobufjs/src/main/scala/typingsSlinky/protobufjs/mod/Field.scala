package typingsSlinky.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.protobufjsStrings.bool
import typingsSlinky.protobufjs.protobufjsStrings.bytes
import typingsSlinky.protobufjs.protobufjsStrings.double
import typingsSlinky.protobufjs.protobufjsStrings.fixed32
import typingsSlinky.protobufjs.protobufjsStrings.fixed64
import typingsSlinky.protobufjs.protobufjsStrings.float
import typingsSlinky.protobufjs.protobufjsStrings.int32
import typingsSlinky.protobufjs.protobufjsStrings.int64
import typingsSlinky.protobufjs.protobufjsStrings.optional
import typingsSlinky.protobufjs.protobufjsStrings.repeated
import typingsSlinky.protobufjs.protobufjsStrings.required
import typingsSlinky.protobufjs.protobufjsStrings.sfixed32
import typingsSlinky.protobufjs.protobufjsStrings.sfixed64
import typingsSlinky.protobufjs.protobufjsStrings.sint32
import typingsSlinky.protobufjs.protobufjsStrings.sint64
import typingsSlinky.protobufjs.protobufjsStrings.string
import typingsSlinky.protobufjs.protobufjsStrings.uint32
import typingsSlinky.protobufjs.protobufjsStrings.uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs", "Field")
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
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: js.UndefOr[scala.Nothing], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.Any]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: StringDictionary[js.Any]) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.Any], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: String,
    options: StringDictionary[js.Any]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.Any],
    extend: StringDictionary[js.Any],
    options: StringDictionary[js.Any]
  ) = this()
  
  /** Determines whether this field is packed. Only relevant when repeated and working with proto2. */
  val packed: Boolean = js.native
}
/* static members */
@JSImport("protobufjs", "Field")
@js.native
object Field extends js.Object {
  
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | Long | String]) | Long | String | Boolean | js.typedarray.Uint8Array */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: js.UndefOr[optional | required | repeated],
    defaultValue: js.UndefOr[T]
  ): FieldDecorator = js.native
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  def d[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IField): Field = js.native
}

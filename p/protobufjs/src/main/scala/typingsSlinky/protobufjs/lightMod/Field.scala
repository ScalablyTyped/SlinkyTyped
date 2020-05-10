package typingsSlinky.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.Constructor
import typingsSlinky.protobufjs.mod.FieldDecorator
import typingsSlinky.protobufjs.mod.IField
import typingsSlinky.protobufjs.mod.Long
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
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "Field")
@js.native
class Field protected ()
  extends typingsSlinky.protobufjs.mod.Field {
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
}

/* static members */
@JSImport("protobufjs/light", "Field")
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
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: optional,
    defaultValue: js.Array[Boolean | js.typedarray.Uint8Array | Double | Long | String]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: optional,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: repeated
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: repeated,
    defaultValue: js.Array[Boolean | js.typedarray.Uint8Array | Double | Long | String]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: repeated,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: required
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: String
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: js.Object | bool | bytes | double | fixed32 | fixed64 | float | int32 | int64 | sfixed32 | sfixed64 | sint32 | sint64 | string | uint32 | uint64,
    fieldRule: required,
    defaultValue: js.Array[Boolean | js.typedarray.Uint8Array | Double | Long | String]
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Boolean
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Double
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: Long
  ): FieldDecorator = js.native
  def d(
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: required,
    defaultValue: js.typedarray.Uint8Array
  ): FieldDecorator = js.native
  def d[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  def d[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_optional[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_repeated[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSName("d")
  def d_required[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IField): typingsSlinky.protobufjs.mod.Field = js.native
}


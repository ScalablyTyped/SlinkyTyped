package typingsSlinky.googleGax.fallbackMod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.googleGaxStrings.bool
import typingsSlinky.googleGax.googleGaxStrings.bytes
import typingsSlinky.googleGax.googleGaxStrings.double
import typingsSlinky.googleGax.googleGaxStrings.fixed32
import typingsSlinky.googleGax.googleGaxStrings.fixed64
import typingsSlinky.googleGax.googleGaxStrings.float
import typingsSlinky.googleGax.googleGaxStrings.int32
import typingsSlinky.googleGax.googleGaxStrings.int64
import typingsSlinky.googleGax.googleGaxStrings.optional
import typingsSlinky.googleGax.googleGaxStrings.repeated
import typingsSlinky.googleGax.googleGaxStrings.required
import typingsSlinky.googleGax.googleGaxStrings.sfixed32
import typingsSlinky.googleGax.googleGaxStrings.sfixed64
import typingsSlinky.googleGax.googleGaxStrings.sint32
import typingsSlinky.googleGax.googleGaxStrings.sint64
import typingsSlinky.googleGax.googleGaxStrings.string
import typingsSlinky.googleGax.googleGaxStrings.uint32
import typingsSlinky.googleGax.googleGaxStrings.uint64
import typingsSlinky.protobufjs.mod.Constructor
import typingsSlinky.protobufjs.mod.FieldDecorator
import typingsSlinky.protobufjs.mod.IField
import typingsSlinky.protobufjs.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobuf.Field")
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
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d[T /* <: Double | (js.Array[Boolean | js.typedarray.Uint8Array | Double | Long | String]) | Long | String | Boolean | js.typedarray.Uint8Array */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: js.UndefOr[optional | required | repeated],
    defaultValue: js.UndefOr[T]
  ): FieldDecorator = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d_optional[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d_optional[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d_repeated[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d_repeated[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d_required[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.d")
  @js.native
  def d_required[T /* <: typingsSlinky.protobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("google-gax/build/src/fallback", "protobuf.Field.fromJSON")
  @js.native
  def fromJSON(name: String, json: IField): typingsSlinky.protobufjs.mod.Field = js.native
}

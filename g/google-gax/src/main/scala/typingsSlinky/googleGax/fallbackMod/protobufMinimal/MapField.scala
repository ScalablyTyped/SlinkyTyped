package typingsSlinky.googleGax.fallbackMod.protobufMinimal

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.googleGaxStrings.bool
import typingsSlinky.googleGax.googleGaxStrings.bytes
import typingsSlinky.googleGax.googleGaxStrings.double
import typingsSlinky.googleGax.googleGaxStrings.fixed32
import typingsSlinky.googleGax.googleGaxStrings.fixed64
import typingsSlinky.googleGax.googleGaxStrings.float
import typingsSlinky.googleGax.googleGaxStrings.int32
import typingsSlinky.googleGax.googleGaxStrings.int64
import typingsSlinky.googleGax.googleGaxStrings.sfixed32
import typingsSlinky.googleGax.googleGaxStrings.sfixed64
import typingsSlinky.googleGax.googleGaxStrings.sint32
import typingsSlinky.googleGax.googleGaxStrings.sint64
import typingsSlinky.googleGax.googleGaxStrings.string
import typingsSlinky.googleGax.googleGaxStrings.uint32
import typingsSlinky.googleGax.googleGaxStrings.uint64
import typingsSlinky.protobufjs.mod.Constructor
import typingsSlinky.protobufjs.mod.FieldDecorator
import typingsSlinky.protobufjs.mod.IMapField
import typingsSlinky.protobufjs.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "protobufMinimal.MapField")
@js.native
class MapField protected ()
  extends typingsSlinky.protobufjs.minimalMod.MapField {
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
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
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
object MapField {
  
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  @JSImport("google-gax/build/src/fallback", "protobufMinimal.MapField.d")
  @js.native
  def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | typingsSlinky.protobufjs.mod.Message[js.Object]
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
  @JSImport("google-gax/build/src/fallback", "protobufMinimal.MapField.fromJSON")
  @js.native
  def fromJSON(name: String, json: IMapField): typingsSlinky.protobufjs.mod.MapField = js.native
}

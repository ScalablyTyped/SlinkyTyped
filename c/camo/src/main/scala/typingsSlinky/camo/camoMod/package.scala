package typingsSlinky.camo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object camoMod {
  import typingsSlinky.std.ArrayBufferConstructor
  import typingsSlinky.std.ArrayConstructor
  import typingsSlinky.std.BooleanConstructor
  import typingsSlinky.std.DateConstructor
  import typingsSlinky.std.NumberConstructor
  import typingsSlinky.std.ObjectConstructor
  import typingsSlinky.std.StringConstructor

  type SchemaType = TypeOrArrayOfType[String | Double | Boolean | js.Date | js.Object]
  type SchemaTypeConstructor = TypeOrArrayOfType[
    ArrayBufferConstructor | ArrayConstructor | BooleanConstructor | DateConstructor | NumberConstructor | ObjectConstructor | StringConstructor
  ]
  type SchemaTypeExtended = SchemaTypeConstructor | SchemaTypeOptions[SchemaType]
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}

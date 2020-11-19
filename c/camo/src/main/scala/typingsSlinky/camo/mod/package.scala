package typingsSlinky.camo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SchemaType = typingsSlinky.camo.mod.TypeOrArrayOfType[java.lang.String | scala.Double | scala.Boolean | js.Date | js.Object]
  
  type SchemaTypeConstructor = typingsSlinky.camo.mod.TypeOrArrayOfType[
    typingsSlinky.std.ArrayBufferConstructor | typingsSlinky.std.ArrayConstructor | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.DateConstructor | typingsSlinky.std.NumberConstructor | typingsSlinky.std.ObjectConstructor | typingsSlinky.std.StringConstructor
  ]
  
  type SchemaTypeExtended = typingsSlinky.camo.mod.SchemaTypeConstructor | typingsSlinky.camo.mod.SchemaTypeOptions[typingsSlinky.camo.mod.SchemaType]
  
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}

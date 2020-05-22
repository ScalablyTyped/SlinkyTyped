package typingsSlinky.convict

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = typingsSlinky.convict.convictStrings.Overwrite with org.scalablytyped.runtime.TopLevel[T] with U
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.convict.convictStrings.Asterisk
    - typingsSlinky.convict.convictStrings.int
    - typingsSlinky.convict.convictStrings.port
    - typingsSlinky.convict.convictStrings.windows_named_pipe
    - typingsSlinky.convict.convictStrings.port_or_windows_named_pipe
    - typingsSlinky.convict.convictStrings.url
    - typingsSlinky.convict.convictStrings.email
    - typingsSlinky.convict.convictStrings.ipaddress
    - typingsSlinky.convict.convictStrings.duration
    - typingsSlinky.convict.convictStrings.timestamp
    - typingsSlinky.convict.convictStrings.nat
    - java.lang.String
    - js.Object
    - typingsSlinky.std.Number
    - typingsSlinky.std.RegExp
    - scala.Boolean
  */
  type PredefinedFormat = typingsSlinky.convict.mod._PredefinedFormat | java.lang.String | js.Object | typingsSlinky.std.Number | js.RegExp | scala.Boolean
  type Schema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias convict.convict.Schema<T[P]> * / object | convict.convict.SchemaObj<T[P]>}
    */ typingsSlinky.convict.convictStrings.Schema with org.scalablytyped.runtime.TopLevel[T]
}

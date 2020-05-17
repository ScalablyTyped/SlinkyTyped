package typingsSlinky.convict

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  type Overwrite[T, U] = typingsSlinky.convict.convictStrings.Overwrite with org.scalablytyped.runtime.TopLevel[T] with U
  type Schema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias convict.convict.Schema<T[P]> * / object | convict.convict.SchemaObj<T[P]>}
    */ typingsSlinky.convict.convictStrings.Schema with org.scalablytyped.runtime.TopLevel[T]
}

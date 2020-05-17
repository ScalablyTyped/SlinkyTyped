package typingsSlinky.immer.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{-readonly [ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias immer.immer.Draft<T[P]> * / object}
  * / typingsSlinky.immer.immerStrings.Draft with org.scalablytyped.runtime.TopLevel[js.Any]
  - typingsSlinky.immer.mod.DraftTuple[T]
  - typingsSlinky.immer.mod.DraftArray[T]
*/
trait Draft[T] extends js.Object

object Draft {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias immer.immer.Draft<T[P]> * / object}
    */ typingsSlinky.immer.immerStrings.Draft with TopLevel[js.Any]
  ): Draft[T] = value.asInstanceOf[Draft[T]]
  @scala.inline
  implicit def apply[T](value: DraftArray[T]): Draft[T] = value.asInstanceOf[Draft[T]]
  @scala.inline
  implicit def apply[T](value: DraftTuple[T]): Draft[T] = value.asInstanceOf[Draft[T]]
  @scala.inline
  implicit def apply[T](value: T): Draft[T] = value.asInstanceOf[Draft[T]]
}


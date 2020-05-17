package typingsSlinky.immutabilityHelper.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.immutabilityHelper.anon.Merge
import typingsSlinky.immutabilityHelper.anon.Toggle
import typingsSlinky.immutabilityHelper.anon.Unset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.immutabilityHelper.anon.Toggle[T]
  - typingsSlinky.immutabilityHelper.anon.Unset[T]
  - typingsSlinky.immutabilityHelper.anon.Merge[T]
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
  * / typingsSlinky.immutabilityHelper.immutabilityHelperStrings.ObjectSpec with org.scalablytyped.runtime.TopLevel[T]
*/
trait ObjectSpec[T, C /* <: CustomCommands[js.Object] */] extends Spec[T, C]

object ObjectSpec {
  @scala.inline
  implicit def apply[T, C](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? immutability-helper.immutability-helper.Spec<T[K], C>}
    */ typingsSlinky.immutabilityHelper.immutabilityHelperStrings.ObjectSpec with TopLevel[T]
  ): ObjectSpec[T, C] = value.asInstanceOf[ObjectSpec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: Merge[T]): ObjectSpec[T, C] = value.asInstanceOf[ObjectSpec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: Toggle[T]): ObjectSpec[T, C] = value.asInstanceOf[ObjectSpec[T, C]]
  @scala.inline
  implicit def apply[T, C](value: Unset[T]): ObjectSpec[T, C] = value.asInstanceOf[ObjectSpec[T, C]]
}


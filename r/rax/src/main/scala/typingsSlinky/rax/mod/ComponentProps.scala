package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
  * or ComponentPropsWithoutRef when refs are not supported.
  */
/* Rewritten from type alias, can be one of: 
  - js.Object
  - / * import warning: importer.ImportType#apply Failed type conversion: rax.rax.<global>.JSX.IntrinsicElements[T] * / js.Any
*/
trait ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 209 */ js.Any */] extends js.Object

object ComponentProps {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply Failed type conversion: rax.rax.<global>.JSX.IntrinsicElements[T] */ js.Any
  ): ComponentProps[T] = value.asInstanceOf[ComponentProps[T]]
  @scala.inline
  implicit def apply[T](value: js.Object): ComponentProps[T] = value.asInstanceOf[ComponentProps[T]]
}


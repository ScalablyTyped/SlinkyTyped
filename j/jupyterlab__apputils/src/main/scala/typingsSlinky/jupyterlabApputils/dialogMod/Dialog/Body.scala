package typingsSlinky.jupyterlabApputils.dialogMod.Dialog

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The body input types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IBodyWidget[T]
  - typingsSlinky.react.mod.ReactElement
  - java.lang.String
*/
trait Body[T] extends js.Object

object Body {
  @scala.inline
  implicit def apply[T](value: IBodyWidget[T]): Body[T] = value.asInstanceOf[Body[T]]
  @scala.inline
  implicit def apply[T](value: ReactElement): Body[T] = value.asInstanceOf[Body[T]]
  @scala.inline
  implicit def apply[T](value: String): Body[T] = value.asInstanceOf[Body[T]]
}


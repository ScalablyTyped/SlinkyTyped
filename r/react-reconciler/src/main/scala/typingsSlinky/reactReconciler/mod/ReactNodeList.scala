package typingsSlinky.reactReconciler.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactReconciler.mod.ReactEmpty
  - typingsSlinky.react.mod.ReactNode
*/
trait ReactNodeList extends js.Object

object ReactNodeList {
  @scala.inline
  implicit def apply(value: ReactEmpty): ReactNodeList = value.asInstanceOf[ReactNodeList]
  @scala.inline
  implicit def apply(value: TagMod[Any]): ReactNodeList = value.asInstanceOf[ReactNodeList]
}


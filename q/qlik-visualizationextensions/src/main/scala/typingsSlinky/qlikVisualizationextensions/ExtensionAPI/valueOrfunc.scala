package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.qlikVisualizationextensions.ExtensionAPI.func[T]
*/
trait valueOrfunc[T] extends js.Object

object valueOrfunc {
  @scala.inline
  implicit def apply[T](value: T): valueOrfunc[T] = value.asInstanceOf[valueOrfunc[T]]
  @scala.inline
  implicit def apply[T](value: func[T]): valueOrfunc[T] = value.asInstanceOf[valueOrfunc[T]]
}


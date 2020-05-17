package typingsSlinky.nextServer.sideEffectMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.react.mod.ReactElement]
  - js.UndefOr[scala.Nothing]
*/
trait State extends js.Object

object State {
  @scala.inline
  implicit def apply(value: js.Array[ReactElement]): State = value.asInstanceOf[State]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => State): State = value.asInstanceOf[State]
}


package typingsSlinky.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.maquette.interfacesMod.VNode
  - typingsSlinky.maquette.interfacesMod.VNodeChildren
  - typingsSlinky.maquette.maquetteBooleans.`false`
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait VNodeChild extends js.Object

object VNodeChild {
  @scala.inline
  def `false`: typingsSlinky.maquette.maquetteBooleans.`false` = false.asInstanceOf[typingsSlinky.maquette.maquetteBooleans.`false`]
  @scala.inline
  implicit def apply(value: Null): VNodeChild = value.asInstanceOf[VNodeChild]
  @scala.inline
  implicit def apply(value: String): VNodeChild = value.asInstanceOf[VNodeChild]
  @scala.inline
  implicit def apply(value: VNode): VNodeChild = value.asInstanceOf[VNodeChild]
  @scala.inline
  implicit def apply(value: VNodeChildren): VNodeChild = value.asInstanceOf[VNodeChild]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => VNodeChild): VNodeChild = value.asInstanceOf[VNodeChild]
}


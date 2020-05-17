package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * props * / P, 
/ * meta * / typingsSlinky.reactTable.mod.Meta[D, T, typingsSlinky.reactTable.mod.MetaBase[D]], 
P | js.Array[P]]
  - P
  - js.Array[P]
*/
trait PropGetter[D /* <: js.Object */, Props, T /* <: js.Object */, P] extends js.Object

object PropGetter {
  @scala.inline
  implicit def apply[D, Props, T, P](value: js.Array[P]): PropGetter[D, Props, T, P] = value.asInstanceOf[PropGetter[D, Props, T, P]]
  @scala.inline
  implicit def apply[D, Props, T, P](value: js.Function2[/* props */ P, /* meta */ Meta[D, T, MetaBase[D]], P | js.Array[P]]): PropGetter[D, Props, T, P] = value.asInstanceOf[PropGetter[D, Props, T, P]]
  @scala.inline
  implicit def apply[D, Props, T, P](value: P): PropGetter[D, Props, T, P] = value.asInstanceOf[PropGetter[D, Props, T, P]]
}


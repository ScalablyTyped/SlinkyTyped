package typingsSlinky.deku.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Thunk object passed to `element`
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.deku.mod.Component
  - js.Function1[/ * model * / typingsSlinky.deku.mod.Model, typingsSlinky.deku.mod.VirtualElement]
*/
trait Thunk extends js.Object

object Thunk {
  @scala.inline
  implicit def apply(value: Component): Thunk = value.asInstanceOf[Thunk]
  @scala.inline
  implicit def apply(value: js.Function1[/* model */ Model, VirtualElement]): Thunk = value.asInstanceOf[Thunk]
}


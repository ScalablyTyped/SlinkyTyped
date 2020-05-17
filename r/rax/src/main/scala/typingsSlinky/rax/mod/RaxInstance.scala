package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ======================================================================
  * Rax Component API
  * ======================================================================
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rax.mod.Component[js.Any, js.Object, js.Any]
  - typingsSlinky.rax.mod.Element
*/
trait RaxInstance extends js.Object

object RaxInstance {
  @scala.inline
  implicit def apply(value: Component[js.Any, js.Object, js.Any]): RaxInstance = value.asInstanceOf[RaxInstance]
  @scala.inline
  implicit def apply(value: Element): RaxInstance = value.asInstanceOf[RaxInstance]
}


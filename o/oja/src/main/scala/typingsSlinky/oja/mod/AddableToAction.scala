package typingsSlinky.oja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.oja.mod.Action
  - typingsSlinky.oja.mod.AddableFunction
*/
trait AddableToAction extends js.Object

object AddableToAction {
  @scala.inline
  implicit def apply(value: Action): AddableToAction = value.asInstanceOf[AddableToAction]
  @scala.inline
  implicit def apply(value: AddableFunction): AddableToAction = value.asInstanceOf[AddableToAction]
}


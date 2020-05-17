package typingsSlinky.pell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pell.mod.pellBuiltinAction
  - typingsSlinky.pell.mod.pellActionConfig
  - typingsSlinky.pell.mod.pellCustomActionConfig
*/
trait pellAction extends js.Object

object pellAction {
  @scala.inline
  implicit def apply(value: pellActionConfig): pellAction = value.asInstanceOf[pellAction]
  @scala.inline
  implicit def apply(value: pellBuiltinAction): pellAction = value.asInstanceOf[pellAction]
  @scala.inline
  implicit def apply(value: pellCustomActionConfig): pellAction = value.asInstanceOf[pellAction]
}


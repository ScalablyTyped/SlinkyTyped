package typingsSlinky.preact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.preact.mod.ComponentClass[P, js.Object]
  - typingsSlinky.preact.mod.FunctionComponent[P]
*/
trait ComponentType[P] extends js.Object

object ComponentType {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, js.Object]): ComponentType[P] = value.asInstanceOf[ComponentType[P]]
  @scala.inline
  implicit def apply[P](value: FunctionComponent[P]): ComponentType[P] = value.asInstanceOf[ComponentType[P]]
}


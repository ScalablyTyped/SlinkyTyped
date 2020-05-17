package typingsSlinky.enzyme.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.enzyme.mod.ComponentClass[Props]
  - typingsSlinky.enzyme.mod.StatelessComponent[Props]
*/
trait ComponentType[Props] extends js.Object

object ComponentType {
  @scala.inline
  implicit def apply[Props](value: ComponentClass[Props]): ComponentType[Props] = value.asInstanceOf[ComponentType[Props]]
  @scala.inline
  implicit def apply[Props](value: StatelessComponent[Props]): ComponentType[Props] = value.asInstanceOf[ComponentType[Props]]
}


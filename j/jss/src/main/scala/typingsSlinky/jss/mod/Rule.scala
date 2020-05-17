package typingsSlinky.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jss.mod.BaseRule
  - typingsSlinky.jss.mod.ContainerRule
*/
trait Rule extends js.Object

object Rule {
  @scala.inline
  implicit def apply(value: BaseRule): Rule = value.asInstanceOf[Rule]
  @scala.inline
  implicit def apply(value: ContainerRule): Rule = value.asInstanceOf[Rule]
}


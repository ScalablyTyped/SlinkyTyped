package typingsSlinky.linkifyIt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.linkifyIt.mod.FullRule
*/
trait Rule extends js.Object

object Rule {
  @scala.inline
  implicit def apply(value: FullRule): Rule = value.asInstanceOf[Rule]
  @scala.inline
  implicit def apply(value: String): Rule = value.asInstanceOf[Rule]
}


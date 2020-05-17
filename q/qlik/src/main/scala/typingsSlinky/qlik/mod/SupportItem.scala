package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.qlik.mod.SupportFunction
*/
trait SupportItem extends js.Object

object SupportItem {
  @scala.inline
  implicit def apply(value: Boolean): SupportItem = value.asInstanceOf[SupportItem]
  @scala.inline
  implicit def apply(value: SupportFunction): SupportItem = value.asInstanceOf[SupportItem]
}


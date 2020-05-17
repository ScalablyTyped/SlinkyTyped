package typingsSlinky.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.petitDom.mod.PetitDom.VNode
*/
trait Content extends js.Object

object Content {
  @scala.inline
  implicit def apply(value: String): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: VNode): Content = value.asInstanceOf[Content]
}


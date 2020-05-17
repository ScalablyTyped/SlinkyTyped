package typingsSlinky.hapiPodium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.hapiPodium.mod.CriteriaObject
*/
trait Criteria extends js.Object

object Criteria {
  @scala.inline
  implicit def apply(value: CriteriaObject): Criteria = value.asInstanceOf[Criteria]
  @scala.inline
  implicit def apply(value: String): Criteria = value.asInstanceOf[Criteria]
}


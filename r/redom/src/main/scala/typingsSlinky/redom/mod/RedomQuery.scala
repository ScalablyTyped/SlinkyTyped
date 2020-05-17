package typingsSlinky.redom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.redom.mod.RedomElement
*/
trait RedomQuery extends js.Object

object RedomQuery {
  @scala.inline
  implicit def apply(value: RedomElement): RedomQuery = value.asInstanceOf[RedomQuery]
  @scala.inline
  implicit def apply(value: String): RedomQuery = value.asInstanceOf[RedomQuery]
}


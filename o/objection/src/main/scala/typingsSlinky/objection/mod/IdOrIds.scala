package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.objection.mod.Id
  - typingsSlinky.objection.mod.Ids
*/
trait IdOrIds extends js.Object

object IdOrIds {
  @scala.inline
  implicit def apply(value: Id): IdOrIds = value.asInstanceOf[IdOrIds]
  @scala.inline
  implicit def apply(value: Ids): IdOrIds = value.asInstanceOf[IdOrIds]
}


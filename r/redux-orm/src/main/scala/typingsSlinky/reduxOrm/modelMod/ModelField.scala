package typingsSlinky.reduxOrm.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxOrm.querySetMod.default[js.Any, js.Object]
  - typingsSlinky.reduxOrm.modelMod.SessionBoundModel[js.Any, js.Object]
  - typingsSlinky.reduxOrm.modelMod.Serializable
*/
trait ModelField extends js.Object

object ModelField {
  @scala.inline
  implicit def apply(value: Serializable): ModelField = value.asInstanceOf[ModelField]
  @scala.inline
  implicit def apply(value: SessionBoundModel[js.Any, js.Object]): ModelField = value.asInstanceOf[ModelField]
  @scala.inline
  implicit def apply(value: typingsSlinky.reduxOrm.querySetMod.default[js.Any, js.Object]): ModelField = value.asInstanceOf[ModelField]
}


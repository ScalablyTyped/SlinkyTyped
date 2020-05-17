package typingsSlinky.reduxSagaTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Symbol
*/
trait ActionType
  extends ActionSubPattern[js.Any]
     with SubPattern[js.Any]

object ActionType {
  @scala.inline
  implicit def apply(value: Double): ActionType = value.asInstanceOf[ActionType]
  @scala.inline
  implicit def apply(value: String): ActionType = value.asInstanceOf[ActionType]
  @scala.inline
  implicit def apply(value: js.Symbol): ActionType = value.asInstanceOf[ActionType]
}


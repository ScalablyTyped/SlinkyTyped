package typingsSlinky.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rxjs.typesMod.Unsubscribable
  - js.Function
  - scala.Unit
*/
trait TeardownLogic extends js.Object

object TeardownLogic {
  @scala.inline
  implicit def apply(value: js.Function): TeardownLogic = value.asInstanceOf[TeardownLogic]
  @scala.inline
  implicit def apply(value: Unit): TeardownLogic = value.asInstanceOf[TeardownLogic]
  @scala.inline
  implicit def apply(value: Unsubscribable): TeardownLogic = value.asInstanceOf[TeardownLogic]
}


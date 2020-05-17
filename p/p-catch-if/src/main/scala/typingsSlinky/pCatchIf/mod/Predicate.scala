package typingsSlinky.pCatchIf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pCatchIf.mod.ErrorConstructor
  - js.Array[typingsSlinky.pCatchIf.mod.ErrorConstructor]
  - scala.Boolean
  - js.Function1[/ * error * / typingsSlinky.std.Error, scala.Boolean | js.Thenable[scala.Boolean]]
*/
trait Predicate extends js.Object

object Predicate {
  @scala.inline
  implicit def apply(value: js.Array[ErrorConstructor]): Predicate = value.asInstanceOf[Predicate]
  @scala.inline
  implicit def apply(value: Boolean): Predicate = value.asInstanceOf[Predicate]
  @scala.inline
  implicit def apply(value: ErrorConstructor): Predicate = value.asInstanceOf[Predicate]
  @scala.inline
  implicit def apply(value: js.Function1[/* error */ js.Error, Boolean | js.Thenable[Boolean]]): Predicate = value.asInstanceOf[Predicate]
}


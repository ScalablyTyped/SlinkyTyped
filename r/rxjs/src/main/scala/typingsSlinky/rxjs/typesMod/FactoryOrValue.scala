package typingsSlinky.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Function0[T]
*/
trait FactoryOrValue[T] extends js.Object

object FactoryOrValue {
  @scala.inline
  implicit def apply[T](value: js.Function0[T]): FactoryOrValue[T] = value.asInstanceOf[FactoryOrValue[T]]
  @scala.inline
  implicit def apply[T](value: T): FactoryOrValue[T] = value.asInstanceOf[FactoryOrValue[T]]
}


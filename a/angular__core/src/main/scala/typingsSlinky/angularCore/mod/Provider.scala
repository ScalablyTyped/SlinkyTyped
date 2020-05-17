package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.mod.TypeProvider
  - typingsSlinky.angularCore.mod.ValueProvider
  - typingsSlinky.angularCore.mod.ClassProvider
  - typingsSlinky.angularCore.mod.ConstructorProvider
  - typingsSlinky.angularCore.mod.ExistingProvider
  - typingsSlinky.angularCore.mod.FactoryProvider
  - js.Array[js.Any]
*/
trait Provider extends js.Object

object Provider {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): Provider = value.asInstanceOf[Provider]
  @scala.inline
  implicit def apply(value: ClassProvider): Provider = value.asInstanceOf[Provider]
  @scala.inline
  implicit def apply(value: ConstructorProvider): Provider = value.asInstanceOf[Provider]
  @scala.inline
  implicit def apply(value: ExistingProvider): Provider = value.asInstanceOf[Provider]
  @scala.inline
  implicit def apply(value: FactoryProvider): Provider = value.asInstanceOf[Provider]
  @scala.inline
  implicit def apply(value: TypeProvider): Provider = value.asInstanceOf[Provider]
  @scala.inline
  implicit def apply(value: ValueProvider): Provider = value.asInstanceOf[Provider]
}


package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.mod.ValueProvider
  - typingsSlinky.angularCore.mod.ExistingProvider
  - typingsSlinky.angularCore.mod.StaticClassProvider
  - typingsSlinky.angularCore.mod.ConstructorProvider
  - typingsSlinky.angularCore.mod.FactoryProvider
  - js.Array[js.Any]
*/
trait StaticProvider extends js.Object

object StaticProvider {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): StaticProvider = value.asInstanceOf[StaticProvider]
  @scala.inline
  implicit def apply(value: ConstructorProvider): StaticProvider = value.asInstanceOf[StaticProvider]
  @scala.inline
  implicit def apply(value: ExistingProvider): StaticProvider = value.asInstanceOf[StaticProvider]
  @scala.inline
  implicit def apply(value: FactoryProvider): StaticProvider = value.asInstanceOf[StaticProvider]
  @scala.inline
  implicit def apply(value: StaticClassProvider): StaticProvider = value.asInstanceOf[StaticProvider]
  @scala.inline
  implicit def apply(value: ValueProvider): StaticProvider = value.asInstanceOf[StaticProvider]
}


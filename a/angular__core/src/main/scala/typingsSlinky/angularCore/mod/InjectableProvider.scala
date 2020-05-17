package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.mod.ValueSansProvider
  - typingsSlinky.angularCore.mod.ExistingSansProvider
  - typingsSlinky.angularCore.mod.StaticClassSansProvider
  - typingsSlinky.angularCore.mod.ConstructorSansProvider
  - typingsSlinky.angularCore.mod.FactorySansProvider
  - typingsSlinky.angularCore.mod.ClassSansProvider
*/
trait InjectableProvider extends js.Object

object InjectableProvider {
  @scala.inline
  implicit def apply(value: ClassSansProvider): InjectableProvider = value.asInstanceOf[InjectableProvider]
  @scala.inline
  implicit def apply(value: ConstructorSansProvider): InjectableProvider = value.asInstanceOf[InjectableProvider]
  @scala.inline
  implicit def apply(value: ExistingSansProvider): InjectableProvider = value.asInstanceOf[InjectableProvider]
  @scala.inline
  implicit def apply(value: FactorySansProvider): InjectableProvider = value.asInstanceOf[InjectableProvider]
  @scala.inline
  implicit def apply(value: StaticClassSansProvider): InjectableProvider = value.asInstanceOf[InjectableProvider]
  @scala.inline
  implicit def apply(value: ValueSansProvider): InjectableProvider = value.asInstanceOf[InjectableProvider]
}


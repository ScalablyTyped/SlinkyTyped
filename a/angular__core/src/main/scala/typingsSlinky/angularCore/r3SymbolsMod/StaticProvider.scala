package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes how the `Injector` should be configured as static (that is, without reflection).
  * @see ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @publicApi
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.r3SymbolsMod.ValueProvider
  - typingsSlinky.angularCore.r3SymbolsMod.ExistingProvider
  - typingsSlinky.angularCore.r3SymbolsMod.StaticClassProvider
  - typingsSlinky.angularCore.r3SymbolsMod.ConstructorProvider
  - typingsSlinky.angularCore.r3SymbolsMod.FactoryProvider
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


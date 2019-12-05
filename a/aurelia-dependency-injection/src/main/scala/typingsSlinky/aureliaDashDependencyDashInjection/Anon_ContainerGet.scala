package typingsSlinky.aureliaDashDependencyDashInjection

import typingsSlinky.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Args
import typingsSlinky.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import typingsSlinky.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Impl
import typingsSlinky.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.PrimitiveOrDependencyCtor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerGet[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl
}

object Anon_ContainerGet {
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): Anon_ContainerGet[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[Anon_ContainerGet[TBase, TImpl, TArgs]]
  }
}


package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]
  - typingsSlinky.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs]
*/
trait DependencyCtorOrFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object

object DependencyCtorOrFunctor {
  @scala.inline
  implicit def apply[TBase, TImpl, TArgs](value: DependencyCtor[TBase, TImpl, TArgs]): DependencyCtorOrFunctor[TBase, TImpl, TArgs] = value.asInstanceOf[DependencyCtorOrFunctor[TBase, TImpl, TArgs]]
  @scala.inline
  implicit def apply[TBase, TImpl, TArgs](value: DependencyFunctor[TBase, TImpl, TArgs]): DependencyCtorOrFunctor[TBase, TImpl, TArgs] = value.asInstanceOf[DependencyCtorOrFunctor[TBase, TImpl, TArgs]]
}


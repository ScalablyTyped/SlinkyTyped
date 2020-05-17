package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]
  - typingsSlinky.aureliaDependencyInjection.mod.DependencyFunctor[TBase, TImpl, TArgs]
  - typingsSlinky.aureliaDependencyInjection.mod.Primitive
*/
trait PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object

object PrimitiveOrDependencyCtorOrFunctor {
  @scala.inline
  implicit def apply[TBase, TImpl, TArgs](value: DependencyCtor[TBase, TImpl, TArgs]): PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs] = value.asInstanceOf[PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]]
  @scala.inline
  implicit def apply[TBase, TImpl, TArgs](value: DependencyFunctor[TBase, TImpl, TArgs]): PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs] = value.asInstanceOf[PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]]
  @scala.inline
  implicit def apply[TBase, TImpl, TArgs](value: Primitive): PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs] = value.asInstanceOf[PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]]
}


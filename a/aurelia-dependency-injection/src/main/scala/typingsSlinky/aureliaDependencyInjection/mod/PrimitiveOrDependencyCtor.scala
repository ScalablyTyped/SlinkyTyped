package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.aureliaDependencyInjection.mod.DependencyCtor[TBase, TImpl, TArgs]
  - typingsSlinky.aureliaDependencyInjection.mod.Primitive
*/
trait PrimitiveOrDependencyCtor[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object

object PrimitiveOrDependencyCtor {
  @scala.inline
  implicit def apply[TBase, TImpl, TArgs](value: DependencyCtor[TBase, TImpl, TArgs]): PrimitiveOrDependencyCtor[TBase, TImpl, TArgs] = value.asInstanceOf[PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]]
  @scala.inline
  implicit def apply[TBase, TImpl, TArgs](value: Primitive): PrimitiveOrDependencyCtor[TBase, TImpl, TArgs] = value.asInstanceOf[PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]]
}


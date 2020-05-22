package typingsSlinky.aureliaDependencyInjection.anon

import typingsSlinky.aureliaDependencyInjection.mod.Args
import typingsSlinky.aureliaDependencyInjection.mod.Container
import typingsSlinky.aureliaDependencyInjection.mod.Impl
import typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl
}

object `0` {
  @scala.inline
  def apply[TBase, TImpl, TArgs](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): `0`[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[`0`[TBase, TImpl, TArgs]]
  }
}


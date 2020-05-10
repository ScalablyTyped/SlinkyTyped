package typingsSlinky.aureliaDependencyInjection

import typingsSlinky.aureliaDependencyInjection.mod.Args
import typingsSlinky.aureliaDependencyInjection.mod.Container
import typingsSlinky.aureliaDependencyInjection.mod.Impl
import typingsSlinky.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl = js.native
}

object Anon0 {
  @scala.inline
  def apply[TBase, TImpl, TArgs](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): Anon0[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Anon0[TBase, TImpl, TArgs]]
  }
  @scala.inline
  implicit class Anon0Ops[Self[tbase, timpl, targs] <: Anon0[tbase, timpl, targs], TBase, TImpl, TArgs] (val x: Self[TBase, TImpl, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TBase, TImpl, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TBase, TImpl, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TBase, TImpl, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TBase, TImpl, TArgs]) with Other]
    @scala.inline
    def withGet(value: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): Self[TBase, TImpl, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


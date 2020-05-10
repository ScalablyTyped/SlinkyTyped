package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registration_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver_ = js.native
}

object Registration_ {
  @scala.inline
  def apply[TBase, TImpl, TArgs](
    registerResolver: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => Resolver_
  ): Registration_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(registerResolver = js.Any.fromFunction3(registerResolver))
    __obj.asInstanceOf[Registration_[TBase, TImpl, TArgs]]
  }
  @scala.inline
  implicit class Registration_Ops[Self[tbase, timpl, targs] <: Registration_[tbase, timpl, targs], TBase, TImpl, TArgs] (val x: Self[TBase, TImpl, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TBase, TImpl, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TBase, TImpl, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TBase, TImpl, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TBase, TImpl, TArgs]) with Other]
    @scala.inline
    def withRegisterResolver(
      value: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], DependencyCtorOrFunctor[TBase, TImpl, TArgs]) => Resolver_
    ): Self[TBase, TImpl, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerResolver")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}


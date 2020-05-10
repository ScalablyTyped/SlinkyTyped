package typingsSlinky.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoker_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends js.Object {
  def invoke(container: Container, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs], dependencies: TArgs): ImplOrAny[TImpl] = js.native
  def invokeWithDynamicDependencies(
    container: Container,
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    staticDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ],
    dynamicDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl] = js.native
}

object Invoker_ {
  @scala.inline
  def apply[TBase, TImpl, TArgs](
    invoke: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl],
    invokeWithDynamicDependencies: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]) => ImplOrAny[TImpl]
  ): Invoker_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction3(invoke), invokeWithDynamicDependencies = js.Any.fromFunction4(invokeWithDynamicDependencies))
    __obj.asInstanceOf[Invoker_[TBase, TImpl, TArgs]]
  }
  @scala.inline
  implicit class Invoker_Ops[Self[tbase, timpl, targs] <: Invoker_[tbase, timpl, targs], TBase, TImpl, TArgs] (val x: Self[TBase, TImpl, TArgs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TBase, TImpl, TArgs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TBase, TImpl, TArgs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TBase, TImpl, TArgs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TBase, TImpl, TArgs]) with Other]
    @scala.inline
    def withInvoke(value: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl]): Self[TBase, TImpl, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInvokeWithDynamicDependencies(
      value: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ], js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ]) => ImplOrAny[TImpl]
    ): Self[TBase, TImpl, TArgs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeWithDynamicDependencies")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}


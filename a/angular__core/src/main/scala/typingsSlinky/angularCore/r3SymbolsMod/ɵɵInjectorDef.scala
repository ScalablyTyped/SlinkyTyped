package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵɵInjectorDef[T] extends js.Object {
  var imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]] = js.native
  var providers: js.Array[
    Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
  ] = js.native
  def factory(): T = js.native
}

object ɵɵInjectorDef {
  @scala.inline
  def apply[T](
    factory: () => T,
    imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]],
    providers: js.Array[
      Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
    ]
  ): ɵɵInjectorDef[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), imports = imports.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵɵInjectorDef[T]]
  }
  @scala.inline
  implicit class ɵɵInjectorDefOps[Self[t] <: ɵɵInjectorDef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFactory(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImports(value: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviders(
      value: js.Array[
          Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


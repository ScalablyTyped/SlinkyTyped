package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the `InjectorDef` equivalent of a `ModuleWithProviders`, an `InjectorDefType` with an
  * associated array of providers.
  *
  * Objects of this type can be listed in the imports section of an `InjectorDef`.
  *
  * NOTE: This is a private type and should not be exported
  */
@js.native
trait InjectorTypeWithProviders[T] extends js.Object {
  var ngModule: InjectorType[T] = js.native
  var providers: js.UndefOr[
    js.Array[
      Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
    ]
  ] = js.native
}

object InjectorTypeWithProviders {
  @scala.inline
  def apply[T](ngModule: InjectorType[T]): InjectorTypeWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectorTypeWithProviders[T]]
  }
  @scala.inline
  implicit class InjectorTypeWithProvidersOps[Self[t] <: InjectorTypeWithProviders[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNgModule(value: InjectorType[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModule")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withoutProviders: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
  }
  
}


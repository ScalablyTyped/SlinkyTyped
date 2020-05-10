package typingsSlinky.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a token that can be used in a DI Provider.
  *
  * Use an `InjectionToken` whenever the type you are injecting is not reified (does not have a
  * runtime representation) such as when injecting an interface, callable type, array or
  * parameterized type.
  *
  * `InjectionToken` is parameterized on `T` which is the type of object which will be returned by
  * the `Injector`. This provides additional level of type safety.
  *
  * ```
  * interface MyInterface {...}
  * var myInterface = injector.get(new InjectionToken<MyInterface>('SomeToken'));
  * // myInterface is inferred to be MyInterface.
  * ```
  *
  * When creating an `InjectionToken`, you can optionally specify a factory function which returns
  * (possibly by creating) a default value of the parameterized type `T`. This sets up the
  * `InjectionToken` using this factory as a provider as if it was defined explicitly in the
  * application's root injector. If the factory function, which takes zero arguments, needs to inject
  * dependencies, it can do so using the `inject` function. See below for an example.
  *
  * Additionally, if a `factory` is specified you can also specify the `providedIn` option, which
  * overrides the above behavior and marks the token as belonging to a particular `@NgModule`. As
  * mentioned above, `'root'` is the default value for `providedIn`.
  *
  * @usageNotes
  * ### Basic Example
  *
  * ### Plain InjectionToken
  *
  * {@example core/di/ts/injector_spec.ts region='InjectionToken'}
  *
  * ### Tree-shakable InjectionToken
  *
  * {@example core/di/ts/injector_spec.ts region='ShakableInjectionToken'}
  *
  *
  * @publicApi
  */
@js.native
trait InjectionToken[T] extends js.Object {
  var _desc: String = js.native
  val ngInjectableDef: js.UndefOr[scala.Nothing] = js.native
}

object InjectionToken {
  @scala.inline
  def apply[T](_desc: String): InjectionToken[T] = {
    val __obj = js.Dynamic.literal(_desc = _desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectionToken[T]]
  }
  @scala.inline
  implicit class InjectionTokenOps[Self[t] <: InjectionToken[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_desc(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgInjectableDef(value: scala.Nothing): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngInjectableDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgInjectableDef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngInjectableDef")(js.undefined)
        ret
    }
  }
  
}


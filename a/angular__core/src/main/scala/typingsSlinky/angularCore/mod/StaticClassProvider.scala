package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticClassProvider
  extends StaticClassSansProvider
     with StaticProvider {
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.native
  /**
    * An injection token. Typically an instance of `Type` or `InjectionToken`, but can be `any`.
    */
  var provide: js.Any = js.native
}

object StaticClassProvider {
  @scala.inline
  def apply(deps: js.Array[_], provide: js.Any, useClass: Type[_]): StaticClassProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticClassProvider]
  }
  @scala.inline
  implicit class StaticClassProviderOps[Self <: StaticClassProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvide(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
  }
  
}


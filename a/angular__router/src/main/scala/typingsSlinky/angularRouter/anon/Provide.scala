package typingsSlinky.angularRouter.anon

import typingsSlinky.angularCore.mod.ComponentRef
import typingsSlinky.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Provide extends js.Object {
  var deps: js.UndefOr[scala.Nothing] = js.native
  var multi: Boolean = js.native
  var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]] = js.native
  var useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]] = js.native
  var useFactory: js.UndefOr[scala.Nothing] = js.native
}

object Provide {
  @scala.inline
  def apply(
    multi: Boolean,
    provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]],
    useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]
  ): Provide = {
    val __obj = js.Dynamic.literal(multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provide]
  }
  @scala.inline
  implicit class ProvideOps[Self <: Provide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvide(value: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseExisting(value: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExisting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


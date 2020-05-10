package typingsSlinky.angularRouter

import typingsSlinky.angularCore.mod.ComponentRef
import typingsSlinky.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProvide extends js.Object {
  var deps: js.UndefOr[scala.Nothing] = js.native
  var multi: Boolean = js.native
  var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]] = js.native
  var useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]] = js.native
  var useFactory: js.UndefOr[scala.Nothing] = js.native
}

object AnonProvide {
  @scala.inline
  def apply(
    multi: Boolean,
    provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]],
    useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]
  ): AnonProvide = {
    val __obj = js.Dynamic.literal(multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProvide]
  }
  @scala.inline
  implicit class AnonProvideOps[Self <: AnonProvide] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withDeps(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFactory(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFactory")(js.undefined)
        ret
    }
  }
  
}


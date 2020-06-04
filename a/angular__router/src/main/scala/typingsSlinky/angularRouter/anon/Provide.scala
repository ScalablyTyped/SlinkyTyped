package typingsSlinky.angularRouter.anon

import typingsSlinky.angularCore.mod.ComponentRef
import typingsSlinky.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provide extends js.Object {
  var deps: js.UndefOr[scala.Nothing] = js.undefined
  var multi: Boolean
  var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]]
  var useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]
  var useFactory: js.UndefOr[scala.Nothing] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvide(value: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]]): Self = this.set("provide", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseExisting(value: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]): Self = this.set("useExisting", value.asInstanceOf[js.Any])
  }
  
}


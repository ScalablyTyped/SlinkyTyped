package typingsSlinky.angularDynamicLocale.mod.tmh

import typingsSlinky.angular.mod.ILocaleService
import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDynamicLocale extends js.Object {
  def get(): String = js.native
  def set(locale: String): IPromise[ILocaleService] = js.native
}

object IDynamicLocale {
  @scala.inline
  def apply(get: () => String, set: String => IPromise[ILocaleService]): IDynamicLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IDynamicLocale]
  }
  @scala.inline
  implicit class IDynamicLocaleOps[Self <: IDynamicLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: String => IPromise[ILocaleService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


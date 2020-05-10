package typingsSlinky.angularStrap.mgcrea.ngStrap.scrollspy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollspyProvider extends js.Object {
  var defaults: IScrollspyOptions = js.native
}

object IScrollspyProvider {
  @scala.inline
  def apply(defaults: IScrollspyOptions): IScrollspyProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollspyProvider]
  }
  @scala.inline
  implicit class IScrollspyProviderOps[Self <: IScrollspyProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: IScrollspyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.angularStrap.mgcrea.ngStrap.typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypeaheadProvider extends js.Object {
  var defaults: ITypeaheadOptions = js.native
}

object ITypeaheadProvider {
  @scala.inline
  def apply(defaults: ITypeaheadOptions): ITypeaheadProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeaheadProvider]
  }
  @scala.inline
  implicit class ITypeaheadProviderOps[Self <: ITypeaheadProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: ITypeaheadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


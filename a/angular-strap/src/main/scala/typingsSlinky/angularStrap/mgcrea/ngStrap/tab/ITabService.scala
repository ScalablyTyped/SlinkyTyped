package typingsSlinky.angularStrap.mgcrea.ngStrap.tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabService extends js.Object {
  var controller: js.Any = js.native
  var defaults: ITabOptions = js.native
}

object ITabService {
  @scala.inline
  def apply(controller: js.Any, defaults: ITabOptions): ITabService = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabService]
  }
  @scala.inline
  implicit class ITabServiceOps[Self <: ITabService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withController(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: ITabOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


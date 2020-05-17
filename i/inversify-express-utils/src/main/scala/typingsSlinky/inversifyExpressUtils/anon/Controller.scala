package typingsSlinky.inversifyExpressUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controller extends js.Object {
  var controller: js.Any = js.native
  var endpoints: js.Array[Args] = js.native
}

object Controller {
  @scala.inline
  def apply(controller: js.Any, endpoints: js.Array[Args]): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  @scala.inline
  implicit class ControllerOps[Self <: Controller] (val x: Self) extends AnyVal {
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
    def withEndpoints(value: js.Array[Args]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


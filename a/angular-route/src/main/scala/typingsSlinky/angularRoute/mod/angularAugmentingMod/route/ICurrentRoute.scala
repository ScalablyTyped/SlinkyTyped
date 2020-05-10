package typingsSlinky.angularRoute.mod.angularAugmentingMod.route

import typingsSlinky.angularRoute.AnonDictindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see http://docs.angularjs.org/api/ng.$route#current
@js.native
trait ICurrentRoute extends IRoute {
  var locals: AnonDictindex = js.native
  var params: js.Any = js.native
}

object ICurrentRoute {
  @scala.inline
  def apply(locals: AnonDictindex, params: js.Any): ICurrentRoute = {
    val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRoute]
  }
  @scala.inline
  implicit class ICurrentRouteOps[Self <: ICurrentRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocals(value: AnonDictindex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


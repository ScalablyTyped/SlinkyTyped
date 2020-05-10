package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParentRouter extends js.Object {
  var direction: String = js.native
  var parentRouter: Router = js.native
}

object AnonParentRouter {
  @scala.inline
  def apply(direction: String, parentRouter: Router): AnonParentRouter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentRouter]
  }
  @scala.inline
  implicit class AnonParentRouterOps[Self <: AnonParentRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentRouter(value: Router): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRouter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


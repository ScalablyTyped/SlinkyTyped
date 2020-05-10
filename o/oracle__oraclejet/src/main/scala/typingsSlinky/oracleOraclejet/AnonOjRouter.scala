package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOjRouter extends js.Object {
  var ojRouter: AnonParameters = js.native
}

object AnonOjRouter {
  @scala.inline
  def apply(ojRouter: AnonParameters): AnonOjRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOjRouter]
  }
  @scala.inline
  implicit class AnonOjRouterOps[Self <: AnonOjRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOjRouter(value: AnonParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojRouter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


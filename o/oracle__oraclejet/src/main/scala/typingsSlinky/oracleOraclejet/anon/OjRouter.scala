package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OjRouter extends js.Object {
  var ojRouter: Parameters = js.native
}

object OjRouter {
  @scala.inline
  def apply(ojRouter: Parameters): OjRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OjRouter]
  }
  @scala.inline
  implicit class OjRouterOps[Self <: OjRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOjRouter(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ojRouter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


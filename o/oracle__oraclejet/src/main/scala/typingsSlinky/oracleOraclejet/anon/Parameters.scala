package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  var direction: String = js.native
  var parameters: js.Object = js.native
  var parentRouter: Router = js.native
}

object Parameters {
  @scala.inline
  def apply(direction: String, parameters: js.Object, parentRouter: Router): Parameters = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
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
    def withParameters(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
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


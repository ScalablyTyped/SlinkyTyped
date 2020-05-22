package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.hapiHapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  val data: js.UndefOr[AuthenticationData] = js.undefined
  val error: js.UndefOr[js.Error | Null] = js.undefined
  val isAuth: `true`
}

object Auth {
  @scala.inline
  def apply(isAuth: `true`, data: AuthenticationData = null, error: js.UndefOr[Null | js.Error] = js.undefined): Auth = {
    val __obj = js.Dynamic.literal(isAuth = isAuth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
}


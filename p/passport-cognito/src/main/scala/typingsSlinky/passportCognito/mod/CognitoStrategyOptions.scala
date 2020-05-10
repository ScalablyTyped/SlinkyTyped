package typingsSlinky.passportCognito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoStrategyOptions extends js.Object {
  var clientId: String = js.native
  var region: String = js.native
  var userPoolId: String = js.native
}

object CognitoStrategyOptions {
  @scala.inline
  def apply(clientId: String, region: String, userPoolId: String): CognitoStrategyOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoStrategyOptions]
  }
  @scala.inline
  implicit class CognitoStrategyOptionsOps[Self <: CognitoStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPoolId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


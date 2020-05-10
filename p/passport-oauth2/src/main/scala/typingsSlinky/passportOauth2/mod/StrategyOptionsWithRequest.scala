package typingsSlinky.passportOauth2.mod

import typingsSlinky.passportOauth2.passportOauth2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsWithRequest extends StrategyOptionsBase {
  var passReqToCallback: `true` = js.native
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    authorizationURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true`,
    tokenURL: String
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
  @scala.inline
  implicit class StrategyOptionsWithRequestOps[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassReqToCallback(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


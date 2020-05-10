package typingsSlinky.passportInstagram.mod

import typingsSlinky.passportInstagram.passportInstagramBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionWithRequest extends StrategyOptionBase {
  var passReqToCallback: `true` = js.native
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String, passReqToCallback: `true`): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
  @scala.inline
  implicit class StrategyOptionWithRequestOps[Self <: StrategyOptionWithRequest] (val x: Self) extends AnyVal {
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


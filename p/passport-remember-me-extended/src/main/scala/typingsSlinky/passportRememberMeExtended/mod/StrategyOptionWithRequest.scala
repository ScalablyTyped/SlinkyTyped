package typingsSlinky.passportRememberMeExtended.mod

import typingsSlinky.passportRememberMeExtended.passportRememberMeExtendedBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: `true` = js.native
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(passReqToCallback: `true`): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
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


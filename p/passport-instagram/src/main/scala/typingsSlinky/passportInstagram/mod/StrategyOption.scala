package typingsSlinky.passportInstagram.mod

import typingsSlinky.passportInstagram.passportInstagramBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOption extends StrategyOptionBase {
  var passReqToCallback: js.UndefOr[`false`] = js.native
}

object StrategyOption {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
  @scala.inline
  implicit class StrategyOptionOps[Self <: StrategyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassReqToCallback(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassReqToCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(js.undefined)
        ret
    }
  }
  
}


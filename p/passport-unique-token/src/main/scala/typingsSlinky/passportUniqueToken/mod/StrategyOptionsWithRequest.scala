package typingsSlinky.passportUniqueToken.mod

import typingsSlinky.passportUniqueToken.passportUniqueTokenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsWithRequest extends js.Object {
  var failedOnMissing: js.UndefOr[Boolean] = js.native
  var passReqToCallback: `true` = js.native
  var tokenField: js.UndefOr[String] = js.native
  var tokenHeader: js.UndefOr[String] = js.native
  var tokenParams: js.UndefOr[String] = js.native
  var tokenQuery: js.UndefOr[String] = js.native
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(passReqToCallback: `true`): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
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
    @scala.inline
    def withFailedOnMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedOnMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedOnMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedOnMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenField")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenParams")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenQuery")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.passportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicStrategyOptions[req /* <: Boolean */] extends js.Object {
  var passReqToCallback: js.UndefOr[req] = js.native
  var realm: js.UndefOr[String] = js.native
}

object BasicStrategyOptions {
  @scala.inline
  def apply[req](): BasicStrategyOptions[req] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicStrategyOptions[req]]
  }
  @scala.inline
  implicit class BasicStrategyOptionsOps[Self[req_] <: BasicStrategyOptions[req_], req] (val x: Self[req]) extends AnyVal {
    @scala.inline
    def duplicate: Self[req] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[req]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[req] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[req] with Other]
    @scala.inline
    def withPassReqToCallback(value: req): Self[req] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassReqToCallback: Self[req] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRealm(value: String): Self[req] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm: Self[req] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var access_token: js.UndefOr[String] = js.native
  var duplicates_timeout: js.UndefOr[Double] = js.native
  var enableTransactions: js.UndefOr[Boolean] = js.native
  var failAfter: js.UndefOr[Double] = js.native
  var request_timeout: js.UndefOr[Double] = js.native
  var response_timeout: js.UndefOr[Double] = js.native
  var socket: js.UndefOr[js.Any] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var useImplicitTransactions: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicates_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicates_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicates_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicates_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTransactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTransactions")(js.undefined)
        ret
    }
    @scala.inline
    def withFailAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withUseImplicitTransactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useImplicitTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseImplicitTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useImplicitTransactions")(js.undefined)
        ret
    }
  }
  
}


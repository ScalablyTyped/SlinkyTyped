package typingsSlinky.autobahn.mod

import typingsSlinky.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionOptions extends js.Object {
  var authid: js.UndefOr[String] = js.native
  var authmethods: js.UndefOr[js.Array[String]] = js.native
  var initial_retry_delay: js.UndefOr[Double] = js.native
  var max_retries: js.UndefOr[Double] = js.native
  var max_retry_delay: js.UndefOr[Double] = js.native
  var onchallenge: js.UndefOr[OnChallengeHandler] = js.native
  var protocols: js.UndefOr[js.Array[String]] = js.native
  var realm: String = js.native
  var retry_delay_growth: js.UndefOr[Double] = js.native
  var retry_delay_jitter: js.UndefOr[Double] = js.native
  var retry_if_unreachable: js.UndefOr[Boolean] = js.native
  var transports: js.UndefOr[js.Array[ITransportDefinition]] = js.native
  var url: js.UndefOr[String] = js.native
  // use explicit deferred factory, e.g. jQuery.Deferred or Q.defer
  var use_deferred: js.UndefOr[DeferFactory] = js.native
  var use_es6_promises: js.UndefOr[Boolean] = js.native
}

object IConnectionOptions {
  @scala.inline
  def apply(realm: String): IConnectionOptions = {
    val __obj = js.Dynamic.literal(realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionOptions]
  }
  @scala.inline
  implicit class IConnectionOptionsOps[Self <: IConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authid")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthmethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authmethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthmethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authmethods")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial_retry_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_retry_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial_retry_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_retry_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_retries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_retries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retries")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_retry_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retry_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_retry_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retry_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchallenge(
      value: (/* session */ Session, /* method */ String, /* extra */ js.Any) => String | Promise_[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchallenge")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnchallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_delay_growth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_delay_growth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_delay_growth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_delay_growth")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_delay_jitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_delay_jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_delay_jitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_delay_jitter")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry_if_unreachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_if_unreachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry_if_unreachable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_if_unreachable")(js.undefined)
        ret
    }
    @scala.inline
    def withTransports(value: js.Array[ITransportDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_deferred(value: () => Promise_[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_deferred")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUse_deferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_deferred")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_es6_promises(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_es6_promises")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_es6_promises: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_es6_promises")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait connectConfig extends baseRequestConfig {
  /**
    * The callback to invoke after onSuccess or onFailure. See connectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ connectCompleteArgs, Unit]] = js.native
  /**
    * The callback to invoke if the connect fails. Defaults to an alert of the error. See connectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ connectFailureArgs, Unit]] = js.native
  /**
    * The callback to invoke if the streaming connection fails. See streamFailureArgs for callback argument details.
    * This method will be invoked if (a) the connection was lost, automatic retries succeeded, but the client had idled on the server (and so needs to reconnect),
    * or (b) the connection was lost and automatic retries failed. In the former case, willReconnect is true, and in the latter case, willReconnect is false.
    * See client for more details on these two scenarios.
    * If willReconnect is true, the client will automatically reconnect. If the reconnect succeeds, the callback specified by onSuccess will be invoked with isReconnect set to true.
    * If the reconnect fails, the callback specified by onFailure will be invoked with isReconnect set to false.
    * With the exception of UI updates, invocations of this callback with willReconnect set to true can be ignored.
    */
  var onStreamFailure: js.UndefOr[js.Function1[/* args */ streamFailureArgs, Unit]] = js.native
  /**
    * The callback to invoke if the connect succeeds. See connectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ connectSuccessArgs, Unit]] = js.native
  /**
    * The callback to invoke when a message is received on a channel that has no local callback specified to handle it. See receiveArgs for callback argument details.
    * This can occur if (a) a client is manually subscribed to a channel by the server or (b) a client subscribed to a channel and then manually removed the local callback using client.
    */
  var onUnhandledReceive: js.UndefOr[js.Function1[/* args */ receiveArgs, Unit]] = js.native
  /**
    * Whether to always attempt to stay connected in the event of network failure. If true, the client will continually reconnect, even after exhausting the specified number
    * of retries specified by initializeConfig.retries. If false, the client will stop reconnecting if all retry attempts fail.
    */
  var stayConnected: js.UndefOr[Boolean] = js.native
}

object connectConfig {
  @scala.inline
  def apply(): connectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[connectConfig]
  }
  @scala.inline
  implicit class connectConfigOps[Self <: connectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: /* args */ connectCompleteArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: /* args */ connectFailureArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStreamFailure(value: /* args */ streamFailureArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStreamFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStreamFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStreamFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: /* args */ connectSuccessArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnhandledReceive(value: /* args */ receiveArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnhandledReceive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnhandledReceive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnhandledReceive")(js.undefined)
        ret
    }
    @scala.inline
    def withStayConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStayConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayConnected")(js.undefined)
        ret
    }
  }
  
}


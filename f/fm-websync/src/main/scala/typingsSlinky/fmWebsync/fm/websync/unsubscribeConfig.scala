package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait unsubscribeConfig extends baseRequestConfig {
  /**
    * The channel from which the client should be unsubscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * The channels from which the client should be unsubscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The callback to invoke after onSuccess or onFailure. See unsubscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.native
  /**
    * The callback to invoke if the unsubscribe fails. See unsubscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, Unit]] = js.native
  /**
    * The callback to invoke if the unsubscribe succeeds. See unsubscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ unsubscribeSuccessArgs, Unit]] = js.native
}

object unsubscribeConfig {
  @scala.inline
  def apply(): unsubscribeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[unsubscribeConfig]
  }
  @scala.inline
  implicit class unsubscribeConfigOps[Self <: unsubscribeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* args */ baseResponseArgs => Unit): Self = {
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
    def withOnFailure(value: /* args */ baseFailureArgs => Unit): Self = {
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
    def withOnSuccess(value: /* args */ unsubscribeSuccessArgs => Unit): Self = {
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
  }
  
}


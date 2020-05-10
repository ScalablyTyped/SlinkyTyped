package typingsSlinky.pahoMqtt.mod._Global_.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeOptions extends js.Object {
  /** passed to the onSuccess callback or onFailure callback.  */
  var invocationContext: js.UndefOr[js.Any] = js.native
  /** called when the unsubscribe request has failed or timed out. */
  var onFailure: js.UndefOr[OnFailureCallback] = js.native
  /** called when the unsubscribe acknowledgement has been received from the server. */
  var onSuccess: js.UndefOr[OnSuccessCallback] = js.native
  /**
    * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
    * The presence of a timeout does not prevent the onSuccess callback from being called when the unsubscribe
    * completes.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object UnsubscribeOptions {
  @scala.inline
  def apply(): UnsubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsubscribeOptions]
  }
  @scala.inline
  implicit class UnsubscribeOptionsOps[Self <: UnsubscribeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationContext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: /* e */ ErrorWithInvocationContext => Unit): Self = {
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
    def withOnSuccess(value: /* o */ WithInvocationContext => Unit): Self = {
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}


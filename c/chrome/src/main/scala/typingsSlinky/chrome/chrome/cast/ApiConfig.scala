package typingsSlinky.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiConfig extends js.Object {
  var autoJoinPolicy: js.UndefOr[AutoJoinPolicy] = js.native
  var defaultActionPolicy: DefaultActionPolicy = js.native
  var sessionRequest: SessionRequest = js.native
  def receiverListener(receiverAvailability: ReceiverAvailability): Unit = js.native
  def sessionListener(session: Session): Unit = js.native
}

object ApiConfig {
  @scala.inline
  def apply(
    defaultActionPolicy: DefaultActionPolicy,
    receiverListener: ReceiverAvailability => Unit,
    sessionListener: Session => Unit,
    sessionRequest: SessionRequest
  ): ApiConfig = {
    val __obj = js.Dynamic.literal(defaultActionPolicy = defaultActionPolicy.asInstanceOf[js.Any], receiverListener = js.Any.fromFunction1(receiverListener), sessionListener = js.Any.fromFunction1(sessionListener), sessionRequest = sessionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiConfig]
  }
  @scala.inline
  implicit class ApiConfigOps[Self <: ApiConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultActionPolicy(value: DefaultActionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiverListener(value: ReceiverAvailability => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSessionListener(value: Session => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSessionRequest(value: SessionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoJoinPolicy(value: AutoJoinPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoJoinPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoJoinPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoJoinPolicy")(js.undefined)
        ret
    }
  }
  
}


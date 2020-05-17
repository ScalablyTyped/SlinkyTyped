package typingsSlinky.sccBrokerClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoMatchingPublishTargetError extends js.Object {
  def NoMatchingPublishTargetError(channelName: String): js.Error = js.native
  def NoMatchingSubscribeTargetError(channelName: String): js.Error = js.native
  def NoMatchingUnsubscribeTargetError(channelName: String): js.Error = js.native
}

object NoMatchingPublishTargetError {
  @scala.inline
  def apply(
    NoMatchingPublishTargetError: String => js.Error,
    NoMatchingSubscribeTargetError: String => js.Error,
    NoMatchingUnsubscribeTargetError: String => js.Error
  ): NoMatchingPublishTargetError = {
    val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
    __obj.asInstanceOf[NoMatchingPublishTargetError]
  }
  @scala.inline
  implicit class NoMatchingPublishTargetErrorOps[Self <: NoMatchingPublishTargetError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoMatchingPublishTargetError(value: String => js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoMatchingPublishTargetError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNoMatchingSubscribeTargetError(value: String => js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoMatchingSubscribeTargetError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNoMatchingUnsubscribeTargetError(value: String => js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoMatchingUnsubscribeTargetError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


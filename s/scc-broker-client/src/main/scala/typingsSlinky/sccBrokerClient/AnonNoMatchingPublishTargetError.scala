package typingsSlinky.sccBrokerClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoMatchingPublishTargetError extends js.Object {
  def NoMatchingPublishTargetError(channelName: String): js.Error
  def NoMatchingSubscribeTargetError(channelName: String): js.Error
  def NoMatchingUnsubscribeTargetError(channelName: String): js.Error
}

object AnonNoMatchingPublishTargetError {
  @scala.inline
  def apply(
    NoMatchingPublishTargetError: String => js.Error,
    NoMatchingSubscribeTargetError: String => js.Error,
    NoMatchingUnsubscribeTargetError: String => js.Error
  ): AnonNoMatchingPublishTargetError = {
    val __obj = js.Dynamic.literal(NoMatchingPublishTargetError = js.Any.fromFunction1(NoMatchingPublishTargetError), NoMatchingSubscribeTargetError = js.Any.fromFunction1(NoMatchingSubscribeTargetError), NoMatchingUnsubscribeTargetError = js.Any.fromFunction1(NoMatchingUnsubscribeTargetError))
  
    __obj.asInstanceOf[AnonNoMatchingPublishTargetError]
  }
}


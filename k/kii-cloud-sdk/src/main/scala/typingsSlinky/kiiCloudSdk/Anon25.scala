package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon25 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiTopic, isSubscribed: Boolean): js.Any
}

object Anon25 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiPushSubscription, KiiTopic, Boolean) => js.Any): Anon25 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon25]
  }
}


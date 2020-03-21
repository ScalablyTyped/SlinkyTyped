package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiBucket
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiPushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon22 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(subscription: KiiPushSubscription, topic: KiiBucket): js.Any
}

object Anon22 {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiPushSubscription, KiiBucket) => js.Any): Anon22 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon22]
  }
}


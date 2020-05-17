package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiPushSubscription
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `21` extends js.Object {
  def failure(error: js.Error): js.Any = js.native
  def success(subscription: KiiPushSubscription, topic: KiiTopic): js.Any = js.native
}

object `21` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiPushSubscription, KiiTopic) => js.Any): `21` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`21`]
  }
  @scala.inline
  implicit class `21Ops`[Self <: `21`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailure(value: js.Error => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuccess(value: (KiiPushSubscription, KiiTopic) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


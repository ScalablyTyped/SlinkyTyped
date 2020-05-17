package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiBucket
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiPushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `22` extends js.Object {
  def failure(error: js.Error): js.Any = js.native
  def success(subscription: KiiPushSubscription, topic: KiiBucket, isSubscribed: Boolean): js.Any = js.native
}

object `22` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: (KiiPushSubscription, KiiBucket, Boolean) => js.Any): `22` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`22`]
  }
  @scala.inline
  implicit class `22Ops`[Self <: `22`] (val x: Self) extends AnyVal {
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
    def withSuccess(value: (KiiPushSubscription, KiiBucket, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}


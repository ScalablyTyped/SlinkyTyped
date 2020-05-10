package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushAdminPromise extends js.Object {
  var channelSubscriptions: PushChannelSubscriptionsPromise = js.native
  var deviceRegistrations: PushDeviceRegistrationsPromise = js.native
  def publish(recipient: js.Any, payload: js.Any): js.Promise[Unit] = js.native
}

object PushAdminPromise {
  @scala.inline
  def apply(
    channelSubscriptions: PushChannelSubscriptionsPromise,
    deviceRegistrations: PushDeviceRegistrationsPromise,
    publish: (js.Any, js.Any) => js.Promise[Unit]
  ): PushAdminPromise = {
    val __obj = js.Dynamic.literal(channelSubscriptions = channelSubscriptions.asInstanceOf[js.Any], deviceRegistrations = deviceRegistrations.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish))
    __obj.asInstanceOf[PushAdminPromise]
  }
  @scala.inline
  implicit class PushAdminPromiseOps[Self <: PushAdminPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelSubscriptions(value: PushChannelSubscriptionsPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceRegistrations(value: PushDeviceRegistrationsPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRegistrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublish(value: (js.Any, js.Any) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


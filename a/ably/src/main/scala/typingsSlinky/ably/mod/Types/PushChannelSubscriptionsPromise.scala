package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushChannelSubscriptionsPromise extends js.Object {
  def list(params: PushChannelSubscriptionParams): js.Promise[PaginatedResult[PushChannelSubscription]] = js.native
  def listChannels(params: PushChannelsParams): js.Promise[PaginatedResult[String]] = js.native
  def remove(subscription: PushChannelSubscription): js.Promise[Unit] = js.native
  def removeWhere(params: PushChannelSubscriptionParams): js.Promise[Unit] = js.native
  def save(subscription: PushChannelSubscription): js.Promise[PushChannelSubscription] = js.native
}

object PushChannelSubscriptionsPromise {
  @scala.inline
  def apply(
    list: PushChannelSubscriptionParams => js.Promise[PaginatedResult[PushChannelSubscription]],
    listChannels: PushChannelsParams => js.Promise[PaginatedResult[String]],
    remove: PushChannelSubscription => js.Promise[Unit],
    removeWhere: PushChannelSubscriptionParams => js.Promise[Unit],
    save: PushChannelSubscription => js.Promise[PushChannelSubscription]
  ): PushChannelSubscriptionsPromise = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), listChannels = js.Any.fromFunction1(listChannels), remove = js.Any.fromFunction1(remove), removeWhere = js.Any.fromFunction1(removeWhere), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[PushChannelSubscriptionsPromise]
  }
  @scala.inline
  implicit class PushChannelSubscriptionsPromiseOps[Self <: PushChannelSubscriptionsPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: PushChannelSubscriptionParams => js.Promise[PaginatedResult[PushChannelSubscription]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListChannels(value: PushChannelsParams => js.Promise[PaginatedResult[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listChannels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: PushChannelSubscription => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveWhere(value: PushChannelSubscriptionParams => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWhere")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSave(value: PushChannelSubscription => js.Promise[PushChannelSubscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


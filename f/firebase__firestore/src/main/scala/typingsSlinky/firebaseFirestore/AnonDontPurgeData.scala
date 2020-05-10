package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.asyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDontPurgeData extends js.Object {
  var dontPurgeData: js.UndefOr[Boolean] = js.native
  var queue: js.UndefOr[AsyncQueue] = js.native
  var synchronizeTabs: js.UndefOr[Boolean] = js.native
}

object AnonDontPurgeData {
  @scala.inline
  def apply(): AnonDontPurgeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDontPurgeData]
  }
  @scala.inline
  implicit class AnonDontPurgeDataOps[Self <: AnonDontPurgeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDontPurgeData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontPurgeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontPurgeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontPurgeData")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: AsyncQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronizeTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronizeTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeTabs")(js.undefined)
        ret
    }
  }
  
}


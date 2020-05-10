package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesResult extends js.Object {
  /**
    * A list of queue URLs, up to 1,000 entries.
    */
  var QueueUrls: js.UndefOr[QueueUrlList] = js.native
}

object ListQueuesResult {
  @scala.inline
  def apply(): ListQueuesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResult]
  }
  @scala.inline
  implicit class ListQueuesResultOps[Self <: ListQueuesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueUrls(value: QueueUrlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueUrls")(js.undefined)
        ret
    }
  }
  
}


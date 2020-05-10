package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesRequest extends js.Object {
  /**
    * A string to use for filtering the list results. Only those queues whose name begins with the specified string are returned. Queue URLs and names are case-sensitive.
    */
  var QueueNamePrefix: js.UndefOr[String] = js.native
}

object ListQueuesRequest {
  @scala.inline
  def apply(): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesRequest]
  }
  @scala.inline
  implicit class ListQueuesRequestOps[Self <: ListQueuesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueNamePrefix")(js.undefined)
        ret
    }
  }
  
}


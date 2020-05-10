package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesResponse extends js.Object {
  /**
    * Use this string to request the next batch of queues.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * List of queues.
    */
  var Queues: js.UndefOr[listOfQueue] = js.native
}

object ListQueuesResponse {
  @scala.inline
  def apply(): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResponse]
  }
  @scala.inline
  implicit class ListQueuesResponseOps[Self <: ListQueuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withQueues(value: listOfQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Queues")(js.undefined)
        ret
    }
  }
  
}


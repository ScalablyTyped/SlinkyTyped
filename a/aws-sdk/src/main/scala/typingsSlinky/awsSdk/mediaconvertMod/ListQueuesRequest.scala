package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesRequest extends js.Object {
  /**
    * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
    */
  var ListBy: js.UndefOr[QueueListBy] = js.native
  /**
    * Optional. Number of queues, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[integerMin1Max20] = js.native
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of queues.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Order] = js.native
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
    def withListBy(value: QueueListBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: integerMin1Max20): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
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
    def withOrder(value: Order): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(js.undefined)
        ret
    }
  }
  
}


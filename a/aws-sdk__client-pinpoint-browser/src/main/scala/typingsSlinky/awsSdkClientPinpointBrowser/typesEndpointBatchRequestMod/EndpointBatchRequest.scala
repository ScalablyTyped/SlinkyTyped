package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.EndpointBatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointBatchRequest extends js.Object {
  /**
    * List of items to update. Maximum 100 items
    */
  var Item: js.UndefOr[js.Array[EndpointBatchItem] | js.Iterable[EndpointBatchItem]] = js.native
}

object EndpointBatchRequest {
  @scala.inline
  def apply(): EndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointBatchRequest]
  }
  @scala.inline
  implicit class EndpointBatchRequestOps[Self <: EndpointBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIterable(value: js.Iterable[EndpointBatchItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Array[EndpointBatchItem] | js.Iterable[EndpointBatchItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
  }
  
}


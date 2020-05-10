package typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.UnmarshalledEndpointBatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEndpointBatchRequest extends EndpointBatchRequest {
  /**
    * List of items to update. Maximum 100 items
    */
  @JSName("Item")
  var Item_UnmarshalledEndpointBatchRequest: js.UndefOr[js.Array[UnmarshalledEndpointBatchItem]] = js.native
}

object UnmarshalledEndpointBatchRequest {
  @scala.inline
  def apply(): UnmarshalledEndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointBatchRequest]
  }
  @scala.inline
  implicit class UnmarshalledEndpointBatchRequestOps[Self <: UnmarshalledEndpointBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Array[UnmarshalledEndpointBatchItem]): Self = {
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


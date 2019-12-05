package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointBatchRequestMod

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointBatchItemMod._EndpointBatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EndpointBatchRequest extends js.Object {
  /**
    * List of items to update. Maximum 100 items
    */
  var Item: js.UndefOr[js.Array[_EndpointBatchItem] | js.Iterable[_EndpointBatchItem]] = js.undefined
}

object _EndpointBatchRequest {
  @scala.inline
  def apply(Item: js.Array[_EndpointBatchItem] | js.Iterable[_EndpointBatchItem] = null): _EndpointBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EndpointBatchRequest]
  }
}


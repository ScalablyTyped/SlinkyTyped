package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipBatchResponse extends js.Object {
  /** GossipBatchResponse content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IGossipBatchResponse {
  @scala.inline
  def apply(content: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined): IGossipBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBatchResponse]
  }
}


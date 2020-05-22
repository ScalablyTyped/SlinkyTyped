package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusFinalizeBlockRequest extends js.Object {
  /** ConsensusFinalizeBlockRequest data */
  var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IConsensusFinalizeBlockRequest {
  @scala.inline
  def apply(data: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined): IConsensusFinalizeBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusFinalizeBlockRequest]
  }
}


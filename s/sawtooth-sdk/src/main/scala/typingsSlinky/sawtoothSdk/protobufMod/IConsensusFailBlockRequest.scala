package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusFailBlockRequest extends js.Object {
  /** ConsensusFailBlockRequest blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IConsensusFailBlockRequest {
  @scala.inline
  def apply(blockId: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined): IConsensusFailBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusFailBlockRequest]
  }
}


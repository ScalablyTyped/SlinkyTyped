package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusCheckBlocksRequest extends js.Object {
  /** ConsensusCheckBlocksRequest blockIds */
  var blockIds: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.undefined
}

object IConsensusCheckBlocksRequest {
  @scala.inline
  def apply(blockIds: js.UndefOr[Null | js.Array[js.typedarray.Uint8Array]] = js.undefined): IConsensusCheckBlocksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockIds)) __obj.updateDynamic("blockIds")(blockIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusCheckBlocksRequest]
  }
}


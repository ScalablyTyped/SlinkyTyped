package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusIgnoreBlockRequest extends js.Object {
  /** ConsensusIgnoreBlockRequest blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IConsensusIgnoreBlockRequest {
  @scala.inline
  def apply(blockId: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined): IConsensusIgnoreBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusIgnoreBlockRequest]
  }
}


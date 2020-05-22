package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyBlockInvalid extends js.Object {
  /** ConsensusNotifyBlockInvalid blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IConsensusNotifyBlockInvalid {
  @scala.inline
  def apply(blockId: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined): IConsensusNotifyBlockInvalid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyBlockInvalid]
  }
}


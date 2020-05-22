package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusStateGetRequest extends js.Object {
  /** ConsensusStateGetRequest addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ConsensusStateGetRequest blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IConsensusStateGetRequest {
  @scala.inline
  def apply(
    addresses: js.UndefOr[Null | js.Array[String]] = js.undefined,
    blockId: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined
  ): IConsensusStateGetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addresses)) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusStateGetRequest]
  }
}


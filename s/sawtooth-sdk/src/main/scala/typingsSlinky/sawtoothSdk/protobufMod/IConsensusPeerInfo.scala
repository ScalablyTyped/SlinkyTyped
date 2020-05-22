package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusPeerInfo extends js.Object {
  /** ConsensusPeerInfo peerId */
  var peerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}

object IConsensusPeerInfo {
  @scala.inline
  def apply(peerId: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined): IConsensusPeerInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(peerId)) __obj.updateDynamic("peerId")(peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusPeerInfo]
  }
}


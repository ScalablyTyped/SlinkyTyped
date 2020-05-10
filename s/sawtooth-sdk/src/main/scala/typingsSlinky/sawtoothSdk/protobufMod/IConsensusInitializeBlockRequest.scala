package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusInitializeBlockRequest extends js.Object {
  /** ConsensusInitializeBlockRequest previousId */
  var previousId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object IConsensusInitializeBlockRequest {
  @scala.inline
  def apply(): IConsensusInitializeBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusInitializeBlockRequest]
  }
  @scala.inline
  implicit class IConsensusInitializeBlockRequestOps[Self <: IConsensusInitializeBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousId(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousId")(null)
        ret
    }
  }
  
}


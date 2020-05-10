package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusNotifyBlockNew extends js.Object {
  /** ConsensusNotifyBlockNew block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.native
}

object IConsensusNotifyBlockNew {
  @scala.inline
  def apply(): IConsensusNotifyBlockNew = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockNew]
  }
  @scala.inline
  implicit class IConsensusNotifyBlockNewOps[Self <: IConsensusNotifyBlockNew] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: IConsensusBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(null)
        ret
    }
  }
  
}


package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGenesisData extends js.Object {
  /** GenesisData batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.native
}

object IGenesisData {
  @scala.inline
  def apply(): IGenesisData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGenesisData]
  }
  @scala.inline
  implicit class IGenesisDataOps[Self <: IGenesisData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatches(value: js.Array[IBatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batches")(null)
        ret
    }
  }
  
}


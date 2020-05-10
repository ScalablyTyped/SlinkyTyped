package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlock extends js.Object {
  /** Block batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.native
  /** Block header */
  var header: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** Block headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.native
}

object IBlock {
  @scala.inline
  def apply(): IBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlock]
  }
  @scala.inline
  implicit class IBlockOps[Self <: IBlock] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withHeader(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(null)
        ret
    }
    @scala.inline
    def withHeaderSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderSignatureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSignature")(null)
        ret
    }
  }
  
}


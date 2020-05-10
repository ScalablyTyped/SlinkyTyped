package typingsSlinky.ethereumjsTx.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeTxData extends TxData {
  /**
    * The sender of the Tx.
    */
  var from: js.UndefOr[BufferLike] = js.native
}

object FakeTxData {
  @scala.inline
  def apply(): FakeTxData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FakeTxData]
  }
  @scala.inline
  implicit class FakeTxDataOps[Self <: FakeTxData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: BufferLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
  }
  
}


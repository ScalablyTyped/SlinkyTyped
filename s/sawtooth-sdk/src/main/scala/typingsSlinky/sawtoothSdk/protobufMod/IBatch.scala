package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatch extends js.Object {
  /** Batch header */
  var header: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** Batch headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.native
  /** Batch trace */
  var trace: js.UndefOr[Boolean | Null] = js.native
  /** Batch transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}

object IBatch {
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  @scala.inline
  implicit class IBatchOps[Self <: IBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(null)
        ret
    }
    @scala.inline
    def withTransactions(value: js.Array[ITransaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(null)
        ret
    }
  }
  
}


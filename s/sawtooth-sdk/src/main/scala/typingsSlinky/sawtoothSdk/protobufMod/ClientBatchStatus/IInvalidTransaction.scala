package typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InvalidTransaction. */
@js.native
trait IInvalidTransaction extends js.Object {
  /** InvalidTransaction extendedData */
  var extendedData: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** InvalidTransaction message */
  var message: js.UndefOr[String | Null] = js.native
  /** InvalidTransaction transactionId */
  var transactionId: js.UndefOr[String | Null] = js.native
}

object IInvalidTransaction {
  @scala.inline
  def apply(): IInvalidTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvalidTransaction]
  }
  @scala.inline
  implicit class IInvalidTransactionOps[Self <: IInvalidTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedData(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedData")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedData")(null)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(null)
        ret
    }
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(null)
        ret
    }
  }
  
}


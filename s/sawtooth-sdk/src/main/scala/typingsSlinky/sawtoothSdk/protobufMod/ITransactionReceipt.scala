package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransactionReceipt extends js.Object {
  /** TransactionReceipt data */
  var data: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.native
  /** TransactionReceipt events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.native
  /** TransactionReceipt stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.native
  /** TransactionReceipt transactionId */
  var transactionId: js.UndefOr[String | Null] = js.native
}

object ITransactionReceipt {
  @scala.inline
  def apply(): ITransactionReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionReceipt]
  }
  @scala.inline
  implicit class ITransactionReceiptOps[Self <: ITransactionReceipt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[IEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(null)
        ret
    }
    @scala.inline
    def withStateChanges(value: js.Array[IStateChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanges")(null)
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


package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactGetItemsInput extends js.Object {
  /**
    * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
    */
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
  /**
    * An ordered array of up to 25 TransactGetItem objects, each of which contains a Get structure.
    */
  var TransactItems: TransactGetItemList = js.native
}

object TransactGetItemsInput {
  @scala.inline
  def apply(TransactItems: TransactGetItemList): TransactGetItemsInput = {
    val __obj = js.Dynamic.literal(TransactItems = TransactItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactGetItemsInput]
  }
  @scala.inline
  implicit class TransactGetItemsInputOps[Self <: TransactGetItemsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactItems(value: TransactGetItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnConsumedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnConsumedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnConsumedCapacity")(js.undefined)
        ret
    }
  }
  
}


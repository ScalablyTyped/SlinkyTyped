package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactWriteItem extends js.Object {
  /**
    * A request to perform a check item operation.
    */
  var ConditionCheck: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ConditionCheck] = js.native
  /**
    * A request to perform a DeleteItem operation.
    */
  var Delete: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Delete] = js.native
  /**
    * A request to perform a PutItem operation.
    */
  var Put: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Put] = js.native
  /**
    * A request to perform an UpdateItem operation.
    */
  var Update: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.Update] = js.native
}

object TransactWriteItem {
  @scala.inline
  def apply(): TransactWriteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactWriteItem]
  }
  @scala.inline
  implicit class TransactWriteItemOps[Self <: TransactWriteItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionCheck(value: ConditionCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: Delete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.undefined)
        ret
    }
    @scala.inline
    def withPut(value: Put): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Put")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Put")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.undefined)
        ret
    }
  }
  
}


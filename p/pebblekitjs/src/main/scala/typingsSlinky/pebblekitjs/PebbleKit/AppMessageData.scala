package typingsSlinky.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppMessageData extends js.Object {
  var transactionId: String = js.native
}

object AppMessageData {
  @scala.inline
  def apply(transactionId: String): AppMessageData = {
    val __obj = js.Dynamic.literal(transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMessageData]
  }
  @scala.inline
  implicit class AppMessageDataOps[Self <: AppMessageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


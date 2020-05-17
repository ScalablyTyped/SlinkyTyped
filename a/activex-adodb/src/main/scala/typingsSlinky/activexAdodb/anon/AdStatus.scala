package typingsSlinky.activexAdodb.anon

import typingsSlinky.activexAdodb.ADODB.Connection
import typingsSlinky.activexAdodb.ADODB.Error
import typingsSlinky.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdStatus extends js.Object {
  val TransactionLevel: Double = js.native
  var adStatus: EventStatusEnum = js.native
  val pConnection: Connection = js.native
  val pError: Error = js.native
}

object AdStatus {
  @scala.inline
  def apply(TransactionLevel: Double, adStatus: EventStatusEnum, pConnection: Connection, pError: Error): AdStatus = {
    val __obj = js.Dynamic.literal(TransactionLevel = TransactionLevel.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdStatus]
  }
  @scala.inline
  implicit class AdStatusOps[Self <: AdStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdStatus(value: EventStatusEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPError(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


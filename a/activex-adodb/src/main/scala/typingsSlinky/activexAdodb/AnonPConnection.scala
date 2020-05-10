package typingsSlinky.activexAdodb

import typingsSlinky.activexAdodb.ADODB.Connection
import typingsSlinky.activexAdodb.ADODB.Error
import typingsSlinky.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPConnection extends js.Object {
  var adStatus: EventStatusEnum = js.native
  val pConnection: Connection = js.native
  val pError: Error = js.native
}

object AnonPConnection {
  @scala.inline
  def apply(adStatus: EventStatusEnum, pConnection: Connection, pError: Error): AnonPConnection = {
    val __obj = js.Dynamic.literal(adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any], pError = pError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPConnection]
  }
  @scala.inline
  implicit class AnonPConnectionOps[Self <: AnonPConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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


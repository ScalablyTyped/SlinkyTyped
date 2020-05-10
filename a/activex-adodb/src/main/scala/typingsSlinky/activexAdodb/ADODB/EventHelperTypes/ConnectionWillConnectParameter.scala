package typingsSlinky.activexAdodb.ADODB.EventHelperTypes

import typingsSlinky.activexAdodb.ADODB.Connection
import typingsSlinky.activexAdodb.ADODB.EventStatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionWillConnectParameter extends js.Object {
  var ConnectionString: String = js.native
  var Options: Double = js.native
  var Password: String = js.native
  var UserID: String = js.native
  var adStatus: EventStatusEnum = js.native
  val pConnection: Connection = js.native
}

object ConnectionWillConnectParameter {
  @scala.inline
  def apply(
    ConnectionString: String,
    Options: Double,
    Password: String,
    UserID: String,
    adStatus: EventStatusEnum,
    pConnection: Connection
  ): ConnectionWillConnectParameter = {
    val __obj = js.Dynamic.literal(ConnectionString = ConnectionString.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionWillConnectParameter]
  }
  @scala.inline
  implicit class ConnectionWillConnectParameterOps[Self <: ConnectionWillConnectParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserID")(value.asInstanceOf[js.Any])
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
  }
  
}


package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterRdsDbInstanceRequest extends js.Object {
  /**
    * The database password.
    */
  var DbPassword: String = js.native
  /**
    * The database's master user name.
    */
  var DbUser: String = js.native
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object RegisterRdsDbInstanceRequest {
  @scala.inline
  def apply(DbPassword: String, DbUser: String, RdsDbInstanceArn: String, StackId: String): RegisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(DbPassword = DbPassword.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any], RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRdsDbInstanceRequest]
  }
  @scala.inline
  implicit class RegisterRdsDbInstanceRequestOps[Self <: RegisterRdsDbInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdsDbInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


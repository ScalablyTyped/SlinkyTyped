package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRdsDbInstanceRequest extends js.Object {
  /**
    * The database password.
    */
  var DbPassword: js.UndefOr[String] = js.native
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.native
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
}

object UpdateRdsDbInstanceRequest {
  @scala.inline
  def apply(RdsDbInstanceArn: String): UpdateRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRdsDbInstanceRequest]
  }
  @scala.inline
  implicit class UpdateRdsDbInstanceRequestOps[Self <: UpdateRdsDbInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRdsDbInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withDbUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(js.undefined)
        ret
    }
  }
  
}


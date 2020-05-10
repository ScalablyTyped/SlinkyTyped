package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterRdsDbInstanceRequest extends js.Object {
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
}

object DeregisterRdsDbInstanceRequest {
  @scala.inline
  def apply(RdsDbInstanceArn: String): DeregisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterRdsDbInstanceRequest]
  }
  @scala.inline
  implicit class DeregisterRdsDbInstanceRequestOps[Self <: DeregisterRdsDbInstanceRequest] (val x: Self) extends AnyVal {
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
  }
  
}


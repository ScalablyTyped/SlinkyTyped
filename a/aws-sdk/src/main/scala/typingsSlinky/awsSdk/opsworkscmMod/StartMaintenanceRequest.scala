package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMaintenanceRequest extends js.Object {
  /**
    * Engine attributes that are specific to the server on which you want to run maintenance.  Attributes accepted in a StartMaintenance request for Chef     CHEF_MAJOR_UPGRADE: If a Chef Automate server is eligible for upgrade to Chef Automate 2, add this engine attribute to a StartMaintenance request and set the value to true to upgrade the server to Chef Automate 2. For more information, see Upgrade an AWS OpsWorks for Chef Automate Server to Chef Automate 2.   
    */
  var EngineAttributes: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  /**
    * The name of the server on which to run maintenance. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
}

object StartMaintenanceRequest {
  @scala.inline
  def apply(ServerName: ServerName): StartMaintenanceRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMaintenanceRequest]
  }
  @scala.inline
  implicit class StartMaintenanceRequestOps[Self <: StartMaintenanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineAttributes(value: EngineAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineAttributes")(js.undefined)
        ret
    }
  }
  
}


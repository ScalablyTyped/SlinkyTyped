package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackConfiguration extends js.Object {
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var MonitoringTimeInMinutes: js.UndefOr[integer] = js.native
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var RollbackTriggers: js.UndefOr[listOfRollbackTrigger] = js.native
}

object RollbackConfiguration {
  @scala.inline
  def apply(): RollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackConfiguration]
  }
  @scala.inline
  implicit class RollbackConfigurationOps[Self <: RollbackConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitoringTimeInMinutes(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringTimeInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringTimeInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringTimeInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withRollbackTriggers(value: listOfRollbackTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RollbackTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RollbackTriggers")(js.undefined)
        ret
    }
  }
  
}


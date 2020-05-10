package typingsSlinky.pulumiAws.inputMod.codedeploy

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupAlarmConfiguration extends js.Object {
  /**
    * A list of alarms configured for the deployment group. _A maximum of 10 alarms can be added to a deployment group_.
    */
  var alarms: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from CloudWatch. The default value is `false`.
    * * `true`: The deployment will proceed even if alarm status information can't be retrieved.
    * * `false`: The deployment will stop if alarm status information can't be retrieved.
    */
  var ignorePollAlarmFailure: js.UndefOr[Input[Boolean]] = js.native
}

object DeploymentGroupAlarmConfiguration {
  @scala.inline
  def apply(): DeploymentGroupAlarmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupAlarmConfiguration]
  }
  @scala.inline
  implicit class DeploymentGroupAlarmConfigurationOps[Self <: DeploymentGroupAlarmConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarms(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alarms")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePollAlarmFailure(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePollAlarmFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePollAlarmFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePollAlarmFailure")(js.undefined)
        ret
    }
  }
  
}


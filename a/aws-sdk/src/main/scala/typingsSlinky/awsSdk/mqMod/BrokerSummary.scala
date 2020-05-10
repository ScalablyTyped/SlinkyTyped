package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.native
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.native
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[typingsSlinky.awsSdk.mqMod.BrokerState] = js.native
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[js.Date] = js.native
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typingsSlinky.awsSdk.mqMod.DeploymentMode] = js.native
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
}

object BrokerSummary {
  @scala.inline
  def apply(): BrokerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerSummary]
  }
  @scala.inline
  implicit class BrokerSummaryOps[Self <: BrokerSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerId")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerName")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerState(value: BrokerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerState")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentMode(value: DeploymentMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHostInstanceType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostInstanceType")(js.undefined)
        ret
    }
  }
  
}


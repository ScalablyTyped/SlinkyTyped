package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flow extends js.Object {
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.
    */
  var AvailabilityZone: string = js.native
  /**
    * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var EgressIp: js.UndefOr[string] = js.native
  /**
    * The entitlements in this flow.
    */
  var Entitlements: listOfEntitlement = js.native
  /**
    * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
    */
  var FlowArn: string = js.native
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  /**
    * The outputs in this flow.
    */
  var Outputs: listOfOutput = js.native
  var Source: typingsSlinky.awsSdk.mediaconnectMod.Source = js.native
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.native
  var Sources: js.UndefOr[listOfSource] = js.native
  /**
    * The current status of the flow.
    */
  var Status: typingsSlinky.awsSdk.mediaconnectMod.Status = js.native
}

object Flow {
  @scala.inline
  def apply(
    AvailabilityZone: string,
    Entitlements: listOfEntitlement,
    FlowArn: string,
    Name: string,
    Outputs: listOfOutput,
    Source: Source,
    Status: Status
  ): Flow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  implicit class FlowOps[Self <: Flow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntitlements(value: listOfEntitlement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: listOfOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressIp(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressIp")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFailoverConfig(value: FailoverConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFailoverConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFailoverConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFailoverConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: listOfSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowRequest extends js.Object {
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS Region.
    */
  var AvailabilityZone: js.UndefOr[string] = js.native
  /**
    * The entitlements that you want to grant on a flow.
    */
  var Entitlements: js.UndefOr[listOfGrantEntitlementRequest] = js.native
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  /**
    * The outputs that you want to add to this flow.
    */
  var Outputs: js.UndefOr[listOfAddOutputRequest] = js.native
  var Source: js.UndefOr[SetSourceRequest] = js.native
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.native
  var Sources: js.UndefOr[listOfSetSourceRequest] = js.native
}

object CreateFlowRequest {
  @scala.inline
  def apply(Name: string): CreateFlowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowRequest]
  }
  @scala.inline
  implicit class CreateFlowRequestOps[Self <: CreateFlowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlements(value: listOfGrantEntitlementRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entitlements")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: listOfAddOutputRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: SetSourceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
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
    def withSources(value: listOfSetSourceRequest): Self = {
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


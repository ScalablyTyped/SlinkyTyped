package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedFlow extends js.Object {
  /**
    * The Availability Zone that the flow was created in.
    */
  var AvailabilityZone: string = js.native
  /**
    * A description of the flow.
    */
  var Description: string = js.native
  /**
    * The ARN of the flow.
    */
  var FlowArn: string = js.native
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  /**
    * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another AWS account).
    */
  var SourceType: typingsSlinky.awsSdk.mediaconnectMod.SourceType = js.native
  /**
    * The current status of the flow.
    */
  var Status: typingsSlinky.awsSdk.mediaconnectMod.Status = js.native
}

object ListedFlow {
  @scala.inline
  def apply(
    AvailabilityZone: string,
    Description: string,
    FlowArn: string,
    Name: string,
    SourceType: SourceType,
    Status: Status
  ): ListedFlow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedFlow]
  }
  @scala.inline
  implicit class ListedFlowOps[Self <: ListedFlow] (val x: Self) extends AnyVal {
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
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
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
    def withSourceType(value: SourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


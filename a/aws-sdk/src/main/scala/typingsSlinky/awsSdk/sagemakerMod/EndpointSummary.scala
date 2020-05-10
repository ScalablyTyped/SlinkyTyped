package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointSummary extends js.Object {
  /**
    * A timestamp that shows when the endpoint was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typingsSlinky.awsSdk.sagemakerMod.EndpointArn = js.native
  /**
    * The name of the endpoint.
    */
  var EndpointName: typingsSlinky.awsSdk.sagemakerMod.EndpointName = js.native
  /**
    * The status of the endpoint.    OutOfService: Endpoint is not available to take incoming requests.    Creating: CreateEndpoint is executing.    Updating: UpdateEndpoint or UpdateEndpointWeightsAndCapacities is executing.    SystemUpdating: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled until it has completed. This maintenance operation does not change any customer-specified values such as VPC config, KMS encryption, model, instance type, or instance count.    RollingBack: Endpoint fails to scale up or down or change its variant weight and is in the process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an InService status. This transitional status only applies to an endpoint that has autoscaling enabled and is undergoing variant weight or capacity changes as part of an UpdateEndpointWeightsAndCapacities call or when the UpdateEndpointWeightsAndCapacities operation is called explicitly.    InService: Endpoint is available to process incoming requests.    Deleting: DeleteEndpoint is executing.    Failed: Endpoint could not be created, updated, or re-scaled. Use DescribeEndpointOutput$FailureReason for information about the failure. DeleteEndpoint is the only operation that can be performed on a failed endpoint.   To get a list of endpoints with a specified status, use the ListEndpointsInput$StatusEquals filter.
    */
  var EndpointStatus: typingsSlinky.awsSdk.sagemakerMod.EndpointStatus = js.native
  /**
    * A timestamp that shows when the endpoint was last modified.
    */
  var LastModifiedTime: js.Date = js.native
}

object EndpointSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    EndpointArn: EndpointArn,
    EndpointName: EndpointName,
    EndpointStatus: EndpointStatus,
    LastModifiedTime: js.Date
  ): EndpointSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], EndpointStatus = EndpointStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointSummary]
  }
  @scala.inline
  implicit class EndpointSummaryOps[Self <: EndpointSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointArn(value: EndpointArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointName(value: EndpointName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointStatus(value: EndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


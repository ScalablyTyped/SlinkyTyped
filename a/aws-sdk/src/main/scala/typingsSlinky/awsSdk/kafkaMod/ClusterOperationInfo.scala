package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOperationInfo extends js.Object {
  /**
    * 
    The ID of the API request that triggered this operation.
    
    */
  var ClientRequestId: js.UndefOr[string] = js.native
  /**
    * 
    ARN of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  /**
    * 
    The time that the operation was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * 
    The time at which the operation finished.
    
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * 
    Describes the error if the operation fails.
    
    */
  var ErrorInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ErrorInfo] = js.native
  /**
    * 
    ARN of the cluster operation.
    
    */
  var OperationArn: js.UndefOr[string] = js.native
  /**
    * 
    State of the cluster operation.
    
    */
  var OperationState: js.UndefOr[string] = js.native
  /**
    * 
    Type of the cluster operation.
    
    */
  var OperationType: js.UndefOr[string] = js.native
  /**
    * 
    Information about cluster attributes before a cluster is updated.
    
    */
  var SourceClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
  /**
    * 
    Information about cluster attributes after a cluster is updated.
    
    */
  var TargetClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
}

object ClusterOperationInfo {
  @scala.inline
  def apply(): ClusterOperationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationInfo]
  }
  @scala.inline
  implicit class ClusterOperationInfoOps[Self <: ClusterOperationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRequestId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorInfo(value: ErrorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationState(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationState")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceClusterInfo(value: MutableClusterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceClusterInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceClusterInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceClusterInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetClusterInfo(value: MutableClusterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetClusterInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetClusterInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetClusterInfo")(js.undefined)
        ret
    }
  }
  
}


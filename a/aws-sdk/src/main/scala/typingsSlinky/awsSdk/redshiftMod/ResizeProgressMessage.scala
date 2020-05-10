package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeProgressMessage extends js.Object {
  /**
    * The average rate of the resize operation over the last few minutes, measured in megabytes per second. After the resize operation completes, this value shows the average rate of the entire resize operation.
    */
  var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.native
  /**
    * The percent of data transferred from source cluster to target cluster.
    */
  var DataTransferProgressPercent: js.UndefOr[DoubleOptional] = js.native
  /**
    * The amount of seconds that have elapsed since the resize operation began. After the resize operation completes, this value shows the total actual time, in seconds, for the resize operation.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * The estimated time remaining, in seconds, until the resize operation is complete. This value is calculated based on the average resize rate and the estimated amount of data remaining to be processed. Once the resize operation is complete, this value will be 0.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * The names of tables that have been completely imported . Valid Values: List of table names.
    */
  var ImportTablesCompleted: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ImportTablesCompleted] = js.native
  /**
    * The names of tables that are being currently imported. Valid Values: List of table names.
    */
  var ImportTablesInProgress: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ImportTablesInProgress] = js.native
  /**
    * The names of tables that have not been yet imported. Valid Values: List of table names
    */
  var ImportTablesNotStarted: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ImportTablesNotStarted] = js.native
  /**
    * An optional string to provide additional details about the resize action.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * While the resize operation is in progress, this value shows the current amount of data, in megabytes, that has been processed so far. When the resize operation is complete, this value shows the total amount of data, in megabytes, on the cluster, which may be more or less than TotalResizeDataInMegaBytes (the estimated total amount of data before resize).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.native
  /**
    * An enum with possible values of ClassicResize and ElasticResize. These values describe the type of resize operation being performed. 
    */
  var ResizeType: js.UndefOr[String] = js.native
  /**
    * The status of the resize operation. Valid Values: NONE | IN_PROGRESS | FAILED | SUCCEEDED | CANCELLING 
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The cluster type after the resize operation is complete. Valid Values: multi-node | single-node 
    */
  var TargetClusterType: js.UndefOr[String] = js.native
  /**
    * The type of encryption for the cluster after the resize is complete. Possible values are KMS and None. In the China region possible values are: Legacy and None.
    */
  var TargetEncryptionType: js.UndefOr[String] = js.native
  /**
    * The node type that the cluster will have after the resize operation is complete.
    */
  var TargetNodeType: js.UndefOr[String] = js.native
  /**
    * The number of nodes that the cluster will have after the resize operation is complete.
    */
  var TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.native
  /**
    * The estimated total amount of data, in megabytes, on the cluster before the resize operation began.
    */
  var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.native
}

object ResizeProgressMessage {
  @scala.inline
  def apply(): ResizeProgressMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeProgressMessage]
  }
  @scala.inline
  implicit class ResizeProgressMessageOps[Self <: ResizeProgressMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvgResizeRateInMegaBytesPerSecond(value: DoubleOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvgResizeRateInMegaBytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvgResizeRateInMegaBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvgResizeRateInMegaBytesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTransferProgressPercent(value: DoubleOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferProgressPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransferProgressPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferProgressPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withElapsedTimeInSeconds(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTimeToCompletionInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedTimeToCompletionInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTimeToCompletionInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTablesCompleted(value: ImportTablesCompleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTablesCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTablesCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTablesCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTablesInProgress(value: ImportTablesInProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTablesInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTablesInProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTablesInProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTablesNotStarted(value: ImportTablesNotStarted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTablesNotStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTablesNotStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTablesNotStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressInMegaBytes(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressInMegaBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetClusterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetClusterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetClusterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetClusterType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetEncryptionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetEncryptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEncryptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetNodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNumberOfNodes(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetNumberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNumberOfNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetNumberOfNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResizeDataInMegaBytes(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalResizeDataInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResizeDataInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalResizeDataInMegaBytes")(js.undefined)
        ret
    }
  }
  
}


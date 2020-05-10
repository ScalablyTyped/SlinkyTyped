package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDestinationDescription extends js.Object {
  /**
    * The buffering options.
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.native
  /**
    * The Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The endpoint to use when communicating with the cluster. Kinesis Data Firehose uses either this ClusterEndpoint or the DomainARN field to send data to Amazon ES.
    */
  var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint] = js.native
  /**
    * The ARN of the Amazon ES domain. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces. Kinesis Data Firehose uses either ClusterEndpoint or DomainARN to send data to Amazon ES.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.native
  /**
    * The Elasticsearch index name.
    */
  var IndexName: js.UndefOr[ElasticsearchIndexName] = js.native
  /**
    * The Elasticsearch index rotation period
    */
  var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The Amazon ES retry options.
    */
  var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RoleARN] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.native
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.S3DestinationDescription] = js.native
  /**
    * The Elasticsearch type name. This applies to Elasticsearch 6.x and lower versions. For Elasticsearch 7.x, there's no value for TypeName.
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.native
}

object ElasticsearchDestinationDescription {
  @scala.inline
  def apply(): ElasticsearchDestinationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchDestinationDescription]
  }
  @scala.inline
  implicit class ElasticsearchDestinationDescriptionOps[Self <: ElasticsearchDestinationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferingHints(value: ElasticsearchBufferingHints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferingHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferingHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferingHints")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterEndpoint(value: ElasticsearchClusterEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainARN(value: ElasticsearchDomainARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainARN")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexName(value: ElasticsearchIndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexRotationPeriod(value: ElasticsearchIndexRotationPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexRotationPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexRotationPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexRotationPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingConfiguration(value: ProcessingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryOptions(value: ElasticsearchRetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BackupMode(value: ElasticsearchS3BackupMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BackupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BackupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DestinationDescription(value: S3DestinationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DestinationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DestinationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeName(value: ElasticsearchTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(js.undefined)
        ret
    }
  }
  
}


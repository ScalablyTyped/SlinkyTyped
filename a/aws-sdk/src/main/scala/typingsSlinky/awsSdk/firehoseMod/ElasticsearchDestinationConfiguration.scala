package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDestinationConfiguration extends js.Object {
  /**
    * The buffering options. If no value is specified, the default values for ElasticsearchBufferingHints are used.
    */
  var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.native
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN field.
    */
  var ClusterEndpoint: js.UndefOr[ElasticsearchClusterEndpoint] = js.native
  /**
    * The ARN of the Amazon ES domain. The IAM role must have permissions for DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming the role specified in RoleARN. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces. Specify either ClusterEndpoint or DomainARN.
    */
  var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.native
  /**
    * The Elasticsearch index name.
    */
  var IndexName: ElasticsearchIndexName = js.native
  /**
    * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the expiration of old data. For more information, see Index Rotation for the Amazon ES Destination. The default value is OneDay.
    */
  var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value is 300 (5 minutes).
    */
  var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES Configuration API and for indexing documents. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination and Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typingsSlinky.awsSdk.firehoseMod.RoleARN = js.native
  /**
    * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with elasticsearch-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with elasticsearch-failed/ appended to the prefix. For more information, see Amazon S3 Backup for the Amazon ES Destination. Default value is FailedDocumentsOnly.
    */
  var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.native
  /**
    * The configuration for the backup Amazon S3 location.
    */
  var S3Configuration: S3DestinationConfiguration = js.native
  /**
    * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error during run time. For Elasticsearch 7.x, don't specify a TypeName.
    */
  var TypeName: js.UndefOr[ElasticsearchTypeName] = js.native
}

object ElasticsearchDestinationConfiguration {
  @scala.inline
  def apply(IndexName: ElasticsearchIndexName, RoleARN: RoleARN, S3Configuration: S3DestinationConfiguration): ElasticsearchDestinationConfiguration = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDestinationConfiguration]
  }
  @scala.inline
  implicit class ElasticsearchDestinationConfigurationOps[Self <: ElasticsearchDestinationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: ElasticsearchIndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Configuration(value: S3DestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Configuration")(value.asInstanceOf[js.Any])
        ret
    }
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


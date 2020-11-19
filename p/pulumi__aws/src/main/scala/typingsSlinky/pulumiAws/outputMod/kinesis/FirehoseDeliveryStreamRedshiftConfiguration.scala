package typingsSlinky.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamRedshiftConfiguration extends js.Object {
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions = js.native
  
  /**
    * The jdbcurl of the redshift cluster.
    */
  var clusterJdbcurl: String = js.native
  
  /**
    * Copy options for copying the data from the s3 intermediate bucket into redshift, for example to change the default delimiter. For valid values, see the [AWS documentation](http://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
    */
  var copyOptions: js.UndefOr[String] = js.native
  
  /**
    * The data table columns that will be targeted by the copy command.
    */
  var dataTableColumns: js.UndefOr[String] = js.native
  
  /**
    * The name of the table in the redshift cluster that the s3 bucket will copy to.
    */
  var dataTableName: String = js.native
  
  /**
    * The password for the username above.
    */
  var password: String = js.native
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration] = js.native
  
  /**
    * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var retryDuration: js.UndefOr[Double] = js.native
  
  /**
    * The arn of the role the stream assumes.
    */
  var roleArn: String = js.native
  
  /**
    * The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
    */
  var s3BackupConfiguration: js.UndefOr[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration] = js.native
  
  /**
    * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
    */
  var s3BackupMode: js.UndefOr[String] = js.native
  
  /**
    * The username that the firehose delivery stream will assume. It is strongly recommended that the username and password provided is used exclusively for Amazon Kinesis Firehose purposes, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.
    */
  var username: String = js.native
}
object FirehoseDeliveryStreamRedshiftConfiguration {
  
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions,
    clusterJdbcurl: String,
    dataTableName: String,
    password: String,
    roleArn: String,
    username: String
  ): FirehoseDeliveryStreamRedshiftConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], clusterJdbcurl = clusterJdbcurl.asInstanceOf[js.Any], dataTableName = dataTableName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationOps[Self <: FirehoseDeliveryStreamRedshiftConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterJdbcurl(value: String): Self = this.set("clusterJdbcurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTableName(value: String): Self = this.set("dataTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyOptions(value: String): Self = this.set("copyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyOptions: Self = this.set("copyOptions", js.undefined)
    
    @scala.inline
    def setDataTableColumns(value: String): Self = this.set("dataTableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTableColumns: Self = this.set("dataTableColumns", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration): Self = this.set("processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("processingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Double): Self = this.set("retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDuration: Self = this.set("retryDuration", js.undefined)
    
    @scala.inline
    def setS3BackupConfiguration(value: FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration): Self = this.set("s3BackupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupConfiguration: Self = this.set("s3BackupConfiguration", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: String): Self = this.set("s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("s3BackupMode", js.undefined)
  }
}

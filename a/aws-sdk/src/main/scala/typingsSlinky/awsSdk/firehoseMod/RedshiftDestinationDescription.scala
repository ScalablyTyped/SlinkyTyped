package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDestinationDescription extends StObject {
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: typingsSlinky.awsSdk.firehoseMod.ClusterJDBCURL = js.native
  
  /**
    * The COPY command.
    */
  var CopyCommand: typingsSlinky.awsSdk.firehoseMod.CopyCommand = js.native
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typingsSlinky.awsSdk.firehoseMod.RoleARN = js.native
  
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.native
  
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  
  /**
    * The Amazon S3 destination.
    */
  var S3DestinationDescription: typingsSlinky.awsSdk.firehoseMod.S3DestinationDescription = js.native
  
  /**
    * The name of the user.
    */
  var Username: typingsSlinky.awsSdk.firehoseMod.Username = js.native
}
object RedshiftDestinationDescription {
  
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    RoleARN: RoleARN,
    S3DestinationDescription: S3DestinationDescription,
    Username: Username
  ): RedshiftDestinationDescription = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL.asInstanceOf[js.Any], CopyCommand = CopyCommand.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3DestinationDescription = S3DestinationDescription.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationDescription]
  }
  
  @scala.inline
  implicit class RedshiftDestinationDescriptionMutableBuilder[Self <: RedshiftDestinationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterJDBCURL(value: ClusterJDBCURL): Self = StObject.set(x, "ClusterJDBCURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyCommand(value: CopyCommand): Self = StObject.set(x, "CopyCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryOptions(value: RedshiftRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3BackupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupDescriptionUndefined: Self = StObject.set(x, "S3BackupDescription", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: RedshiftS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}

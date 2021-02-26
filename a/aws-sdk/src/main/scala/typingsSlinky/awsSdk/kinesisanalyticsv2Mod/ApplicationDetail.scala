package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDetail extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  
  /**
    * Provides details about the application's Java, SQL, or Scala code and starting parameters.
    */
  var ApplicationConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationConfigurationDescription] = js.native
  
  /**
    * The description of the application.
    */
  var ApplicationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationDescription] = js.native
  
  /**
    * The name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * The status of the application.
    */
  var ApplicationStatus: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationStatus = js.native
  
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  
  /**
    * Describes the application Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.native
  
  /**
    * The current timestamp when the application was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The current timestamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The runtime environment for the application (SQL-1.0, FLINK-1_6, or FLINK-1_8).
    */
  var RuntimeEnvironment: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment = js.native
  
  /**
    * Specifies the IAM role that the application uses to access external resources.
    */
  var ServiceExecutionRole: js.UndefOr[RoleARN] = js.native
}
object ApplicationDetail {
  
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
  
  @scala.inline
  implicit class ApplicationDetailMutableBuilder[Self <: ApplicationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationConfigurationDescription(value: ApplicationConfigurationDescription): Self = StObject.set(x, "ApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "ApplicationConfigurationDescription", js.undefined)
    
    @scala.inline
    def setApplicationDescription(value: ApplicationDescription): Self = StObject.set(x, "ApplicationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationDescriptionUndefined: Self = StObject.set(x, "ApplicationDescription", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCreateTimestamp(value: js.Date): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdateTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setRuntimeEnvironment(value: RuntimeEnvironment): Self = StObject.set(x, "RuntimeEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceExecutionRole(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceExecutionRoleUndefined: Self = StObject.set(x, "ServiceExecutionRole", js.undefined)
  }
}

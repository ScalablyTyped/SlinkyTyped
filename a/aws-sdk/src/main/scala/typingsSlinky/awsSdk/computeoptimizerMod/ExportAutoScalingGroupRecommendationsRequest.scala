package typingsSlinky.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAutoScalingGroupRecommendationsRequest extends StObject {
  
  /**
    * The IDs of the AWS accounts for which to export Auto Scaling group recommendations. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to export recommendations. This parameter cannot be specified together with the include member accounts parameter. The parameters are mutually exclusive. Recommendations for member accounts are not included in the export if this parameter, or the include member accounts parameter, is omitted. You can specify multiple account IDs per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  
  /**
    * The recommendations data to include in the export file. For more information about the fields that can be exported, see Exported files in the Compute Optimizer User Guide.
    */
  var fieldsToExport: js.UndefOr[ExportableAutoScalingGroupFields] = js.native
  
  /**
    * The format of the export file. The only export file format currently supported is Csv.
    */
  var fileFormat: js.UndefOr[FileFormat] = js.native
  
  /**
    * An array of objects that describe a filter to export a more specific set of Auto Scaling group recommendations.
    */
  var filters: js.UndefOr[Filters] = js.native
  
  /**
    * Indicates whether to include recommendations for resources in all member accounts of the organization if your account is the master account of an organization. The member accounts must also be opted in to Compute Optimizer. Recommendations for member accounts of the organization are not included in the export file if this parameter is omitted. This parameter cannot be specified together with the account IDs parameter. The parameters are mutually exclusive. Recommendations for member accounts are not included in the export if this parameter, or the account IDs parameter, is omitted.
    */
  var includeMemberAccounts: js.UndefOr[IncludeMemberAccounts] = js.native
  
  /**
    * An object to specify the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for the export job. You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see Amazon S3 Bucket Policy for Compute Optimizer in the Compute Optimizer user guide.
    */
  var s3DestinationConfig: S3DestinationConfig = js.native
}
object ExportAutoScalingGroupRecommendationsRequest {
  
  @scala.inline
  def apply(s3DestinationConfig: S3DestinationConfig): ExportAutoScalingGroupRecommendationsRequest = {
    val __obj = js.Dynamic.literal(s3DestinationConfig = s3DestinationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAutoScalingGroupRecommendationsRequest]
  }
  
  @scala.inline
  implicit class ExportAutoScalingGroupRecommendationsRequestMutableBuilder[Self <: ExportAutoScalingGroupRecommendationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    @scala.inline
    def setFieldsToExport(value: ExportableAutoScalingGroupFields): Self = StObject.set(x, "fieldsToExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsToExportUndefined: Self = StObject.set(x, "fieldsToExport", js.undefined)
    
    @scala.inline
    def setFieldsToExportVarargs(value: ExportableAutoScalingGroupField*): Self = StObject.set(x, "fieldsToExport", js.Array(value :_*))
    
    @scala.inline
    def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setIncludeMemberAccounts(value: IncludeMemberAccounts): Self = StObject.set(x, "includeMemberAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMemberAccountsUndefined: Self = StObject.set(x, "includeMemberAccounts", js.undefined)
    
    @scala.inline
    def setS3DestinationConfig(value: S3DestinationConfig): Self = StObject.set(x, "s3DestinationConfig", value.asInstanceOf[js.Any])
  }
}

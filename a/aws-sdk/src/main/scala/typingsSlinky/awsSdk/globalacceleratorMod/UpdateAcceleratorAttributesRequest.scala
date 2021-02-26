package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAcceleratorAttributesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator that you want to update.
    */
  var AcceleratorArn: GenericString = js.native
  
  /**
    * Update whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow Logs in the AWS Global Accelerator Developer Guide.
    */
  var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants AWS Global Accelerator permission to write to the bucket.
    */
  var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.native
  
  /**
    * Update the prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true.  If you don’t specify a prefix, the flow logs are stored in the root of the bucket. If you specify slash (/) for the S3 bucket prefix, the log file bucket folder structure will include a double slash (//), like the following: s3-bucket_name//AWSLogs/aws_account_id
    */
  var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.native
}
object UpdateAcceleratorAttributesRequest {
  
  @scala.inline
  def apply(AcceleratorArn: GenericString): UpdateAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorAttributesRequest]
  }
  
  @scala.inline
  implicit class UpdateAcceleratorAttributesRequestMutableBuilder[Self <: UpdateAcceleratorAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogsEnabled(value: GenericBoolean): Self = StObject.set(x, "FlowLogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogsEnabledUndefined: Self = StObject.set(x, "FlowLogsEnabled", js.undefined)
    
    @scala.inline
    def setFlowLogsS3Bucket(value: GenericString): Self = StObject.set(x, "FlowLogsS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogsS3BucketUndefined: Self = StObject.set(x, "FlowLogsS3Bucket", js.undefined)
    
    @scala.inline
    def setFlowLogsS3Prefix(value: GenericString): Self = StObject.set(x, "FlowLogsS3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogsS3PrefixUndefined: Self = StObject.set(x, "FlowLogsS3Prefix", js.undefined)
  }
}

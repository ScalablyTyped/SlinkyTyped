package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationS3Response extends StObject {
  
  /**
    * If you are using DataSync on an AWS Outpost, the Amazon Resource Name (ARNs) of the EC2 agents deployed on your Outpost. For more information about launching a DataSync agent on an AWS Outpost, see outposts-agent.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.native
  
  /**
    * The time that the Amazon S3 bucket location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket or access point.
    */
  var LocationArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationArn] = js.native
  
  /**
    * The URL of the Amazon S3 location that was described.
    */
  var LocationUri: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationUri] = js.native
  
  var S3Config: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.S3Config] = js.native
  
  /**
    * The Amazon S3 storage class that you chose to store your files in when this location is used as a task destination. For more information about S3 storage classes, see Amazon S3 Storage Classes. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see using-storage-classes.
    */
  var S3StorageClass: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.S3StorageClass] = js.native
}
object DescribeLocationS3Response {
  
  @scala.inline
  def apply(): DescribeLocationS3Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationS3Response]
  }
  
  @scala.inline
  implicit class DescribeLocationS3ResponseMutableBuilder[Self <: DescribeLocationS3Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    @scala.inline
    def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ConfigUndefined: Self = StObject.set(x, "S3Config", js.undefined)
    
    @scala.inline
    def setS3StorageClass(value: S3StorageClass): Self = StObject.set(x, "S3StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3StorageClassUndefined: Self = StObject.set(x, "S3StorageClass", js.undefined)
  }
}

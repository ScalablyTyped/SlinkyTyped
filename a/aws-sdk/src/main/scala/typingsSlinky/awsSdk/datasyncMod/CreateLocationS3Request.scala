package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocationS3Request extends js.Object {
  
  /**
    * If you are using DataSync on an AWS Outpost, specify the Amazon Resource Names (ARNs) of the DataSync agents deployed on your Outpost. For more information about launching a DataSync agent on an AWS Outpost, see outposts-agent.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.native
  
  /**
    * The ARN of the Amazon S3 bucket. If the bucket is on an AWS Outpost, this must be an access point ARN.
    */
  var S3BucketArn: typingsSlinky.awsSdk.datasyncMod.S3BucketArn = js.native
  
  var S3Config: typingsSlinky.awsSdk.datasyncMod.S3Config = js.native
  
  /**
    * The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. For buckets in AWS Regions, the storage class defaults to Standard. For buckets on AWS Outposts, the storage class defaults to AWS S3 Outposts. For more information about S3 storage classes, see Amazon S3 Storage Classes. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see using-storage-classes.
    */
  var S3StorageClass: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.S3StorageClass] = js.native
  
  /**
    * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
    */
  var Subdirectory: js.UndefOr[S3Subdirectory] = js.native
  
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[InputTagList] = js.native
}
object CreateLocationS3Request {
  
  @scala.inline
  def apply(S3BucketArn: S3BucketArn, S3Config: S3Config): CreateLocationS3Request = {
    val __obj = js.Dynamic.literal(S3BucketArn = S3BucketArn.asInstanceOf[js.Any], S3Config = S3Config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationS3Request]
  }
  
  @scala.inline
  implicit class CreateLocationS3RequestOps[Self <: CreateLocationS3Request] (val x: Self) extends AnyVal {
    
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
    def setS3BucketArn(value: S3BucketArn): Self = this.set("S3BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Config(value: S3Config): Self = this.set("S3Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = this.set("AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = this.set("AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentArns: Self = this.set("AgentArns", js.undefined)
    
    @scala.inline
    def setS3StorageClass(value: S3StorageClass): Self = this.set("S3StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3StorageClass: Self = this.set("S3StorageClass", js.undefined)
    
    @scala.inline
    def setSubdirectory(value: S3Subdirectory): Self = this.set("Subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdirectory: Self = this.set("Subdirectory", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: InputTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}

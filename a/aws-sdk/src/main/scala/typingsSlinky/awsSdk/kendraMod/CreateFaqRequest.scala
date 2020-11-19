package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFaqRequest extends js.Object {
  
  /**
    * A description of the FAQ.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Description] = js.native
  
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
  
  /**
    * The name that should be associated with the FAQ.
    */
  var Name: FaqName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: typingsSlinky.awsSdk.kendraMod.RoleArn = js.native
  
  /**
    * The S3 location of the FAQ input data.
    */
  var S3Path: typingsSlinky.awsSdk.kendraMod.S3Path = js.native
  
  /**
    * A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateFaqRequest {
  
  @scala.inline
  def apply(IndexId: IndexId, Name: FaqName, RoleArn: RoleArn, S3Path: S3Path): CreateFaqRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Path = S3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFaqRequest]
  }
  
  @scala.inline
  implicit class CreateFaqRequestOps[Self <: CreateFaqRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FaqName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Path(value: S3Path): Self = this.set("S3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}

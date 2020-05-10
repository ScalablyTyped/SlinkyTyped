package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
    
    */
  var ResourceArn: string = js.native
  /**
    * 
    Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
    
    
    Each tag key must be unique. If you add a tag with a key that's already in
    use, your new tag overwrites the existing key-value pair. 
    
    
    You can't start a tag key with aws: because this prefix is reserved for use
    by  AWS.  AWS creates tags that begin with this prefix on your behalf, but
    you can't edit or delete them.
    
    
    Tag keys must be between 1 and 128 Unicode characters in length.
    
    
    Tag keys must consist of the following characters: Unicode letters, digits,
    white space, and the following special characters: _ . / = + -
    @.
    
    
    
    */
  var TagKeys: listOfString = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: string, TagKeys: listOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  @scala.inline
  implicit class UntagResourceRequestOps[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagKeys(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the identity pool to assign the tags to.
    */
  var ResourceArn: ARNString = js.native
  
  /**
    * The tags to assign to the identity pool.
    */
  var Tags: IdentityPoolTagsType = js.native
}
object TagResourceInput {
  
  @scala.inline
  def apply(ResourceArn: ARNString, Tags: IdentityPoolTagsType): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @scala.inline
  implicit class TagResourceInputOps[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
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
    def setResourceArn(value: ARNString): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: IdentityPoolTagsType): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
}

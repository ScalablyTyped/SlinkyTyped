package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceInput extends StObject {
  
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN = js.native
  
  /**
    * A list of keys to identify which key-value tags to remove from a resource.
    */
  var TagKeyList: typingsSlinky.awsSdk.backupMod.TagKeyList = js.native
}
object UntagResourceInput {
  
  @scala.inline
  def apply(ResourceArn: ARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit class UntagResourceInputMutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = StObject.set(x, "TagKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyListVarargs(value: String*): Self = StObject.set(x, "TagKeyList", js.Array(value :_*))
  }
}

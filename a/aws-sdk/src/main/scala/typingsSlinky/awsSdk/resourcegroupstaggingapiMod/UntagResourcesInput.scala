package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourcesInput extends StObject {
  
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceARNList: typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ResourceARNList = js.native
  
  /**
    * A list of the tag keys that you want to remove from the specified resources.
    */
  var TagKeys: TagKeyListForUntag = js.native
}
object UntagResourcesInput {
  
  @scala.inline
  def apply(ResourceARNList: ResourceARNList, TagKeys: TagKeyListForUntag): UntagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourcesInput]
  }
  
  @scala.inline
  implicit class UntagResourcesInputMutableBuilder[Self <: UntagResourcesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARNList(value: ResourceARNList): Self = StObject.set(x, "ResourceARNList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceARNList", js.Array(value :_*))
    
    @scala.inline
    def setTagKeys(value: TagKeyListForUntag): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}

package typingsSlinky.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel to which you want to add tags.
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisvideoMod.ResourceARN = js.native
  
  /**
    * A list of tags to associate with the specified signaling channel. Each tag is a key-value pair.
    */
  var Tags: TagList = js.native
}
object TagResourceInput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @scala.inline
  implicit class TagResourceInputMutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

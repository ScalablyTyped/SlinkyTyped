package typingsSlinky.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsOutput extends StObject {
  
  /**
    * The ID of the tagged ML object.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  
  /**
    * The type of the tagged ML object.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
  
  /**
    * A list of tags associated with the ML object.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object DescribeTagsOutput {
  
  @scala.inline
  def apply(): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsOutput]
  }
  
  @scala.inline
  implicit class DescribeTagsOutputMutableBuilder[Self <: DescribeTagsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: EntityId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: TaggableResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

package typingsSlinky.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDiscovererResponse extends StObject {
  
  /**
    * The description of the discoverer.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the discoverer.
    */
  var DiscovererArn: js.UndefOr[string] = js.native
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the event bus.
    */
  var SourceArn: js.UndefOr[string] = js.native
  
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
  
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.schemasMod.Tags] = js.native
}
object UpdateDiscovererResponse {
  
  @scala.inline
  def apply(): UpdateDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDiscovererResponse]
  }
  
  @scala.inline
  implicit class UpdateDiscovererResponseMutableBuilder[Self <: UpdateDiscovererResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDiscovererArn(value: string): Self = StObject.set(x, "DiscovererArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovererArnUndefined: Self = StObject.set(x, "DiscovererArn", js.undefined)
    
    @scala.inline
    def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovererIdUndefined: Self = StObject.set(x, "DiscovererId", js.undefined)
    
    @scala.inline
    def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setState(value: DiscovererState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

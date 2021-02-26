package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactFlowRequest extends StObject {
  
  /**
    * The content of the contact flow. 
    */
  var Content: ContactFlowContent = js.native
  
  /**
    * The description of the contact flow. 
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The name of the contact flow.
    */
  var Name: ContactFlowName = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The type of the contact flow. For descriptions of the available types, see Choose a Contact Flow Type in the Amazon Connect Administrator Guide.
    */
  var Type: ContactFlowType = js.native
}
object CreateContactFlowRequest {
  
  @scala.inline
  def apply(Content: ContactFlowContent, InstanceId: InstanceId, Name: ContactFlowName, Type: ContactFlowType): CreateContactFlowRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactFlowRequest]
  }
  
  @scala.inline
  implicit class CreateContactFlowRequestMutableBuilder[Self <: CreateContactFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ContactFlowContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ContactFlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setType(value: ContactFlowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

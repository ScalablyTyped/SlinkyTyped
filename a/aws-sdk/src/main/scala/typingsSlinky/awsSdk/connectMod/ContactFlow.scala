package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactFlow extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The content of the contact flow.
    */
  var Content: js.UndefOr[ContactFlowContent] = js.native
  
  /**
    * The description of the contact flow.
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.native
  
  /**
    * The identifier of the contact flow.
    */
  var Id: js.UndefOr[ContactFlowId] = js.native
  
  /**
    * The name of the contact flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The type of the contact flow. For descriptions of the available types, see Choose a Contact Flow Type in the Amazon Connect Administrator Guide.
    */
  var Type: js.UndefOr[ContactFlowType] = js.native
}
object ContactFlow {
  
  @scala.inline
  def apply(): ContactFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFlow]
  }
  
  @scala.inline
  implicit class ContactFlowMutableBuilder[Self <: ContactFlow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setContent(value: ContactFlowContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setDescription(value: ContactFlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: ContactFlowId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setType(value: ContactFlowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

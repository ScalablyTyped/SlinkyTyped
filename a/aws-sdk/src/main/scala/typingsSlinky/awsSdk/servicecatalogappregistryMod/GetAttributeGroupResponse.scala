package typingsSlinky.awsSdk.servicecatalogappregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAttributeGroupResponse extends js.Object {
  
  /**
    * The Amazon resource name (ARN) that specifies the attribute group across services.
    */
  var arn: js.UndefOr[AttributeGroupArn] = js.native
  
  /**
    * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an application and its components.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The ISO-8601 formatted timestamp of the moment the attribute group was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the attribute group that the user provides.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The identifier of the attribute group.
    */
  var id: js.UndefOr[AttributeGroupId] = js.native
  
  /**
    * The ISO-8601 formatted timestamp of the moment the attribute group was last updated. This time is the same as the creationTime for a newly created attribute group.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the attribute group.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * Key-value pairs associated with the attribute group.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object GetAttributeGroupResponse {
  
  @scala.inline
  def apply(): GetAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeGroupResponse]
  }
  
  @scala.inline
  implicit class GetAttributeGroupResponseOps[Self <: GetAttributeGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: AttributeGroupArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: AttributeGroupId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: js.Date): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedResource extends js.Object {
  
  /**
    * Other information about the resource.
    */
  var additionalInfo: js.UndefOr[StringMap] = js.native
  
  /**
    * Information that identifies the resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}
object RelatedResource {
  
  @scala.inline
  def apply(): RelatedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedResource]
  }
  
  @scala.inline
  implicit class RelatedResourceOps[Self <: RelatedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalInfo(value: StringMap): Self = this.set("additionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("additionalInfo", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = this.set("resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("resourceIdentifier", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}

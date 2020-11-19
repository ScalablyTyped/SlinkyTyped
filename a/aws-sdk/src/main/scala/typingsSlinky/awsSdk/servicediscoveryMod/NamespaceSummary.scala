package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Arn] = js.native
  
  /**
    * The date and time that the namespace was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * The ID of the namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted zone that has the same name as the namespace.
    */
  var Name: js.UndefOr[NamespaceName] = js.native
  
  var Properties: js.UndefOr[NamespaceProperties] = js.native
  
  /**
    * The number of services that were created using the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.native
  
  /**
    * The type of the namespace, either public or private.
    */
  var Type: js.UndefOr[NamespaceType] = js.native
}
object NamespaceSummary {
  
  @scala.inline
  def apply(): NamespaceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceSummary]
  }
  
  @scala.inline
  implicit class NamespaceSummaryOps[Self <: NamespaceSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: NamespaceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProperties(value: NamespaceProperties): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("Properties", js.undefined)
    
    @scala.inline
    def setServiceCount(value: ResourceCount): Self = this.set("ServiceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCount: Self = this.set("ServiceCount", js.undefined)
    
    @scala.inline
    def setType(value: NamespaceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}

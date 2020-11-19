package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends js.Object {
  
  /**
    * The tag key.
    */
  var Key: TagKey = js.native
  
  /**
    * Determines whether the tag is added to new instances as they are launched in the group.
    */
  var PropagateAtLaunch: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.PropagateAtLaunch] = js.native
  
  /**
    * The name of the group.
    */
  var ResourceId: js.UndefOr[XmlString] = js.native
  
  /**
    * The type of resource. The only supported value is auto-scaling-group.
    */
  var ResourceType: js.UndefOr[XmlString] = js.native
  
  /**
    * The tag value.
    */
  var Value: js.UndefOr[TagValue] = js.native
}
object Tag {
  
  @scala.inline
  def apply(Key: TagKey): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
    
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
    def setKey(value: TagKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagateAtLaunch(value: PropagateAtLaunch): Self = this.set("PropagateAtLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagateAtLaunch: Self = this.set("PropagateAtLaunch", js.undefined)
    
    @scala.inline
    def setResourceId(value: XmlString): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: XmlString): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setValue(value: TagValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}

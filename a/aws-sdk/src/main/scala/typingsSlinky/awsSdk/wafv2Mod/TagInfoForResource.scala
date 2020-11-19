package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagInfoForResource extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceARN: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The array of Tag objects defined for the resource. 
    */
  var TagList: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.TagList] = js.native
}
object TagInfoForResource {
  
  @scala.inline
  def apply(): TagInfoForResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagInfoForResource]
  }
  
  @scala.inline
  implicit class TagInfoForResourceOps[Self <: TagInfoForResource] (val x: Self) extends AnyVal {
    
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
    def setResourceARN(value: ResourceArn): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
}

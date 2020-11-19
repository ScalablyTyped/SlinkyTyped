package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppsListRequest extends js.Object {
  
  /**
    * Specifies whether the list to retrieve is a default list owned by AWS Firewall Manager.
    */
  var DefaultList: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AWS Firewall Manager applications list that you want the details for.
    */
  var ListId: typingsSlinky.awsSdk.fmsMod.ListId = js.native
}
object GetAppsListRequest {
  
  @scala.inline
  def apply(ListId: ListId): GetAppsListRequest = {
    val __obj = js.Dynamic.literal(ListId = ListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsListRequest]
  }
  
  @scala.inline
  implicit class GetAppsListRequestOps[Self <: GetAppsListRequest] (val x: Self) extends AnyVal {
    
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
    def setListId(value: ListId): Self = this.set("ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultList(value: Boolean): Self = this.set("DefaultList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultList: Self = this.set("DefaultList", js.undefined)
  }
}

package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.Next
import typingsSlinky.pubnub.anon.TotalCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAllMetadataParameters extends js.Object {
  
  var filter: js.UndefOr[String] = js.native
  
  var include: js.UndefOr[TotalCount] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var page: js.UndefOr[Next] = js.native
  
  var sort: js.UndefOr[js.Object] = js.native
}
object GetAllMetadataParameters {
  
  @scala.inline
  def apply(): GetAllMetadataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAllMetadataParameters]
  }
  
  @scala.inline
  implicit class GetAllMetadataParametersOps[Self <: GetAllMetadataParameters] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setInclude(value: TotalCount): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPage(value: Next): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}

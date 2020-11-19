package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTokenPagination extends js.Object {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var previousPageToken: js.UndefOr[String] = js.native
}
object SchemaTokenPagination {
  
  @scala.inline
  def apply(): SchemaTokenPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTokenPagination]
  }
  
  @scala.inline
  implicit class SchemaTokenPaginationOps[Self <: SchemaTokenPagination] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPreviousPageToken(value: String): Self = this.set("previousPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPageToken: Self = this.set("previousPageToken", js.undefined)
  }
}

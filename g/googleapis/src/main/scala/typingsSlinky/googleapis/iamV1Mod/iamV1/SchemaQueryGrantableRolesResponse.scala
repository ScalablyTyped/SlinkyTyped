package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The grantable role query response.
  */
@js.native
trait SchemaQueryGrantableRolesResponse extends js.Object {
  
  /**
    * To retrieve the next page of results, set
    * `QueryGrantableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of matching roles.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.native
}
object SchemaQueryGrantableRolesResponse {
  
  @scala.inline
  def apply(): SchemaQueryGrantableRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryGrantableRolesResponse]
  }
  
  @scala.inline
  implicit class SchemaQueryGrantableRolesResponseOps[Self <: SchemaQueryGrantableRolesResponse] (val x: Self) extends AnyVal {
    
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
    def setRolesVarargs(value: SchemaRole*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[SchemaRole]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
  }
}

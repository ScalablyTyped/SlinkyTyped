package typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse extends js.Object {
  
  /** The requested user links. */
  var userLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaUserLink]] = js.native
}
object GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponseOps[Self <: GoogleAnalyticsAdminV1alphaBatchGetUserLinksResponse] (val x: Self) extends AnyVal {
    
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
    def setUserLinksVarargs(value: GoogleAnalyticsAdminV1alphaUserLink*): Self = this.set("userLinks", js.Array(value :_*))
    
    @scala.inline
    def setUserLinks(value: js.Array[GoogleAnalyticsAdminV1alphaUserLink]): Self = this.set("userLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLinks: Self = this.set("userLinks", js.undefined)
  }
}

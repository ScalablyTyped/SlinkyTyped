package typingsSlinky.googleapis.urlshortenerV1Mod.urlshortenerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUrlGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Additional information to return.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * The short URL, including the protocol.
    */
  var shortUrl: js.UndefOr[String] = js.native
}
object ParamsResourceUrlGet {
  
  @scala.inline
  def apply(): ParamsResourceUrlGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlGet]
  }
  
  @scala.inline
  implicit class ParamsResourceUrlGetOps[Self <: ParamsResourceUrlGet] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setShortUrl(value: String): Self = this.set("shortUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortUrl: Self = this.set("shortUrl", js.undefined)
  }
}

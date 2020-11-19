package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUrlcrawlerrorssamplesMarkasfixed extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The crawl error category. For example: authPermissions
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * The user agent type (platform) that made the request. For example: web
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * The site's URL, including protocol. For example: http://www.example.com/
    */
  var siteUrl: js.UndefOr[String] = js.native
  
  /**
    * The relative path (without the site) of the sample URL. It must be one of
    * the URLs returned by list(). For example, for the URL
    * https://www.example.com/pagename on the site https://www.example.com/,
    * the url value is pagename
    */
  var url: js.UndefOr[String] = js.native
}
object ParamsResourceUrlcrawlerrorssamplesMarkasfixed {
  
  @scala.inline
  def apply(): ParamsResourceUrlcrawlerrorssamplesMarkasfixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlcrawlerrorssamplesMarkasfixed]
  }
  
  @scala.inline
  implicit class ParamsResourceUrlcrawlerrorssamplesMarkasfixedOps[Self <: ParamsResourceUrlcrawlerrorssamplesMarkasfixed] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setSiteUrl(value: String): Self = this.set("siteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteUrl: Self = this.set("siteUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

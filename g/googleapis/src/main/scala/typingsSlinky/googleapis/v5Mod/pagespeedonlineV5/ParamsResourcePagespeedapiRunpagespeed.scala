package typingsSlinky.googleapis.v5Mod.pagespeedonlineV5

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePagespeedapiRunpagespeed extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A Lighthouse category to run; if none are given, only Performance
    * category will be run
    */
  var category: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The locale used to localize formatted results
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The analysis strategy (desktop or mobile) to use, and desktop is the
    * default
    */
  var strategy: js.UndefOr[String] = js.native
  
  /**
    * The URL to fetch and analyze
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Campaign name for analytics.
    */
  var utm_campaign: js.UndefOr[String] = js.native
  
  /**
    * Campaign source for analytics.
    */
  var utm_source: js.UndefOr[String] = js.native
}
object ParamsResourcePagespeedapiRunpagespeed {
  
  @scala.inline
  def apply(): ParamsResourcePagespeedapiRunpagespeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagespeedapiRunpagespeed]
  }
  
  @scala.inline
  implicit class ParamsResourcePagespeedapiRunpagespeedOps[Self <: ParamsResourcePagespeedapiRunpagespeed] (val x: Self) extends AnyVal {
    
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
    def setCategoryVarargs(value: String*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[String]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setStrategy(value: String): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUtm_campaign(value: String): Self = this.set("utm_campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtm_campaign: Self = this.set("utm_campaign", js.undefined)
    
    @scala.inline
    def setUtm_source(value: String): Self = this.set("utm_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtm_source: Self = this.set("utm_source", js.undefined)
  }
}

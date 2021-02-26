package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceV1Getlinkstats extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The span of time requested in days.
    */
  var durationDays: js.UndefOr[String] = js.native
  
  /**
    * Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
    */
  var dynamicLink: js.UndefOr[String] = js.native
  
  /**
    * Google SDK version. Version takes the form "$major.$minor.$patch"
    */
  var sdkVersion: js.UndefOr[String] = js.native
}
object ParamsResourceV1Getlinkstats {
  
  @scala.inline
  def apply(): ParamsResourceV1Getlinkstats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Getlinkstats]
  }
  
  @scala.inline
  implicit class ParamsResourceV1GetlinkstatsMutableBuilder[Self <: ParamsResourceV1Getlinkstats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDurationDays(value: String): Self = StObject.set(x, "durationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationDaysUndefined: Self = StObject.set(x, "durationDays", js.undefined)
    
    @scala.inline
    def setDynamicLink(value: String): Self = StObject.set(x, "dynamicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinkUndefined: Self = StObject.set(x, "dynamicLink", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}

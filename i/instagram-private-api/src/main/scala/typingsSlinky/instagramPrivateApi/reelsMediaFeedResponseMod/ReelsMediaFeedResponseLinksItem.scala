package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseLinksItem extends StObject {
  
  @JSName("package")
  var _package: String = js.native
  
  var androidClass: String = js.native
  
  var appInstallObjectiveInvalidationBehavior: Null = js.native
  
  var callToActionTitle: String = js.native
  
  var deeplinkUri: String = js.native
  
  var igUserId: String = js.native
  
  var leadGenFormId: String = js.native
  
  var linkType: Double = js.native
  
  var redirectUri: Null = js.native
  
  var webUri: String = js.native
}
object ReelsMediaFeedResponseLinksItem {
  
  @scala.inline
  def apply(
    _package: String,
    androidClass: String,
    appInstallObjectiveInvalidationBehavior: Null,
    callToActionTitle: String,
    deeplinkUri: String,
    igUserId: String,
    leadGenFormId: String,
    linkType: Double,
    redirectUri: Null,
    webUri: String
  ): ReelsMediaFeedResponseLinksItem = {
    val __obj = js.Dynamic.literal(androidClass = androidClass.asInstanceOf[js.Any], appInstallObjectiveInvalidationBehavior = appInstallObjectiveInvalidationBehavior.asInstanceOf[js.Any], callToActionTitle = callToActionTitle.asInstanceOf[js.Any], deeplinkUri = deeplinkUri.asInstanceOf[js.Any], igUserId = igUserId.asInstanceOf[js.Any], leadGenFormId = leadGenFormId.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], webUri = webUri.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseLinksItem]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseLinksItemMutableBuilder[Self <: ReelsMediaFeedResponseLinksItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidClass(value: String): Self = StObject.set(x, "androidClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstallObjectiveInvalidationBehavior(value: Null): Self = StObject.set(x, "appInstallObjectiveInvalidationBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallToActionTitle(value: String): Self = StObject.set(x, "callToActionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeeplinkUri(value: String): Self = StObject.set(x, "deeplinkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgUserId(value: String): Self = StObject.set(x, "igUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadGenFormId(value: String): Self = StObject.set(x, "leadGenFormId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: Double): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUri(value: Null): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUri(value: String): Self = StObject.set(x, "webUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}

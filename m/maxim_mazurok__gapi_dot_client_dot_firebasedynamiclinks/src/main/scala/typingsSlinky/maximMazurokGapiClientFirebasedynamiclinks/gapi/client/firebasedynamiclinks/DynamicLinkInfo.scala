package typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicLinkInfo extends StObject {
  
  /** Parameters used for tracking. See all tracking parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-manually). */
  var analyticsInfo: js.UndefOr[AnalyticsInfo] = js.native
  
  /** Android related information. See Android related parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-manually). */
  var androidInfo: js.UndefOr[AndroidInfo] = js.native
  
  /** Desktop related information. See desktop related parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-manually). */
  var desktopInfo: js.UndefOr[DesktopInfo] = js.native
  
  /**
    * E.g. https://maps.app.goo.gl, https://maps.page.link, https://g.co/maps More examples can be found in description of getNormalizedUriPrefix in
    * j/c/g/firebase/dynamiclinks/uri/DdlDomain.java Will fallback to dynamic_link_domain is this field is missing
    */
  var domainUriPrefix: js.UndefOr[String] = js.native
  
  /**
    * Dynamic Links domain that the project owns, e.g. abcd.app.goo.gl [Learn more](https://firebase.google.com/docs/dynamic-links/android/receive) on how to set up Dynamic Link domain
    * associated with your Firebase project. Required if missing domain_uri_prefix.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  
  /** iOS related information. See iOS related parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-manually). */
  var iosInfo: js.UndefOr[IosInfo] = js.native
  
  /**
    * The link your app will open, You can specify any URL your app can handle. This link must be a well-formatted URL, be properly URL-encoded, and use the HTTP or HTTPS scheme. See
    * 'link' parameters in the [documentation](https://firebase.google.com/docs/dynamic-links/create-manually). Required.
    */
  var link: js.UndefOr[String] = js.native
  
  /** Information of navigation behavior of a Firebase Dynamic Links. */
  var navigationInfo: js.UndefOr[NavigationInfo] = js.native
  
  /** Parameters for social meta tag params. Used to set meta tag data for link previews on social sites. */
  var socialMetaTagInfo: js.UndefOr[SocialMetaTagInfo] = js.native
}
object DynamicLinkInfo {
  
  @scala.inline
  def apply(): DynamicLinkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkInfo]
  }
  
  @scala.inline
  implicit class DynamicLinkInfoMutableBuilder[Self <: DynamicLinkInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsInfo(value: AnalyticsInfo): Self = StObject.set(x, "analyticsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsInfoUndefined: Self = StObject.set(x, "analyticsInfo", js.undefined)
    
    @scala.inline
    def setAndroidInfo(value: AndroidInfo): Self = StObject.set(x, "androidInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidInfoUndefined: Self = StObject.set(x, "androidInfo", js.undefined)
    
    @scala.inline
    def setDesktopInfo(value: DesktopInfo): Self = StObject.set(x, "desktopInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopInfoUndefined: Self = StObject.set(x, "desktopInfo", js.undefined)
    
    @scala.inline
    def setDomainUriPrefix(value: String): Self = StObject.set(x, "domainUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUriPrefixUndefined: Self = StObject.set(x, "domainUriPrefix", js.undefined)
    
    @scala.inline
    def setDynamicLinkDomain(value: String): Self = StObject.set(x, "dynamicLinkDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinkDomainUndefined: Self = StObject.set(x, "dynamicLinkDomain", js.undefined)
    
    @scala.inline
    def setIosInfo(value: IosInfo): Self = StObject.set(x, "iosInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosInfoUndefined: Self = StObject.set(x, "iosInfo", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setNavigationInfo(value: NavigationInfo): Self = StObject.set(x, "navigationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationInfoUndefined: Self = StObject.set(x, "navigationInfo", js.undefined)
    
    @scala.inline
    def setSocialMetaTagInfo(value: SocialMetaTagInfo): Self = StObject.set(x, "socialMetaTagInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialMetaTagInfoUndefined: Self = StObject.set(x, "socialMetaTagInfo", js.undefined)
  }
}
